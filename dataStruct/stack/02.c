#include <stdio.h>
#include <stdlib.h>

typedef struct Strack{
 int data;
 struct Strack* next;
}strack;

void push(strack* head,int elem){
 strack* node = (strack*)malloc(sizeof(strack));
 node->data = elem;
 node->next = head->next;
 head->next = node;
}

void pop(strack* head){
 if(!head->next){
  printf("empty stract\n");
  exit(1);
 }
 printf("pop %d \n",head->next->data);
 head->next = head->next->next;
}

int main(){
 strack* head = (strack*)malloc(sizeof(strack));
 push(head,1);
 push(head,2);
 push(head,3);
 pop(head);
 pop(head);
 pop(head);
 pop(head);
 return 0;
}
