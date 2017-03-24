package com.hive;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

public class Predict {
	RConnection rconn;
	REXP x1;
	

	public double getGraph(int a, int b, int c, int d) throws Exception {
		rconn = new RConnection();
		rconn.eval(" source('C:/r_project/new1.R', encoding = 'UTF-8', echo=TRUE)");
		System.out.println("ok");
		x1 = rconn.eval("pre1(" + a + "," + b + "," + c + "," + d + ")");
		
		rconn.close();
		return x1.asDouble();
	}
	
	
	
	
	public static void main(String args[]){
		Predict p = new Predict();
		double d = 0;

		System.out.println(d);
	}
}
