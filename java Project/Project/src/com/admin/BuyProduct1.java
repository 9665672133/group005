package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyProduct1
 */
public class BuyProduct1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyProduct1() {
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
		String sid=request.getParameter("id");
		Book b=BookDao.getBookById(sid);
		String qaun=request.getParameter("qaun");
		pw.print(qaun);
		String username=request.getParameter("username");
		String Address=request.getParameter("address");
		String number=request.getParameter("number");
		Order o=new Order();
		o.setAddress(Address);
		o.setBook_Id(b.getBook_Id());
		o.setCust_Name(username);
		o.setPhone_No(number);
		o.setQuantity(qaun);
		int status=BookDao.save(o);
		
		 if(status>0){  
			 pw.print(qaun);
	            pw.print("<p>Record saved successfully!</p>");  
	           
	        }else{  
	            pw.println("Sorry! unable to save record");  
	        }  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
