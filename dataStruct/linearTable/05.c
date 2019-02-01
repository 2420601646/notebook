#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 10

typedef struct Cir{
 int no;
 struct Cir* next;
}cir;

cir* initCir(){
 cir* head = (cir*)malloc(sizeof(cir));
 cir* temp = head;
 if(!head){
  printf("head init error");
  exit(1);
 }
 for(int i= 1;i<=SIZE;i++){
  cir* p = (cir*)malloc(sizeof(cir));
  p->no = i;
  p->next = NULL;
  temp->next = p;
  temp = temp->next;
 }
 temp->next = head;
 return head;
}

void display(cir* head){
 cir* temp = head;
 printf("现有元素为：");
 while(temp->next != head){
  temp = temp->next;
  printf("%d ",temp->no);
 }
 printf("\n");
}


int main(){
 cir* head = initCir();
 cir* temp = head;
 int randnum,shootnum,itemnum = SIZE;
//display(head);
 while(head->next->next != head){
  printf("randnum %d \n",randnum+1);
  srand((unsigned)time(0));
  shootnum = rand() % itemnum + 1;
  printf("delete %d \n",shootnum);
  for(int i=1;i<shootnum;i++){
   temp = temp->next;
  }
  if(temp->next == head){
   temp = head->next;
  }
  cir* del = temp->next;
  temp->next = del->next;
  temp = del->next;
  free(del);
  randnum++;
  itemnum--;
  display(head);
 }
 printf("late is %d \n",head->next->no);
}
