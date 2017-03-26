package com.hive;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

public class Word {
	RConnection rconn;
	REXP x;
	
	public byte[] getGraph() throws Exception{
		rconn = new RConnection();
		rconn.eval("source('C:/rr/rhive/word.R')");
		rconn.eval("try(jpeg('wc2.jpg',quality=90))");
		rconn.eval("wc2()");
		rconn.eval("graphics.off()");
		rconn.eval("wr=readBin('wc2.jpg','raw',600*600)");
		x = rconn.eval("wr");
		
		
		
		int a = 100;
		int b = 100;
		int c = 100;
		
		int n = 0; // µî±Þ
		
		if (a > 158900) {
			n = 14;
		} else {
			
		}
		
		
		
		rconn.close();
		return x.asBytes();
		
	}
	
}
