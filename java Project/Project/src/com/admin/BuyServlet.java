package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyServlet
 */
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String sid=request.getParameter("id");
		Book b=BookDao.getBookById(sid);
		PrintWriter out=response.getWriter();
		out.print("<form name='form' action='BuyProduct?id="+b.getBook_Id()+"' method='post'>");  
        out.print("<table>");  
       
        out.print("<tr><td>Name:</td><td>"+b.getBook_Name()+"</td></tr>");  
        out.print("<tr><td>Author:</td><td>"+b.getAuthor()+" </td></tr>");  
        out.print("<tr><td>Price:</td><td>"+b.getPrice()+"</td></tr>");  
        out.print("<tr><td>Quntity:</td><td>"); 
        out.print("<select name='Quantity' style='width:150px'>");  
        out.print("<option>1</option>");  
        out.print("<option>2</option>");  
        out.print("<option>3</option>");  
        out.print("<option>4</option>");  
        out.print("</select>");  
        out.print("</td></tr>");  
        out.print("<tr><td><input type='submit' value='Purchase'/></td><td><a href='ViewBookServlet'><input type='button' value='cancel'/></a></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
