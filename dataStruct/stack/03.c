#include <stdio.h>
#include <stdlib.h>
#define STOPSIZE 3

typedef struct stayQueue{
 int no;
 struct stayQueue* next;
}stay;

int push(int* stoparr,int no,int top);
void display(int* stoparr);
void display2(stay* s);
int pop(int* stoparr,int top);

int main(){
 int stoparr[STOPSIZE];
 int temparr[STOPSIZE -1];
 stay* head = (stay*)malloc(sizeof(stay));
 head->next = NULL;
 stay* temp = head;
 int top = -1;
 for(int i= 1;i<= STOPSIZE+3;i++){
  if(i <= STOPSIZE){
   top = push(stoparr,i,top);
  }else{
   stay* s = (stay*)malloc(sizeof(stay));
   s->no = i;
   s->next = NULL;
   temp->next = s;
   temp = temp->next;
  }
 }
 display(stoparr);
 //display2(head);
 int pv = pop(stoparr,top);
 return 0;
}

int push(int* stoparr,int no,int top){
 stoparr[++top] = no;
 return top;
}

int pop(int* stoparr,int top){
 int pv = stoparr[top];
 top--;
 return pv;
}

void display(int* stoparr){
 printf("stoparr is:");
 for(int i=0;i<STOPSIZE;i++){
  printf(" %d ",stoparr[i]);
 }
 printf("\n");
}

void display2(stay* s){
 printf("stay is:");
 stay* temp = s;
 while(temp->next){
  temp = temp->next;
  printf(" %d ",temp->no);
 }
 printf("\n");
}



