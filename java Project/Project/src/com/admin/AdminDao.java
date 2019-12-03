package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
public class AdminDao 
{
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            System.out.println("Driver found");
            con = DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group005_bookstore","group005","welcome");            
            System.out.println("Connection successful");
        }catch(Exception e){System.out.println(e);}  
        return con;  
    } 
	
	public static boolean validate(String username,String password){  
		boolean status=false;  
		try{  
		Connection con=AdminDao.getConnection();
		              
		PreparedStatement ps=con.prepareStatement(  
		    "select * from AdminLogin where username=? and password=?");  
		  
		ps.setString(1,username);  
		ps.setString(2,password);  
		              
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		              
		}catch(Exception e){}  
		  
		return status;  
		  
		}  

}