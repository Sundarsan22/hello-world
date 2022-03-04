package arrays;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Lists extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int number1 = Integer.parseInt(request.getParameter("numberOne"));
		int number2 = Integer.parseInt(request.getParameter("numberTwo"));
		int total = number1 + number2;
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		for(int i = 1; i<=total;i++)
		{
			List.add(i);
		}
		
		request.setAttribute("total", List);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}
}