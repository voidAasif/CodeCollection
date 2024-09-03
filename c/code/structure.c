#include<stdio.h>
#include<conio.h>

struct student
{  
    int class[2];
    int roll[2];
    char name[10][10];
    float per[2];
};

void main()
{
    struct student s;
    int i;
    for(i=0;i<2;i++)
    {    
        printf("enter the class of student no (%d)\n",i+1);
        scanf("%d",&s.class[i]);
      
        printf("enter the roll number of student no (%d)\n",i+1);
        scanf("%d",&s.roll[i]);
    
        printf("enter the name of student number (%d)\n",i+1);
        scanf("%s",&s.name[i]);
    
        printf("enter the percentage of student no (%d)\n",i+1);
        scanf("%f",&s.per[i]);
    }
    
    printf("\n\n");
    
    for(i=0;i<2;i++)
    {
        printf("*************\t\n");
        
        printf("class == %d\n",s.class[i]);
        printf("roll num == %d\n",s.roll[i]);
        printf("name == %s\n",s.name[i]);
        printf("percentage == %f\n",s.per[i]);  
        
        printf("\n");  
    }
}

    