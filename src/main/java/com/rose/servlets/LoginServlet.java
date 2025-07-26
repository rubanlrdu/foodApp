package com.rose.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.rose.UserDao.UserImpl;
import com.rose.UserDao.UserTable;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	static int count=3;
	private static final long serialVersionUID = 1L;
	private String url="jdbc:mysql://localhost:3306/foodapp";
	private String dbUserName="root";
	private String dbPassword="root";
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		String role=req.getParameter("role");
		UserImpl userImplementation=new UserImpl();
		UserTable userTable=new UserTable();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, dbUserName, dbPassword);
			userTable.setUserName(userName);
			userTable.setPassword(password);
			userTable=userImplementation.selectUser(userName, con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.setContentType("text/html");
		
		if(userName.equals(userTable.getUserName()) && password.equals(userTable.getPassword()))
		{
			PrintWriter out= resp.getWriter();
			out.print("Hello "+userTable.getName() + " !");
		}
		else if(count>0)
		{
			PrintWriter out= resp.getWriter();
			out.print("Remaining"+ count-- +" attempts left.");
			RequestDispatcher rd=req.getRequestDispatcher("loginPage.html");
			rd.include(req, resp);
		}
		else
		{
			PrintWriter out=resp.getWriter();
			out.print("u r fucked !");
			
		}
	}

}
