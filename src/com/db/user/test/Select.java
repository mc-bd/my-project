package com.db.user.test;

import com.db.user.UserBiz;
import com.db.vo.User;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  UserBiz biz = new UserBiz();
	      User user =null;
	      
	      try {
	         user = (User) biz.get("id01");
	         System.out.println(user);
	      } catch (Exception e) {
	         System.out.println("select fail");
	         e.printStackTrace();
	      }      
		
	}

}
