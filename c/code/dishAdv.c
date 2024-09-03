#include<stdio.h>
#include<conio.h>



void main()
{   
    clrscr();
    int dis,num,amm = 0;
    
    //dis = input type of dish;
    //num = input quantity of dish;
    //amm = ammount;
    
    

    
    printf("\t(1)==> Paneer = 200\n");
    printf("\t(2)==> Chawal = 50\n");
    printf("\t(3)==> Daal   = 50\n");
    printf("\t(4)==> Roti   = 5\n");  //Menue
    printf("\t(5)==> Chole  = 50\n");
    printf("\t(6)==> Maggie = 20\n");
    printf("\n\t(0)Comfirm Your Order\n");
    
 /*  
    <price list>
    
     paneer = 200
     Chawal = 50
     Daal   = 50
     Roti   = 5
     Chole  = 50
     Maggie = 20
 */
  do{

    int price = 0;  //Every loop reset the price value;
    
    printf("\n\n<<Choose your dish>>\n");
    scanf("%d",&dis);
    
    switch(dis)
    {   
        case 1:
        printf("Quantity\n"); // Paneer
        scanf("%d",&num);
        price = num*200;
        break;
        
        case 2:
        printf("Quantity\n");  //Chawal
        scanf("%d",&num);
        price = num*50;
        break;
        
        case 3:
        printf("Quantity\n");  //Daal
        scanf("%d",&num);
        price = num*50;
        break;
        
        case 4:
        printf("Quantity\n");  //Roti
        scanf("%d",&num);
        price = num*5;
        break;
        
        case 5:
        printf("Quantity\n");  //Chole
        scanf("%d",&num);
        price = num*50;
        break;
        
        case 6:
        printf("Quantity\n");  //Maggie
        scanf("%d",&num);
        price = num*20;
        break;
              
        case 0:
        printf("\t\t👍Done👍\n");       
        break;
        
        default:
        printf("\t\t💔Try again💔\n");
        break;
      

    }                      //(switch)
  
    amm = amm+=price;  //it run with loop;
    
  }while(dis != 0);        //(loop)
    
 
    printf("\nAmmount ==> %d/-\n",amm);
    
    getch();
}

    