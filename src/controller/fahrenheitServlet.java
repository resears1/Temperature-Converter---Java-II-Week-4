package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FToCConverter;

/**
 * Servlet implementation class fahrenheitServlet
 */
@WebServlet("/fahrenheitServlet")
public class fahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userFahrenheit = request.getParameter("userFahrenheit");
		
		FToCConverter conversion = new FToCConverter(Integer.parseInt(userFahrenheit));
		
		request.setAttribute("userConversion", conversion);
		
		getServletContext().getRequestDispatcher("/resultftoc.jsp").forward(request, response);
	}

}
