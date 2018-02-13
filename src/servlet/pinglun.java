package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.pinlun;
import use.user;

/**
 * Servlet implementation class pinglun
 */
@WebServlet("/pinglun")
public class pinglun extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pinglun() {
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
		
		HttpSession session = request.getSession(true); 
		String username =(String)session.getAttribute("username");
		String id=(String) session.getAttribute("id");
		int i=Integer.parseInt(id);
		String article =(String)session.getAttribute("article"+i); 
		String pinglun = request.getParameter("pinglun");

	
		u.setUsername(username);
	    u.setId(i);
		u.setÎÄÕÂ(article);
		u.setÆÀÂÛ(pinglun);
		pinlun p=new pinlun();
		if(p.add(username, article, pinglun)==0) {
			session.setAttribute("pinglun",pinglun);
			response.sendRedirect(request.getContextPath()+"/pinglun_success.jsp");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/pinglun_failure.jsp");
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
