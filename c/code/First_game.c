#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main()
{
   int num, guess, nguess = 1;
    
    srand(time(0));
    num = rand()%1000+1;
    
        //printf("%d\n",num);  
  
do{{
    printf("guess the number between 1 to 1000:\n");
    scanf("%d",&guess);
    }
    if (guess>num)
      printf("please enter lower number\n");
    
    else if (guess<num)
      printf("please enter higher number\n");
    
    
    else
    
    printf("your attempt is %d:\n",nguess);
    
    
    nguess++;
 }   while(guess!=num);
   
    
    return 0;
}