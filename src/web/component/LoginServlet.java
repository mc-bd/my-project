package web.component;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.db.user.UserBiz;
import com.db.vo.User;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UserBiz biz;
	    private Logger user_log = 
	            Logger.getLogger("user");
	    

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        biz=new UserBiz();

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        HttpSession session
        =request.getSession();
        if(session !=null){
           User user=
           (User)session.getAttribute("loginuser");
           user_log.debug("LOGOUT,"+user.getId());
           
           session.invalidate();
           response.sendRedirect("main.big");

        }
	}  // login post type


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 //1. ID�� PWD�� �޴´�.
	      //2. DB�� �ش� ID�� ���� �ϴ��� 
	      //3. PWD�� ���Ѵ�.
	      //4. �α��� ���� �� ������ ����� ���ǿ� �ÿ��� ������ �ִ´�.
	      //5. �α��� ���� �Ǵ� ������ �������� �̵�
	        String id = request.getParameter("id");
	        String pwd = request.getParameter("pwd");
	         User user=null;
	         String next="main.jsp";
	         String center="center.jsp";
	         try {
	             user=(User) biz.get(id);
	              if(pwd.equals(user.getPwd())){
	                 HttpSession session =request.getSession();
	                 session.setAttribute("loginuser", user);
	                  
	                 user_log.debug("LOGIN,"+user.getId());
	                 
	                 
	                 center = "loginok";
	              }else{
	                 center = "loginfail";
	              }
	             
	             } catch (Exception e) {
	             center = "loginfail";
	                
	             e.printStackTrace();
	          }
	         request.setAttribute("center", center); 
	         RequestDispatcher rd=
	               request.getRequestDispatcher(next);
	         rd.forward(request, response);


	}

}
