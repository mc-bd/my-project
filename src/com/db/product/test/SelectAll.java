package com.db.product.test;

import java.util.ArrayList;

import com.db.product.ProductBiz;



public class SelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBiz biz = new ProductBiz();
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
