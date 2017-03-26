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
		//ȭ���̵�
		if(view !=null){
			center ="cust/add";
			request.setAttribute("center", "cust/add");
			//DataBase ����
		}else{
			String db = request.getParameter("db");
			//seach�� db���� ������ �Ͷ�
			if(db.equals("search")){
				ArrayList<Object> list =null;
				//������ȸ
				try{
				list = biz.get();
				}catch (Exception e){
					e.printStackTrace();
				}
				//Center���� ȭ���̵�
				request.setAttribute("custlist", list);
				center="cust/list"; //���� �޾ƶ� ȭ�鿡 �ѷ���
				
			}else if(db.equals("add")){
				//db�� �Է��Ѵ� 
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
					//id�� �޴´�
					String id = request.getParameter("id");
					//biz�� ���ؼ� ���� ��û�� �Ѵ�
					try {
						biz.remove(id);
						request.setAttribute("deleteid", id);
						center = "cust/deleteok";
					} catch (Exception e) {
						
						e.printStackTrace();
					} 
					
					//������ �Ϸ�Ǹ� ���� �Ϸ� �������� �̵��Ѵ�
				
			}else if(db.equals("updateview")){
			//id ������ �޴´�
			//user ������ ��ȸ�Ѵ�.
			//������������ �̵��Ѵ�
			//user ������ ��Ƽ� ������
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
				//����� ������ �޴´�.
				//user ��ü�� �����
				//biz�� ���� ������û
				//�����Ϸ�Ǹ� �� �������� �̵�
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
		RequestDispatcher rd =   //next�� �̵������ִ� ������ �ϴ� ��
				request.getRequestDispatcher(next);
				rd.forward(request, response);
	}

}
