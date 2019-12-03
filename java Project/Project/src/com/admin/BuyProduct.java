package com.admin;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.Book;
import com.admin.BookDao;

/**
 * Servlet implementation class Purchase
 */
public class BuyProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String sid=request.getParameter("id");
		String qaun=request.getParameter("Quantity");
		
		Book b=BookDao.getBookById(sid);
		PrintWriter out=response.getWriter();
		out.print("<form name='form' action='BuyProduct1?id="+b.getBook_Id()+"&qaun="+qaun+"' method='post'>");  
        out.print("<table>");  
       out.print("<tr><td>Customer Name:</td><td><input type='text' name='username'></td></tr>");
       out.print("<tr><td>Address:</td><td><input type='text' name='address'></td></tr>");
       out.print("<tr><td>Phone no:</td><td><input type='number' maxlength='10' name='number'></td></tr>");
        out.print("<tr><td>Name:</td><td>"+b.getBook_Name()+"</td></tr>");  
        out.print("<tr><td>Author:</td><td>"+b.getAuthor()+" </td></tr>");  
        out.print("<tr><td>Price:</td><td>"+b.getPrice()+"</td></tr>");  
        out.print("<tr><td>Quantity:</td><td>"+qaun+"</td></tr>");  
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
