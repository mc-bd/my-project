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
		
		
		
		int clothing = 100;
		int soju = 100;
		int nonrecurring = 100;
		
		int totalspend = 0; // 등급
		
		if (clothing < 158900) {
			if(clothing<83420){
				if(soju<20000){
					System.out.println("총소비<1014000, 소비등급 7");
				}else{
				
					System.out.println("총소비<1541000, 소비등급6");
				}
			}
					else{
					if(clothing<124400){
						System.out.println("총소비<2204000 소비등급 5");
					}else{
						System.out.println("총소비<2823000, 소비등급 4");
					}
			}
			
				}else{
				if(nonrecurring<259000){
					if(clothing<196900){
						System.out.println("총소비 <3451000, 소비등급 3");
					}else{
						System.out.println("총소비 <4061000 , 소비등급 2");
					}
					
				}else{
					System.out.println("총소비>5384000, 소비등급 1");
				}
				}
			
				
				
			
	
		
		
		rconn.close();
		return x.asBytes();
		
	}

}
