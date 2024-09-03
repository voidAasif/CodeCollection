#include<stdio.h>
#include<conio.h>

void main()
{
    int i,j;
    int matrix[3][3];

    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            printf("enter the value of eleament %d-%d::",i+1,j+1);
            scanf("%d",&matrix[i][j]);
        }

        printf("\n");
    }

    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            printf("%d ",matrix[i][j]);
        }

        printf("\n");
    }
}