package com.servletpack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException {
		
		 int k = (int) req.getAttribute("k");
		 int sk=k*k;
		 PrintWriter out=res.getWriter();
		 out.println("Square of "+k+" is "+sk);
	}
}
