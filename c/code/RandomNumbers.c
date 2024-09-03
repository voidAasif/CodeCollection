/*#include <stdio.h>

//fibo.........0,1,1,2,3,5,8,13,21....

int fibo (int a);
int main(){
    int a = 5;
    printf("hi %d\n",fibo(a));
    
return 0;
}
int fibo(int a){
    if ( a==2 || a==3 ){
        return 1;
    }
    return ((a-1)+(a-2));
}*/


    #include<stdio.h>
    int main(){
        int a;
        srand(time(0));
      a =  rand()%9999999999+1000000000;
    printf("%d\n",a);
    return 0; 
    }