package com.dts.dae.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewDAO {
	
	Connection con=null;
	public NewDAO() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sap","sap");
		System.out.println("connection ----"+con);
	}
	
	
	public void acceptUserRequest(String login) {
		System.out.println("accepoyt    login"+login);
		try
		{
			//String qry="update login_details set login_status=1,status='verify' where loginname="+login;
			String qry="select * from login_details";
			System.out.println(qry);
			PreparedStatement pst=con.prepareStatement(qry);
		pst.executeQuery();
		System.out.println("success...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
