package com.hive;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

public class Word2 {
	RConnection rconn;
	REXP x;
	
	public byte[] getGraph() throws Exception{
		rconn = new RConnection();
		rconn.eval("source('C:/r_project/new1.R')");
		rconn.eval("try(jpeg('tree.jpg',quality=90))");
		rconn.eval("tree()");
		rconn.eval("graphics.off()");
		rconn.eval("wr=readBin('tree.jpg','raw',600*600)");
		x = rconn.eval("wr");
		System.out.println("success");

		
		
		rconn.close();
		return x.asBytes();
		
	}
	
}
