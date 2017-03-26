package com.db.product.test;

import com.db.product.ProductBiz;
import com.db.vo.Product;


public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBiz biz = new ProductBiz();
		Product product = new Product("1235",1000,"m2.jpg");
		try {
			biz.register(product);
			System.out.println("Insert OK");
		} catch (Exception e) {
			System.out.println("Insert Fail");
			e.printStackTrace();
		}
		
	}

}
