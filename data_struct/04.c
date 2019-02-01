#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

typedef struct Cir{
 int num;
 struct Cir* next;
}cir;

cir* initCir();
void display(cir* p);

int main(){
 cir* p = initCir();
 display(p);
 return 0;
}

cir* initCir(){
 cir* p = (cir*)malloc(sizeof(cir));
 p->num = -1;
 cir* temp = p;
 for(int i=0;i<SIZE;i++){
  cir* a = (cir*)malloc(sizeof(cir));
  a->num = i;
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
