
package throwapartmentexception;

import java.util.Scanner;
public class Throwapartmentexception {
    public static void main(String[] args) {
        apartment obj[]=new apartment[6];
        for(int i=0;i<obj.length;i++)
        {
            Scanner o=new Scanner(System.in);
            System.out.println("enter street address");
            String add;
            add = o.next();
            System.out.println("enter no.of digits of apartment number");
            int aptno=o.nextInt();
            System.out.println("enter no.of bedroom");
            int bedno=o.nextInt();
            System.out.println("enter apartment rent");
            int rent=o.nextInt();
            obj[i]=new apartment(add,aptno,bedno,rent);
        }
    }
    
}
