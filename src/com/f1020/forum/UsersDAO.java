package com.f1020.forum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.struts2.components.Select;

import sun.text.resources.cldr.om.FormatData_om;


public class UsersDAO {
   private Connection con;
   private PreparedStatement pt;
   private ResultSet rs;
   public boolean findUsers(String username) {
	   boolean flag=false;
	   con=DatabaseDAO.getConnection();
	   try {
		  pt=con.prepareStatement("select * from users where username = ?");
	      pt.setString(1, username);
	      rs=pt.executeQuery();
	      if(rs.next()){
	    	  flag=true;
	      }
	   } catch(SQLException e){
		   e.printStackTrace();
	   } finally {
		   DatabaseDAO.closeRs(rs);
		   DatabaseDAO.closePt(pt);
		   DatabaseDAO.closeConnection();
		// TODO: handle finally clause
	   }
	   return flag;
   }
   public int saveUsers(Users users) {
	  int i=0;
	  con=DatabaseDAO.getConnection();
	  try {
		  pt=con.prepareStatement("insert into users(username,password,name,nic,sex,age,email,"+
	      "phone,selfshow) values (?,?,?,?,?,?,?,?,?)");
		  String uString=users.getUsername();
		  System.out.println(uString);
		  pt.setString(1, users.getUsername());
		  pt.setString(2, users.getPassword());
		  pt.setString(3, users.getName());
		  pt.setString(4, users.getNic());
		  pt.setString(5, users.getSex());
		  pt.setInt(6, users.getAge());
		  pt.setString(7, users.getEmail());
		  pt.setString(8, users.getPhone());
		  pt.setString(9, users.getSelfshow());
		  i=pt.executeUpdate();
	   } catch(SQLException e){
		   e.printStackTrace();
	   } finally {
		   DatabaseDAO.closeRs(rs);
		   DatabaseDAO.closePt(pt);
		   DatabaseDAO.closeConnection();
		// TODO: handle finally clause
	   }
	  return i;
   }
   public boolean login(Users users) {
	   con=DatabaseDAO.getConnection();
	   boolean flag=false;
	   try {
		 pt=con.prepareStatement("select * from users where username=? and password=?");
		 pt.setString(1, users.getName());
		 pt.setString(2, users.getPassword());
		 rs=pt.executeQuery();
		 if(rs.next()){flag=true;}	 
	   } catch (Exception e) {
		   e.printStackTrace();
		// TODO: handle exception
	   } finally{
		   DatabaseDAO.closeRs(rs);
		   DatabaseDAO.closePt(pt);
		   DatabaseDAO.closeConnection();
		// TODO: handle finally clause
	   }
	   return flag;
   }
}
