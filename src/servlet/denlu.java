package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.yonghu;
import use.user;

/**
 * Servlet implementation class denlu
 */
@WebServlet("/denlu")
public class denlu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public denlu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		user u = new user();
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		u.setUsername(username);
		u.setPass(password);
		
		yonghu h=new yonghu();
		if(h.yanzhen(u.getUsername(),u.getPass())==1)
		{
			response.sendRedirect(request.getContextPath()+"/denlu_success.jsp");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/denlu_failure.jsp");
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
