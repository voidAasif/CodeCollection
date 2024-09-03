#include<stdio.h>

int main()
{
    int a, b, c;

    printf("1st num\n\t");
    scanf("%d",&a);

    printf("2nd num\n\t");
    scanf("%d",&b);

    printf("3rd num\n\t");
    scanf("%d",&c);

    if(a>b){
        if(a>c){
            printf("%d is big\n",a);
        }
        else{
            printf("%d is big\n",c);
        }
        }
    else if(b>c){
        printf("%d is big\n",b);
    }
    else{
        printf("%d is big\n",c);
    
    }
       

    return 0;
}