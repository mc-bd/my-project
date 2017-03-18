package web.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet({ "/DispatcherServlet", "/dispatcher" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Logger work_log = Logger.getLogger("work"); 
		private Logger work_log=
				Logger.getLogger("work");
	
	public DispatcherServlet() { //화면 전환에 대한것 
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		//work_log.debug("test logger:"+path);

		path = path.substring(1, path.lastIndexOf("."));//메인을 꺼내온다
		work_log.debug(path);
		
		String next = "main.jsp";
		if(path.equals("main")){ //메인이면 여기로 이동해라
			String view = request.getParameter("view");
	
			request.setAttribute("navi", Navi.home);
			if(view != null){
				build(request, view); //화면조화
			}
			next = "main.jsp";
		}else{//메인 아니면 이곳으로 와라
			next = path;
		}
		RequestDispatcher rd =   //next로 이동시켜주는 역할을 하는 것
		request.getRequestDispatcher(next);
		rd.forward(request, response);
		
	}
	
	
	private void build(HttpServletRequest request,
			String view){
		
		
		if(view.equals("login")){
			request.setAttribute("center", "login");
			request.setAttribute("nav", Navi.login);
			
		}else if(view.equals("register")){
			request.setAttribute("center", "register");
			request.setAttribute("nav", Navi.register);
		}else if(view.equals("cust")){
			request.setAttribute("center", "cust/center");
			request.setAttribute("nav", Navi.cust);
		}else if(view.equals("product")){
			request.setAttribute("center", "product/center");
			request.setAttribute("nav", Navi.product);
		}else if(view.equals("rgraph")){
			request.setAttribute("center", "rgraph");
		}else if(view.equals("highcharts")){
			request.setAttribute("center", "highcharts");
		}else if(view.equals("weather")){
			request.setAttribute("center", "weather");
		}
		
	
	}

}





