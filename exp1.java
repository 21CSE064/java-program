/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labone;

import java.util.Scanner;

public class Labone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.println("enter a:");
        System.out.println("enter b");
    a=obj.nextInt();
    b=obj.nextInt();
    if(a>b)
        System.out.println("b is minimum");
    else
        System.out.println("a is minimum");
    }
    
}









import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21CSE064
 */
public class sumproduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("enter a:");
        a=obj.nextInt();
        System.out.println("enter b:");
        b=obj.nextInt();
        c=a+b;
        d=a*b;
        System.out.println("the sum is:..."+c);
        System.out.println("the product is:..."+d); 
    }
    
}








import java.util.Scanner;
public class moday
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int n,month,day;
System.out.println("enter n:");
n=obj.nextInt();
month=n//30;
day=n%30;
System.out.println(n+"days="+month.."months and"+day..+"days");
}
}






import java.util.Scanner;
public class greet
{
public static void main(String[] args)
{
scanner obj=new Scanner(System.in);
int m1,m2,m3,m4,m5,avg;
System.out.println("enter m1,m2,m3,m4,m5 from 1-10");
m1=obj.nextInt();
m2=obj.nextInt();
m3=obj.nextInt();
m4=obj.nextInt();
m5=obj.nextInt();
avg=(m1+m2+m3+m4+m5)/5;
switch(avg)
{
case10:
System.out.println("excellent");
break;
case9:
System.out.println("very good");
break;

case8:
System.out.println("very good");
break;

case7:
System.out.println("good");
break;

case6:
System.out.println("good");
break;

case5:
System.out.println("poor");
break;

case4:
System.out.println("poor");
break;

case3:
System.out.println("poor");
break;

case2:
System.out.println("very poor");
break;
case1:
System.out.println("very poor");
break;
case0:
System.out.println("very poor");
break;
default:
System.out.println("invalid");
break;
}
}
}






public class pattern
{
	
public static void main(String[] args) {

	int n=5,i,j;
		
                for(i=1;i<=n;i++)

               {
		   
                    for(j=i;j<=n;j++)
		   
                    {
		        
                             System.out.println("");
		        
		   
                     }
                    for(j=1;j<=i;j++)
		   
                    {
		       
                            System.out.println("*");
		        
		   
                    }
		    
                    System.out.println();
		
              }
		
	
}

}













