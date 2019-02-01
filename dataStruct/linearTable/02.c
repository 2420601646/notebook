#include <stdio.h>
#include <stdlib.h>
#define Size 5

typedef struct table{
  int* head;
  int length;
  int size;
}table;

table initTable();
void display(table t);
table insert(table t,int elem,int add);

int main(){
 table t = initTable();
 for(int i=0;i<Size;i++){
  t.head[i] = i+1;
  t.length++;
 }
 display(t);
 printf("----\n");
 t = insert(t,9,2);
 display(t);
 return 0;
}

table initTable(){
 table t;
 t.head = (int*)malloc(Size*sizeof(int));
 if(!t.head){
  printf("init table.head failed");
  exit(1);
 }
 t.length = 0;
 t.size = Size;
 return t;
}

void display(table t){
 for(int i=0;i<t.length;i++){
  printf("%d \n",t.head[i]);
 }
}

table insert(table t,int elem,int add){
 if(add < 0 || add > t.size+1){
  printf("add insert weizhi error");
  exit(1);
 }
 if(t.size == t.length){
  t.head = (int*)realloc(t.head,(t.size+1)*sizeof(int));
  if(!t.head){
   printf("realloc size error");
   exit(1);
  }
 }
 for(int i= t.length-1;i >= add-1;i--){
  t.head[i+1] = t.head[i];
 }
 t.head[add-1] = elem;
 t.length++;
 return t;
}
