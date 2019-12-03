package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewBookServlet
 */
public class ViewBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBookServlet() {
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
		PrintWriter pw=response.getWriter();
		  pw.println("<h1>Books List</h1>");  
		  
		  List <Book> list=BookDao.getAllBooks();
		  
	        pw.print("<table border='1' width='100%'");  
	        pw.print("<tr><th>Book_Name</th><th>Author</th><th>price</th></tr>");  
	        for(Book b:list){  
	         pw.print("<tr><td>"+b.getBook_Name()+"</td><td>"+b.getAuthor()+"</td><td>"+b.getPrice()+"</td><td><a href='BuyServlet?id="+b.getBook_Id()+"'>Buy</a></td>  </tr>");  
	        }  
	        pw.print("</table>"); 
          
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}