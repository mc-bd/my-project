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
		

		
		
		rconn.close();
		return x.asBytes();
		
	}
	
}
