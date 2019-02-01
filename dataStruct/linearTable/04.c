#include <stdio.h>
#include <stdlib.h>
#define SIZE 5

typedef struct Cir{
 int num;
 struct Cir* next;
}cir;

cir* initCir();
void display(cir* p);
void findAndKill(cir* p,int start,int out);

int main(){
 cir* p = initCir();
 display(p);
 findAndKill(p,2,2);
 return 0;
}

cir* initCir(){
 cir* p = (cir*)malloc(sizeof(cir));
 p->num = -1;
 cir* temp = p;
 for(int i=0;i<SIZE;i++){
  cir* a = (cir*)malloc(sizeof(cir));
  a->num = i+1;
  a->next = NULL;
  temp->next = a;
  temp = temp->next; 
 }
 temp->next = p;
 return p;
}

void display(cir* p){
 cir* head =  p;
 while(p->next && p->next != head){
  p = p->next;
  printf("%d ",p->num);
 }
 printf("\n");
}

/*
start：开始的编号
out: 数到需要出列的数
*/
void findAndKill(cir* p,int start,int out){
 cir* temp = p;
 for(int i=0;i<start;i++){
  temp = temp->next;
 }
 while(temp->next != temp){
  for(int i=0;i< out;i++){
   temp = temp->next;
  }
  cir* pop = temp->next;
  printf("出列元素：%d\n",pop->num);
  temp->next = pop->next;
  free(pop);
  temp = temp->next;
 }
 printf("剩余元素：%d\n",temp->num);
}
