/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpgm;

import java.sql.*;

/**
 *
 * @author Amrudha
 */
public class Dbpgm {
    public static void main(String[] args) throws SQLException {
         Connection a=DriverManager.getConnection("jdbc:derby://localhost:1527/dbebookshop");
        Statement b=a.createStatement();
        ResultSet d=b.executeQuery("select * from dbbooks");
        while(d.next())
        {
            System.out.print("id- "+d.getInt(1));
            System.out.print("title- "+d.getString(2));
            System.out.print("author- "+d.getString(3));
            System.out.print("price- "+d.getFloat(4));
            System.out.print("qty- "+d.getInt(5));
            System.out.println();
        }
        System.out.println("**************************************");
        ResultSet e=b.executeQuery("select title,author,price,qty from dbbooks where author='tan ah teck'");
        while(e.next())
        {
            System.out.print("title- "+e.getString(1));
            System.out.print("author- "+e.getString(2));
            System.out.print("price- "+e.getFloat(3));
            System.out.print("qty- "+e.getInt(4));
            System.out.println();
        }
        System.out.println("**************************************");
        b.executeUpdate("update dbbooks set price=price+(50/100) where title='a cup of java'");
        b.executeUpdate("update dbbooks set qty=0 where title='a teaspoon of java'");
        b.executeUpdate("insert into dbbooks values(8001,'java abc','kevin jones',15.55,55)");
        b.executeUpdate("insert into dbbooks values(8002,'java xyz','kevin jones',25.55,55)");
        a.close();
    }
    
}
