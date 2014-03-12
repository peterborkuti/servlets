package com.example.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessSelection extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String selection = request.getParameter("sel");
		request.setAttribute("selection", selection);
		log("sel:" + selection);
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
	}

}
