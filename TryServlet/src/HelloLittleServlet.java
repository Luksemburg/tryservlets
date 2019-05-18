import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/hi")
public class HelloLittleServlet extends HttpServlet {
	private static final long serialVersionUID = 178541533L;
       

    public HelloLittleServlet() {
        super();
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();	

		String[] courses = request.getParameterValues("courses");
		String name = request.getParameter("uname");
		String age = request.getParameter("uage");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		
		writer.println("<h2>Results From Form: </h2>");
		
		writer.println("<p>Name: " + name + "</p>");
		writer.println("<p>Age: " + age + "</p>");
		writer.println("<p>Gender: " + gender + "</p>");
		writer.println("<p>Country: " + country + "</p>");
		
		writer.println("<h4>You will be study next courses: </h4>");
		for(int i = 0; i < courses.length; i++){			
			writer.println("<li>" + courses[i] + "</li>");			
		}
		
		
		writer.close();

	}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
