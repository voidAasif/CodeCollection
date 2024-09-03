// pass_fail

#include<stdio.h>
int main(){ 

    printf("Enter your marks:\n");
    float H,E,M,S,ST,A;
    float per;
    
    printf("Hindi:\n");
    scanf("%f",&H);
    
     printf("English:\n");
     scanf("%f",&E);
    
     printf("Maths:\n");
     scanf("%f",&M);
    
     printf("Science:\n");
     scanf("%f",&S);
    
     printf("S.St:\n");
     scanf("%f",&ST);
    
     printf("Art:\n");
     scanf("%f",&A);
    
    per = (((H+E+M+S+ST+A)*100)/600);
    
    printf("Your percentage is %f",per);
    (per >= 33) ? printf("==>Pass\n") : printf("==>Fail\n");   
   
    
    return 0;
    
}