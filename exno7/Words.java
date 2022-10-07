/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;

/**
 *
 * @author Amrudha
 */
public class Words {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="what is your name?-my name is,abitha.n.g.r";
        char c[]=s.toCharArray();
        int count = 0;
        for(char c1:c)
        {
            if(c1=='?'||c1==','||c1=='-'||c1==':'||c1==' '||c1=='.')
            {
               count=count+1;
            }
           
        }
        System.out.println("the no.of words are..."+count);
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='?'||c[i]==','||c[i]=='-'||c[i]==':'||c[i]==' '||c[i]=='.')
            {
               count=count+1;
            }
        }
       
    }
   
}


