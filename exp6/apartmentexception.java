
package throwapartmentexception;
public class apartmentexception extends Exception{
    int aptno;
    int bedno;
    int aptrent;
    String add;
    public apartmentexception(String address,int no,int bed,int rent)
    {
        super("apartment");
        add=address;
        bedno=bed;
        aptrent=rent;
        aptno=no;
        System.out.println("apartmentexception");
        
    }
    public apartmentexception()
    {
        super("apartmentexception");
    }
    
}
