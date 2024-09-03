#include<stdio.h>

int main()
{
    int A;
    
    printf("Enter your marks:\n");
    scanf("%d",&A);
    
    if (A>=90 && A<=100)
    
    {printf("grade A\n");}
    
    else if ( A >=80 && A<90)
    
    {printf("grade B\n");}
    
    else if (A>=70 && A<80)
    
    {printf("grade C\n");}
    
    else if (A>=60 && A<70)
    
    {printf("grade D\n");}
    
    else if (A<60)
    
    {printf("grade F\n");}
    
    else
    
    {printf("non\n");}
    
    return 0;
    }
    
    
    
    