package uwayezu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class head
 */
@WebServlet("/displays_various_header_information")
public class displays_various_header_information extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displays_various_header_information() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();
	        
	        // Reading header information
	        String userAgent = request.getHeader("User-Agent");
	        String host = request.getHeader("Host");
	        String acceptLanguage = request.getHeader("Accept-Language");
	        
	        // Generating HTML response
	        
	        out.println("Header Information");
	        out.println("  ");
	        
	        out.println("User-Agent:   " + userAgent + "");
	        out.println("  ");
	        out.println("Host:   " + host + "</p>");
	        out.println("Accept-Language:  " + acceptLanguage + "");
	        
	        
	    }
	
	

}