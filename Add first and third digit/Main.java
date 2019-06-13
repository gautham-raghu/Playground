#include<stdio.h>
int main()
{
  //Type your code here
  int n,t1,a,b,c,sum;
  scanf("%d",&n);
   a=n/100;
      t1=n%100;
      b=t1%10;
      c=t1/10;
  sum=a+b;
  printf("%d",sum);
  return 0;
}