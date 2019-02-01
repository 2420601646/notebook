#include <stdio.h>

void normal();
void speciall();

int main(){
 /* normal(); */
 speciall();
}

void normal(){
 int i;
 int sum = 0;
 for(i=1;i<=100;i++){
   sum += i;
 }
 printf("total sum is %d \n",sum);
}

void speciall(){
 /* 
 1......100 --sum
 100......1 --sum
 101....101 --2sum
 (101*100)/2 = 5050
 => (n*(n+1))/2
 */
 int sum = (100*(100+1))/2;
 printf("total sum is %d \n",sum);
}
