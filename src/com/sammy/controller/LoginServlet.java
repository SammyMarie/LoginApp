package com.sammy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sammy.businessService.LoginService;
import com.sammy.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName, password;
		
		userName = request.getParameter("userName");
		password = request.getParameter("password");
		
		LoginService login = new LoginService();
		boolean result = login.aunthenticate(userName, password);
		
		if(result){
			
			User user = login.getUserDetails(userName);
			request.setAttribute("user", user);
			//request.getSession().setAttribute("user", user);
			RequestDispatcher dispatch = request.getRequestDispatcher("success.jsp");
			
			dispatch.forward(request, response);
			//response.sendRedirect("success.jsp");
			return;
		}else{
			
			response.sendRedirect("login.jsp");
			return;
		}
	}
}
