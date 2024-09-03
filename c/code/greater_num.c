#include<stdio.h>
int main()
{
    int num1 , num2 , num3 ;
    
    printf("1st num:\n");
    scanf("%d" ,&num1);
    
    printf("2nd num:\n");
    scanf("%d" ,&num2);
    
    printf("3rd num:\n");
    scanf("%d" ,&num3);
    
    
    
    
    if (num1>(num2,num3) , (num1==num2==num3) )
    {
    printf("%d",num1);
    }
    
    else if (num2>(num1,num3))
    {
    printf("%d",num2);
    }
    
    else if (num3>(num1,num2))
    {
    printf("%d",num3);
    }
  
    
   
    return 0;
}