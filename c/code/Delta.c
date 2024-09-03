#include<stdio.h>
#include<conio.h>

void main()
{

    int a, b,t,c=0;


    for(b=1 ; b <=  5; b++)
    {
        c++;

        for(t=5; t>= b; t--)
        {
            printf(" ");

        }
        for(a=  1; a <= c ; a++ )
        {

            printf(" *");

        }


        printf("\n");
    }

}