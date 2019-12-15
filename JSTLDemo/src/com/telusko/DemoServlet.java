package com.telusko;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class DemoServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		
		List<Student> studs= Arrays.asList(new Student(1, "vinay"), new Student(2, "rajesh"), new Student(3, "ciaz"));
		
		request.setAttribute("students", studs);
		RequestDispatcher rd= request.getRequestDispatcher("disc.jsp");
		rd.forward(request, response);
	}

}
