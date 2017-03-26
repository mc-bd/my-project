package com.db.product.test;

import com.db.product.ProductBiz;
import com.db.vo.Product;

public class Insert {
	public static void main(String[] args) {
		ProductBiz biz= new ProductBiz();
		Product product = new Product("¹ÙÁö10",4000,"a.jpg");
		try {
			biz.register(product);
			System.out.println("Insert OK");
		} catch (Exception e) {
			System.out.println("Insert Fail");
			e.printStackTrace();
		}
	}
}

