
package throwapartmentexception;
    public class apartment {

    public apartment(String address, int no, int bed, int rent) {
        try{
        if(no<3 && bed>1&&bed<4 && rent<2500&&rent>500) 
        {
            System.out.println("successfull");
        }
        else
        {
            System.out.println("the error occured is");
            throw(new apartmentexception());
        }
        }
        catch(apartmentexception e)
        {
            System.out.println(e.getMessage());
        }
    }    

    
}
