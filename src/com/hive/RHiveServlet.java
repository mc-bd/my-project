package com.hive;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import com.db.product.ProductBiz;
import com.db.user.UserBiz;
import com.db.vo.Product;

@WebServlet({ "/RHiveServlet", "/rhive" })
public class RHiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductBiz biz;

	public RHiveServlet() {
		super();
		biz = new ProductBiz();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Object> plist = null;
		try {
			plist = biz.get();
			JSONArray ja = new JSONArray();
			for (Object obj : plist) {
				Product p = (Product) obj;
				JSONObject jobj = new JSONObject();
				jobj.put("name", p.getName());
				jobj.put("y", p.getPrice());
				ja.add(jobj);
			}
			response.setContentType("text/json;charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.print(ja.toJSONString());
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
