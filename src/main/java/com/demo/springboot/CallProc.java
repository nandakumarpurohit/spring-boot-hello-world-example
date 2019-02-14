package com.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallProc {
	
	Connection con;
	
	CallProc() {
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:XE","system","oracle");
			CallableStatement cs = con.prepareCall("{ call demoproc7 (?,?,?) }");
			cs.setInt(1, 12);
			cs.setInt(2, 15);
			cs.registerOutParameter(3, Types.INTEGER);
			cs.execute();
			int num = cs.getInt(3);
			System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CallProc();
	}

}
