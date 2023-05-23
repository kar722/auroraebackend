package com.nighthawk.spring_portfolio.mvc.cart;

import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Cart {

    public static void main( String args[] ) {
       Connection c = null;
       Statement stmt = null;
       
       try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:products.db");
          System.out.println("Opened database successfully");
 
          stmt = c.createStatement();
          String sql = "CREATE TABLE CART " +
                         "(ID INTEGER PRIMARY KEY  AUTOINCREMENT   NOT NULL," +
                         " ITEM           INT    NOT NULL, " + 
                         " USER            TEXT     NOT NULL, " + 
                         " QUANTITY        INT NOT NULL" + 
                         ")"; 
          stmt.executeUpdate(sql);
          stmt.close();
          c.close();
       } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
       }
       System.out.println("Table created successfully");
    }
 }
 