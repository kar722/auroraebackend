package com.nighthawk.spring_portfolio.mvc.products;

import java.sql.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import antlr.collections.List;


public class Product {
   public static void insert(String name, int price, String description,int inStock) {
      Connection c = null;
      Statement stmt = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:products.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = String.format("INSERT INTO PRODUCT (NAME,PRICE,DESCRIPTION,INSTOCK) " +
         "VALUES ('%s', %d, '%s',%d );",name,price,description,inStock); 
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
      Product.insert("protein",500,"idk",1);
   }
}


// String sql = "CREATE TABLE QUIZ " +
// "(ID INTEGER PRIMARY KEY     AUTOINCREMENT," +
// " NAME           TEXT    NOT NULL, " + 
// " PRICE            INT     NOT NULL, " + 
// " DESCRIPTION         CHAR(200) NOT NULL),"+
//"INSTOCK INT NOT NULL"; 