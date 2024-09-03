#include<stdio.h>
#include<math.h>

int main()
{

float num , power , ans;

    printf("num:\n",num);
    scanf("%f" ,&num);

    printf("power:\n",power);
    scanf("%f" ,&power);
    
    ans = pow(num , power);
    printf("ans:%f\n",ans);
    
    
    return 0;
}