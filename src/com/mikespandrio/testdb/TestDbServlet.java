package com.mikespandrio.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String jdbcUrl = "jdbc:mysql://localhost:3306/crm_db?useSSL=false&serverTimezone=UTC";
	String user = "crmadmin";
	String pass = "crmadmin";
	String driver = "com.mysql.cj.jdbc.Driver";
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database: " + jdbcUrl);
			
			Class.forName(driver); // Load the MySQL JDBC driver
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			out.println("Connection successful!");
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	
	
	}

}
