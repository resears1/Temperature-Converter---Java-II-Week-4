package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CToFConverter;

/**
 * Servlet implementation class celsiusServlet
 */
@WebServlet("/celsiusServlet")
public class celsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public celsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userCelsius = request.getParameter("userCelsius");
		
		CToFConverter conversion = new CToFConverter(Integer.parseInt(userCelsius));
		
		request.setAttribute("userConversion", conversion);
		
		getServletContext().getRequestDispatcher("/resultctof.jsp").forward(request, response);
		
	}

}
