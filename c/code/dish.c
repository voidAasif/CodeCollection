#include<stdio.h>

int main()
{
    printf("(1) Paneer ==> 400\n(2) Chole ==> 200\n(3) daal ==> 100\n(4) bread ==> 50\n");
    
    
/*  Paneer  400
    chole   200
    daal    100
    bread   50
*/
    int a;
    int p = 400;
    int c = 200;
    int d = 100;
    int b = 50;
    
    printf("Number of dish and press enter:\n");
    scanf("%d",&a);

    

    if(a == 1) {
        printf("Choose dish:\n");
        printf("Avoid space,symbols and follow sequence:\n");
        int dish;
        scanf("%d",&dish);
        
        if(dish == 1){
            printf("200\n");
        }
        else if(dish == 2){
            printf("300\n");
        }
        else if(dish == 3){
            printf("400\n");
        }
        else if(dish == 4){
            printf("500\n");
        }
    
    }

    if(a == 2) {
        printf("Choose dish:\n");
        printf("Avoid space,symbols & follow sequence:\n");
        int dish;
        scanf("%d",&dish);
        
        if(dish == 12){
            printf("%d+%d = %d",p,c,p+c);
        }
        else if(dish == 13){
            printf("%d+%d = %d",p,d,p+d);
        }
        else if(dish == 14){
            printf("%d+%d = %d",p,b,p+b);
        }
        else if(dish == 23){
            printf("%d+%d = %d",c,d,c+d);
        }
        else if(dish == 24){
            printf("%d+%d = %d",c,b,c+b);
        }
        else if(dish == 34){
            printf("%d+%d = %d",d,b,d+b);
        }
    }

    if(a == 3) {
        printf("Choose dish:\n");
        printf("Avoid space,symbols & follow sequence:\n");
        int dish;
        scanf("%d",&dish);
        
        if(dish == 123){
            printf("%d+%d+%d = %d",p,c,d,p+c+d);
        }
        else if(dish == 134){
            printf("%d+%d+%d = %d",p,d,b,p+d+b);
        }
        else if(dish == 124){
            printf("%d+%d+%d = %d",p,c,b,p+c+b);
        }
        else if(dish == 234){
            printf("%d+%d+%d = %d",c,d,b,c+d+b);
        }

    }

    if(a == 4) {
        printf("Choose dish:\n");
        printf("Avoid space,symbols & follow sequence:\n");
        int dish;
        scanf("%d",&dish);
        
        if(dish == 1234){
            printf("%d+%d+%d+%d = %d",p,c,d,b,p+c+d+b);
        }
    }




    return 0;
}