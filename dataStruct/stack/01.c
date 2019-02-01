#include <stdio.h>

int push(int* s,int elem,int top){
 s[++top] = elem;
 return top;
}

int pop(int* s,int top){
 if(top == -1){
  printf("empty stack\n");
  return -1;
 }
 printf("pop %d \n",s[top]);
 return --top;
}


int main(){
 int arr[100];
 int top = -1;
 top = push(arr,1,top);
 top = push(arr,2,top);
 top = push(arr,3,top);
 top = pop(arr,top);
 top = pop(arr,top);
 top = pop(arr,top);
 top = pop(arr,top);

 return 0;
}
