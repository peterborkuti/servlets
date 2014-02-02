package com.example.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessSelection extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String selection = request.getParameter("sel");
		request.setAttribute("selection", selection);
		log("sel:" + selection);
	}

}
