#include<stdio.h>

    int main()
{

  
    int A;
    char X;
    int B;
    float result;
    
    
    printf("Enter the first number:\n");

    scanf("%d",&A);

    
    printf("Enter the character:\n");
    scanf(" %c",&X);

    
    
    printf("Enter the second number:\n");

    scanf("%d",&B);
    
   
    switch(X)
    
{
    case'+' :
    
    result = A + B;
    
    printf("%f",result);  
    
   break;
    
    
    case'*':
    
    result = A*B;
    
    printf("%f",result);

   break;
    
    
    case'/':
    
    result = A/B;
    
   printf("%f",result);
    
   break;
    
    case'-':
    
    result = A-B;
    
    printf("%f",result);
    
   break;

    default:
 
   printf("Not valid\n");
    
    break;
     
}  
   
  
  
 return 0;
}