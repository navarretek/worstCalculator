package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.calculator;

/**
 * Servlet implementation class getSubNumbersServlet
 */
@WebServlet("/getSubNumbersServlet")
public class getSubNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSubNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("userNum1");
		String num2 = request.getParameter("userNum2");
		calculator calc = new calculator(Double.parseDouble(num1),Double.parseDouble(num2));
		calc.setSubtractedResult();
		request.setAttribute("userResult", calc);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(calc.toString());
//		writer.close();
	}

}
