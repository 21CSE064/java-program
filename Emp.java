
package emp;

import java.util.Scanner;

/**
 *
 * @author 21CSE064
 */
public class Emp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String type;
         Scanner obj=new Scanner(System.in);
         bill obj1=new bill();
         System.out.println("enter type");
        type=obj.next();
        obj1.getdata();
        if(null != type)
        switch (type) {
            case "domestic":
                obj1.domestic();
                break;
            case "commercial":
                obj1.commercial();
                break;
        }
        obj1.display();
    }
    
}
class bill
{
    int consumernum;
    String consumername;
    int prevreading;
    int curreading;
    int unit;
    float amount;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        consumernum=obj.nextInt();
        System.out.println("enter name");
        consumername=obj.next();
        System.out.println("enter previous reading");
        prevreading=obj.nextInt();
        System.out.println("enter current reading");
        curreading=obj.nextInt();
        unit=curreading-prevreading;
    }
    void domestic()
    {
      if (unit>500)
      {
       amount=(float)((100*1)+(100*2.50)+(300*4)+((unit-500)*6));        
      }
      else if(unit>101&&unit<=200)
      {
          amount=(float)((100*1)+((unit-100)*2.50));
      }
      else if(unit<=100)
      {
          amount=(float)(1*unit);
      }
      else if(unit>201&&unit<=500)
      {
          amount=(float)((100*1)+(100*2.50)+((unit-200)*4));
      }
          
    }
    void commercial()
    {
        if(unit>500)
        {
            amount=(float)((100*2)+(100*4.50)+(300*6)+((unit-500)*7));
        }
        else if(unit>200&&unit<=500)
        {
            amount=(float)((100*2)+(100*4.50)+((unit-200)*6));
        }
        else if(unit<=100)
        {
            amount=(float)(2*unit);
        }
        else if(unit>10&&unit<=200)
        {
            amount=(float)((100*1)+((unit-100)*4.50));
        }
    }
    void display()
    {
        System.out.println("bill amount is..."+amount);
    }
}
