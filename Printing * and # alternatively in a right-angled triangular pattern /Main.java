#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  int count=1;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(count%2==0)
        printf("#");
      else 
        printf("*");
      count++;
    }
    printf("\n");
  }
  return 0;
}