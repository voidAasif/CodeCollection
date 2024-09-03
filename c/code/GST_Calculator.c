//  GST CALCULATOR;

#include<stdio.h>
#include<math.h>
int main(){

    float price, gst, result;
    
    printf("Enter the price:\n");
    scanf("%f",&price);
    printf("GST:\n");
    scanf("%f",&gst);
    
   result = ((price)+(price*(gst/100)));
 
   printf("==> %f",result);
    
    return 0;
    
}