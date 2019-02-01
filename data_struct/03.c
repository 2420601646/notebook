#include <stdio.h>
#include <stdlib.h>
#define Size 5

typedef struct Link{
 int elem;
 struct Link* next;
}link;

link* initLink();
void display(link* l);
int getElem(link* p,int elem);
void insert(link* p,int elem,int point);
void delete(link* p,int elem);

int main(){
 int index;
 link* l = initLink();
 display(l);
 //index = getElem(l,4);
 //printf("--->%d\n",index);
 insert(l,9,2);
 display(l);
 delete(l,9);
 display(l);
 
}

link* initLink(){
 link* p = (link*)malloc(sizeof(link));
 link* temp = p;
 for(int i=0;i<Size;i++){
   link* a = (link*)malloc(sizeof(link));
   a->elem = i;
   a->next = NULL;
   temp->next = a;
   temp = temp->next;
 }
 return p;
}

int getElem(link* p,int elem){
 int i = 0;
 while(p->next){
  p = p->next;
  if(p->elem == elem){
    return i;
  }
  i++;
 }
 return -1;
}

void insert(link* p,int elem,int point){
 link* temp = p;
 for(int i=0;i<point;i++){
  temp = temp->next;
 }
 link* a = (link*)malloc(sizeof(link));
 a->elem = elem;
 a->next = temp->next;
 temp->next = a;
}

void delete(link* p,int elem){
 int index;
 link* temp = p;
 index = getElem(p,elem);
 for(int i=0;i<index;i++){
  temp = temp->next;
 }
 temp->next = temp->next->next;
 free(temp->next);
}

void display(link* l){
 while(l->next){
  l = l->next;
  printf("%d ",l->elem);
 }
 printf("\n");
}

