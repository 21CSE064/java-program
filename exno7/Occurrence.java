/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occurrence;

/**
 *
 * @author Amrudha
 */
public class Occurrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="successes";
        int n=0;
        char c1[]=s.toCharArray();
        int a=c1.length;
        int i;
            for(char w:c1)
        {
            //System.out.println(c);
            for(i=0;i<a;i++)
            {
            if(w==c1[i])
            {
                n=n+1;
            }
            }
            if (n==2)
            {
                System.out.println(w);
                break;
            }
            n=0;
            
        }
        
            }
        } 
      
      

