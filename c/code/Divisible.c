#include<stdio.h>
#include<conio.h>

void main()
{
    clrscr();
    int num, a = 2;

    printf("Enter the num==>");
    scanf("%d",&num);

    do {

        if(num%a == 0)
        {
            printf("\t%d\n",a);

        }
        a++;
    } while(num != a);

    getch();
}