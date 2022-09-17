/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdquessub;
import thirdquesmain.protdefault;
public class subpd extends thirdquesmain.protdefault{
    public static void main(String[] args) {
      subpd obj=new subpd();
      obj.disp1();
      try{
          obj.disp2();
      }
      catch(Exception e){
          System.out.println("default access specifier is used so cannot extend");
      }
    }
    
}
