package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.wenzhang;
import use.user;

/**
 * Servlet implementation class wenzhangshixian
 */
@WebServlet("/wenzhangshixian")
public class wenzhangshixian extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public wenzhangshixian() {
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
		HttpSession session = request.getSession(false); 
		String username =(String)session.getAttribute("username"); 
		String article = request.getParameter("article");
		u.setUsername(username);
		u.setÎÄÕÂ(article);
		wenzhang w=new wenzhang();
		if(w.add(u.getUsername(), u.getÎÄÕÂ())==0) {
			session.setAttribute("article",article);
			response.sendRedirect(request.getContextPath()+"/shangchuan_success.jsp");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/shangchuan_failure.jsp");
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
