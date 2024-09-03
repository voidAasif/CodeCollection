#include<stdio.h>

float ans( int c );
int main(){
    int c;
    float F; 
    printf("Enter the value of C°\n");
    scanf("%d",&c);
    F = ans(c);
    printf("C into F = %f",F);
    
return 0;
}

float ans ( int c ){
    float result;
    result = ((( c)* (float) 1.8)+32);

return result;
}