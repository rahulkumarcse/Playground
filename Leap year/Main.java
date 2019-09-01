#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  int flag=0;
  scanf("%d",&n);
  if(n%400==0)
    flag=1;
  else if(n%100==0)
    flag=0;
  else if(n%4==0)
    flag=1;
  else
    flag=0;
  if(flag==0)
    printf("Not Leap year");
  else
    printf("Leap year");
  
  return 0;
}