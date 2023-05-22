package com.nighthawk.spring_portfolio.mvc.products;

import java.sql.*;


public class Product {
   public static void insert() {
      Connection c = null;
      Statement stmt = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:products.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = "INSERT INTO PRODUCT (NAME,PRICE,DESCRIPTION,INSTOCK) " +
                        "VALUES ('Stem Cell', 1000, 'no idea', 1 );"; 
         stmt.executeUpdate(sql);


         stmt.close();
         c.commit();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Records created successfully");

   }
   public static void main( String args[] ) {
      Product.insert();
   }
}


// String sql = "CREATE TABLE QUIZ " +
// "(ID INTEGER PRIMARY KEY     AUTOINCREMENT," +
// " NAME           TEXT    NOT NULL, " + 
// " PRICE            INT     NOT NULL, " + 
// " DESCRIPTION         CHAR(200) NOT NULL),"+
//"INSTOCK INT NOT NULL"; 