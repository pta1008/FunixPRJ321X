package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		String action = request.getParameter("action");
//		if(action == null){
//			request.getRequestDispatcher("/home.jsp").forward(request, response);
//		} else if (action.equals("login")) {
//			request.setAttribute("email", "");
//			request.setAttribute("password", "");
//			request.setAttribute("validatetionmessage", "");
//			request.getRequestDispatcher("/login.jsp").forward(request, response);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		try {
			request.getSession(true).invalidate();
			//format of email
			String regexMail = "^[A-Z0-9_a-z]+@[A-Z0-9\\.a-z]+\\.[A-Za-z]{2,6}$";
			String regex = "[a-zA-z0-9_!@#$%^&*]+";
			//get data form a login form
			String user = request.getParameter("username");
			String password = request.getParameter("password");
			Account acc = new Account();
			acc.setName(user);
			acc.setPwd(password);
			
			HttpSession session = request.getSession(true);
			

			if(!password.matches(regex) || ! user.matches(regexMail)) {
				session.setAttribute("validatetionmessage", "invalid syntax");
				response.sendRedirect("login.jsp");
				return;
			}
			//read information of account in web.xml
			String uid = getServletContext().getInitParameter("username");
			String pwd =  getServletContext().getInitParameter("password");
			//check account - user validate code in asm 1 to valid user 
			if(user != null && acc.getName().equalsIgnoreCase(uid) && acc.getPwd().equals(pwd)) {
				session.setAttribute("user", user);
				response.sendRedirect("admin/index.jsp");
				return;
			} else {
				session.setAttribute("validatetionmessage", "wrong username or password");
				response.sendRedirect("login.jsp");
				return;
			}
		} catch (NullPointerException e) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (Exception ex) {
			response.getWriter().println(ex);
		}
		
		
		
		
	}
	

}
