package com.db.user.test;

import java.util.ArrayList;

import com.db.user.UserBiz;

public class SelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserBiz biz = new UserBiz();
		ArrayList<Object> list = null;
		try{
			list = biz.get();
			for(Object obj:list){
				System.out.println(obj);
			}
			}
			
			catch(Exception e) {
				System.out.println("GET Fail");
				e.printStackTrace();
			}
	
		

	}

}
