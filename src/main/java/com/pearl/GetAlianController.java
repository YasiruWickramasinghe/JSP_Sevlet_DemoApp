package com.pearl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pearl.dao.AlianDao;
import com.pearl.model.Alian;

/**
 * Servlet implementation class GetAlianController
 */
public class GetAlianController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		AlianDao dao = new AlianDao();
		Alian a1 = new Alian();
		
		request.setAttribute("alian", a1);
		
		RequestDispatcher rd = request.getRequestDispatcher("showAlian.jsp");
		rd.forward(request, response);
		
	}

}
