#include<stdio.h>

int main()
{
    int num , n = 0, sum = 0;
    
    printf("Enter the num:\n");
    scanf("%d",&num);
    
    
    while ( n<=num){
    
        printf("%d--->%d\n",n,sum); n++;
        
        sum+=n;
        
    }
    return 0;
}