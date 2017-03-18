package com.db.product;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import org.rosuda.REngine.Rserve.RserveException;

import com.db.frame.Dao;
import com.db.frame.Sql;
import com.db.vo.Product;
import com.db.vo.User;

public class ProductDao extends Dao {

	@Override
	public void insert(Connection con, Object obj) throws Exception {
		// TODO Auto-generated method stub
		Product product = (Product) obj;
		PreparedStatement pstmt = con.prepareStatement(Sql.insertProduct);
		pstmt.setString(1, product.getName());
		pstmt.setInt(2, product.getPrice());
		pstmt.setString(3, product.getImg());
		pstmt.executeUpdate();
		
		close(pstmt);
	}

	@Override
	public void update(Connection con, Object obj) throws Exception {
		// TODO Auto-generated method stub
		  Product product = (Product) obj;
	      PreparedStatement pstmt = con.prepareStatement(Sql.udpateProduct);
	      pstmt.setInt(1, product.getId());
	      pstmt.setString(2, product.getName());
	      pstmt.setInt(3, product.getPrice());
	      pstmt.setDate(4, product.getDate());
	      pstmt.setString(5, product.getImg());
	      pstmt.executeUpdate();
	      close(pstmt);
	}

	@Override
	public void delete(Connection con, Object obj) throws Exception {
		Object product = null;
		PreparedStatement pstmt = con.prepareStatement(Sql.deleteProduct);
		pstmt.setString(1, obj.toString());
		pstmt.executeUpdate(); //db에 반영한다
	    close(pstmt);
	}

	@Override
	public Object select(Connection con, Object obj) throws Exception {
		// TODO Auto-generated method stub
		Object product = null;
		PreparedStatement pstmt = 
				con.prepareStatement(Sql.selectProduct);
		pstmt.setString(1, obj.toString());
		ResultSet rset = null;
		
		rset = pstmt.executeQuery();
		rset.next();
		
		int id =rset.getInt("ID");
		String name = rset.getString("NAME");
		int price = rset.getInt("PRICE");
		Date date =rset.getDate("DATE");
		String img= rset.getString("IMG");
		product= new Product(id, name, price, date, img);
		return product;
	
		
	
	}

	@Override
	public ArrayList<Object> select(Connection con) throws Exception {
		ArrayList<Object> list = new ArrayList<>();
		PreparedStatement pstmt = con.prepareStatement(Sql.selectAllProduct);
		ResultSet rset = null; //여러개의 데이터가 들어감
		rset = pstmt.executeQuery();
		while(rset.next()){
			int id = rset.getInt("ID");
			String name = rset.getString("NAME");
			int price= rset.getInt("PRICE");
			Date date= rset.getDate("regdate");
			String img = rset.getString("img");
			Product product = new Product(id, name, price, date ,img);
			list.add(product);
			
		}
		
		
		close(rset);
		close(pstmt);
		return list;
	}

	
}
