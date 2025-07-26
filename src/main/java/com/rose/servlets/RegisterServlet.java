package com.rose.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.rose.UserDao.UserImpl;
import com.rose.UserDao.UserTable;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private String url="jdbc:mysql://localhost:3306/foodapp";
	private String dbUserName="root";
	private String dbPassword="root";

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse Resp) {

		String name=req.getParameter("name");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");
		String role=req.getParameter("role");
		
		UserTable user=new UserTable();
		user.setName(name);
		user.setUserName(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);
		user.setRole(role);
		UserImpl userImplementation=new UserImpl();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.print(userImplementation.addUser(user,con));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
