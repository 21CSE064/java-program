/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5;
import java.util.Scanner;
import year_1.year1marks;
import year_2.year2marks;
/**
 *
 * @author Amrudha
 */
public class Exp5 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n:");
        n=obj.nextInt();
        year_1.year1marks obj1=new year_1.year1marks();
        year_2.year2marks obj2=new year_2.year2marks();
        int rollno;
        String name;
        while(n>0)
        {
           System .out.println("enter rollno:");
           rollno=obj.nextInt();
           System .out.println("enter name:");
           name=obj.next();
           System .out.println("enter mark1:");
           int m1=obj.nextInt();
           System .out.println("enter mark2:");
           int m2=obj.nextInt();
           System .out.println("enter mark3:");
           int m3=obj.nextInt();
           System .out.println("enter mark4:");
           int m4=obj.nextInt();
           System .out.println("");
           System .out.println("displaying grade....");
           System .out.println("student roll number: "+rollno);
           System .out.println("student name: "+name);        
           System .out.println("grade of mark1: "+obj1.sub1marks(m1));
           System .out.println("grade of mark2: "+obj1.sub2marks(m2));
           System .out.println("grade of mark3: "+obj2.sub3marks(m3));
           System .out.println("grade of mark4: "+obj2.sub4marks(m4));
           System .out.println("");
           n=n-1;        
        }      
        }
}
    

