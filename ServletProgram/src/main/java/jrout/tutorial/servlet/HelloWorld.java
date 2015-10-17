package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		System.out.println("This is to initialize");
	}
    /**
     * Default constructor. 
     */
    public HelloWorld() {
        System.out.println("This is constructor");
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeDAO edao = new EmployeDAO();
		String empId = request.getParameter("empId");
		String fullName = edao.getName(empId);
		if(fullName == null) {
			response.sendRedirect("error.html");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("helloworld.jsp?fullName="+fullName);
			rd.forward(request, response);
		}
		
	}
	
	@Override
	public void destroy() {
		System.out.println("I am in destroy method....");
	}
}
