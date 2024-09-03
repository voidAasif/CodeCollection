#include<stdio.h>
#include<conio.h>

void main()
{
    int a;
    printf("(1) ==> MONDAY\n");
    printf("(2) ==> TUESDAY\n");
    printf("(3) ==> WEDNESDAY\n");
    printf("(4) ==> THURSDAY\n");
    printf("(5) ==> FRIDAY\n");
    printf("(6) ==> SATURDAY\n");
    scanf("%d",&a);
    
    switch(a){
    
        case 1:
        printf("09:30-- ELECTRICAL   --10:25\n");
        printf("10:25-- MATHS         --11:20\n");
        printf("11:20-- CHEMISTRY     --12:15\n");
        printf("12:15-- PPS           --01:10\n");
        printf("01:10-- LUNCH         --02:05\n");
        printf("02:05-- WORKSHOP LAB  --04:50\n");
        break;
        
        case 2:
        printf("09:30-- ELECTRICAL    --10:25\n");
        printf("10:25-- CHEMISTRY     --11:20\n");
        printf("11:20-- MOOKS         --12:15\n");
        printf("12:15-- MATHS         --01:10\n");
        printf("01:10-- LUNCH         --02:05\n");
        printf("02:05-- PPS           --03:00\n");
        printf("03:00-- MATHS         --03:55\n");
        printf("03:55-- AI            --04:50\n");
        break;
        
        case 3:
        printf("09:30-- PPS           --10:25\n");
        printf("10:25-- MATHS         --11:20\n");
        printf("11:20-- CHEMISTRY     --12:15\n");
        printf("12:15-- AI            --01:10\n");
        printf("01:10-- LUNCH         --02:05\n");
        printf("02:05-- ELECTRICAL    --03:00\n");
        printf("03:00-- SPORT         --04:50\n");
        break;
        
        case 4:
        printf("09:30-- ELECTRICAL    --10:25\n");
        printf("10:25-- MOOKS           --11:20\n");
        printf("11:20-- PPS           --12:15\n");
        printf("12:15-- SS            --01:10\n");
        printf("01:10-- LUNCH         --02:05\n");
        printf("02:05-- AI            --03:00\n");
        printf("03:00-- PPS LAB       --04:50\n");
        break;
        
        case 5:
        printf("09:30-- MATHS          --10:25\n");
        printf("10:25-- CHEMISTRY      --11:20\n");
        printf("10:20-- PPS            --12:15\n");
        printf("12:15-- SS             --01:10\n");
        printf("01:10-- LUNCH          --02:05\n");
        printf("02:05-- ELECTRICAL     --03:00\n");
        printf("03:00-- CHEMISTRY LAB  --04:50\n");
        break;
        
        case 6:
        printf("09:30-- MATHS          --10:25\n");
        printf("10:25-- CHEMISTRY      --11:20\n");
        printf("11:20-- PPS            --12:15\n");
        printf("12:15-- SS             --01:10\n");
        printf("01:10-- LUNCH          --02:05\n");
        printf("02:05-- ELECTRICAL     --03:00\n");
        printf("03:00-- ELECTRICAL LAB --04:50\n");
        break;
        
        default :
        printf("NOT VALID\n");
   }    
}  

   