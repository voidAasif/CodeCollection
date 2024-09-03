#include<stdio.h>
int main()
{
// for find a leap year!!


    int year;
    
    printf("Enter the year:\n",year);
    scanf("%d", &year);
    
    
    if (year%4==0 && year%400==0)
    
    { printf("leap year:\n ");}
    
    else
    
    { printf("not a leap year:");}
    
    return 0;
    }