package com.db.product.test;

import com.db.product.ProductBiz;
import com.db.vo.Product;

public class Delete {

	public static void main(String[] args) {
		 ProductBiz biz = new ProductBiz();
	      Product product =null;
	      
	      try {
	         product = (Product) biz.get("id01");
	         System.out.println(product);
	      } catch (Exception e) {
	         System.out.println("select fail");
	         e.printStackTrace();
	      }      
	      
	      
		}
		
	}


