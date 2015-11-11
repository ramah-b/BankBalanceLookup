

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lookupServlet
 */
@WebServlet("/lookupServlet")
public class lookupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lookupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer custBean = new Customer();
		CustomerSimpleMap custMap = new CustomerSimpleMap();
		
		String id = request.getParameter("id");
		custBean = custMap.findCustomer(id);
		System.out.println(id);
		if (custBean == null){
			 getServletContext()
		     	.getRequestDispatcher("/unknownCust.jsp")
		     		.forward(request, response);
		}else if (custBean.getBalance() < 0 ){
			 getServletContext()
		     	.getRequestDispatcher("/negBalance.jsp")
		     		.forward(request, response);
		}else if (custBean.getBalance() > 0 && custBean.getBalance() <= 99999.99){
			 getServletContext()
		     	.getRequestDispatcher("/regularBalance.jsp")
		     		.forward(request, response);
		}else if (custBean.getBalance() > 99999.99){
			 getServletContext()
		     	.getRequestDispatcher("/highBalance.jsp")
		     		.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
