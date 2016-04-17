package com.f1020.forum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.config.Configuration;


public class DatabaseDAO {
   private static Connection connection;
   private static final String DRIVER="com.mysql.jdbc.Driver";
   private static final String URL="jdbc:mysql://localhost:3306/userinfo";
   private static final String NAME="root";
   private static final String PASSWORD="f1020@BUAA";
   static{
	   try {
		 Class.forName(DRIVER);
	   } catch (ClassNotFoundException e) {
		// TODO: handle exception
		   e.printStackTrace();
	   }
   }
   public static Connection getConnection(){
	  try {
		connection=DriverManager.getConnection(URL, NAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		// TODO: handle exception
	  }
	  return connection;
   }
   public static void closeConnection() {
	   try {
		  if(connection!=null) connection.close();
	   } catch(SQLException e) {
		   e.printStackTrace();
		// TODO: handle exception
	   }
   }
   public static void closePt(PreparedStatement pt){
	  try {
		if(pt!=null) pt.close();
	  } catch (SQLException e) {
		  e.printStackTrace();
		// TODO: handle exception
	  }
   }
   public static void closeRs(ResultSet rs) {
	   try {
		  if(rs!=null) rs.close();
	   } catch (SQLException e) {
		  // TODO: handle exception
		  e.printStackTrace();
	   }
   }
}
