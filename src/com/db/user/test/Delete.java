package com.db.user.test;

import com.db.user.UserBiz;
import com.db.vo.User;

public class Delete {

	public static void main(String[] args) {
		UserBiz biz = new UserBiz();
		User user = new User("id12","pwd10","È«¸»ÀÚ");
		try {
			biz.register(user);
			System.out.println("Insert OK");
		} catch (Exception e) {
			System.out.println("Insert Fail");
			e.printStackTrace();
		}
		
	}

}
