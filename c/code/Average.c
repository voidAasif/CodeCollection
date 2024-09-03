#include<stdio.h>

        //Average
        
int main(){
        
    float num , a , av , sum = 0.00;
    float result;
   
    printf("number of num:\n");
    scanf("%f %f",&num ,&a);
    
    
    do{
        printf("enter the num:\n");
        scanf("%f",&av);
        num--;
        sum += av;
        
    }while(num>=1);
    
    result = (sum / a) ;
    
    printf("--->%f",result);
    
return 0;
}   
    
    
 