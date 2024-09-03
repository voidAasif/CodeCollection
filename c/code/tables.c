#include<stdio.h>

int main()
{
    
 int num , a =0;

    printf("Enter the num:\n");
    scanf("%d",&num);
    
    while(a<=10){
    
     
        printf("%d × %d = %d\n\t",num,a,num*a);
        
       a++;
        
    }
    
    return 0;
}