package com.servletpack;

import java.io.PrintWriter;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
//		PrintWriter out=res.getWriter(); 
//		out.print("Result is "+ k);
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req,res);
	}
}
