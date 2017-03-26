package web.component;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.user.UserBiz;
import com.db.vo.User;


import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import web.dispatcher.Util;

@WebServlet({ "/CustServlet", "/cust" })
public class CustServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	UserBiz biz;
	public CustServlet(){
		super();
		biz = new UserBiz();
		
	}
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = request.getParameter("view");
		String next ="main.jsp";
		String center ="";
		//화면이동
		if(view !=null){
			center ="cust/add";
			request.setAttribute("center", "cust/add");
			//DataBase 연동
		}else{
			String db = request.getParameter("db");
			//seach면 db에서 가지고 와라
			if(db.equals("search")){
				ArrayList<Object> list =null;
				//정보조회
				try{
				list = biz.get();
				}catch (Exception e){
					e.printStackTrace();
				}
				//Center에서 화면이동
				request.setAttribute("custlist", list);
				center="cust/list"; //옛다 받아라 화면에 뿌려라
				
			}else if(db.equals("add")){
				//db에 입력한다 
				String id = request.getParameter("id");
				String pwd = request.getParameter("pwd");
				String name = request.getParameter("name");
				name = Util.convertKr(name);
				User user = new User(id, pwd, name);
				try {
					biz.register(user);
					request.setAttribute("adduser", user);
					center = "cust/addok";
				} catch (Exception e) {
					center = "cust/addfail";
					e.printStackTrace();
				}
			}else if(db.equals("detail")){
				String id = request.getParameter("id");
				User user = null;
				try {
					user = (User) biz.get(id);
					request.setAttribute("detailuser", user);
					center = "cust/detail";
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if(db.equals("delete")){
					//id를 받는다
					String id = request.getParameter("id");
					//biz를 통해서 삭제 요청을 한다
					try {
						biz.remove(id);
						request.setAttribute("deleteid", id);
						center = "cust/deleteok";
					} catch (Exception e) {
						
						e.printStackTrace();
					} 
					
					//삭제가 완료되면 삭제 완료 페이지로 이동한다
				
			}else if(db.equals("updateview")){
			//id 정보를 받는다
			//user 접보를 조회한다.
			//수정페이지로 이동한다
			//user 정보를 담아서 보낸다
				String id =request.getParameter("id");
				User user = null;
				try {
					user = (User) biz.get(id);
					request.setAttribute("updateuser", user);
					center = "cust/update";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(db.equals("update")){
				//사용자 정보를 받는다.
				//user 객체를 만든다
				//biz를 통해 수정요청
				//수정완료되면 상세 페이지로 이동
				String id = request.getParameter("id");
				String pwd = request.getParameter("pwd");
				String name = request.getParameter("name");
				name = Util.convertKr(name);
				User user = new User(id, pwd, name);
				try {
					biz.modify(user);
					next = "cust.big?db=detail&id="+id;
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}//end if else
		request.setAttribute("center", center);
		RequestDispatcher rd =   //next로 이동시켜주는 역할을 하는 것
				request.getRequestDispatcher(next);
				rd.forward(request, response);
	}

}
