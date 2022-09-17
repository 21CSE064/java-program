/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpag;
import mainpag.pack1.one;
import mainpag.pack2.two;
import mainpag.pack3.three;
public class mainpag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        one obj1=new one();
        two obj2=new two();
        three obj3=new three();
        obj1.disp1();
        obj2.disp2();
        obj3.disp3();
    }
    
}
