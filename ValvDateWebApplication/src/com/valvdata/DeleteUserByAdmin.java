package com.valvdata;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteuser")
public class DeleteUserByAdmin extends HttpServlet { 
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {
			String id=request.getParameter("id");
			System.out.println("OKygggggg"+id);
			
			
			
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
		}
}
}
