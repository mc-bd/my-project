package com.db.user;

import java.sql.Connection;
import java.util.ArrayList;

import com.db.frame.Biz;



public class UserBiz extends Biz {
	private UserDao dao;
	public UserBiz(){
		dao = new UserDao();
		
	}
	@Override
	public void register(Object obj) throws Exception {
		//Transaction Processing
		Connection con = getConnection();
		try{
			dao.insert(con, obj);
			con.commit();
		}catch(Exception e){
			con.rollback();
			throw e;
		}
			close(con);
		
	}

	@Override
	public void modify(Object obj) throws Exception {
		// TODO Auto-generated method stub
		 Connection con=getConnection();
	      try{
	      dao.update(con, obj);
	      con.commit();
	   }catch (Exception e){
	      con.rollback();
	      throw e;
	     }


	}

	@Override
	public void remove(Object obj) throws Exception {
		// TODO Auto-generated method stub
		  Connection con=getConnection();
	      try{
	      dao.delete(con, obj);
	      con.commit();
	   }catch (Exception e){
	      con.rollback();
	      throw e;
	     }


	}

	@Override
	public Object get(Object obj) throws Exception {
		Object user = null;
		Connection con = getConnection();
		user = dao.select(con, obj);
		close(con);
		
		
		return user;
	}

	@Override
	public ArrayList<Object> get() throws Exception {
	ArrayList<Object> list = null;
	Connection con = getConnection();
	list = dao.select(con);
	close(con);
	
		return list;
	}

}
