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
		
		int totalspend = 0; // ���
		
		if (clothing < 158900) {
			if(clothing<83420){
				if(soju<20000){
					System.out.println("�ѼҺ�<1014000, �Һ��� 7");
				}else{
				
					System.out.println("�ѼҺ�<1541000, �Һ���6");
				}
			}
					else{
					if(clothing<124400){
						System.out.println("�ѼҺ�<2204000 �Һ��� 5");
					}else{
						System.out.println("�ѼҺ�<2823000, �Һ��� 4");
					}
			}
			
				}else{
				if(nonrecurring<259000){
					if(clothing<196900){
						System.out.println("�ѼҺ� <3451000, �Һ��� 3");
					}else{
						System.out.println("�ѼҺ� <4061000 , �Һ��� 2");
					}
					
				}else{
					System.out.println("�ѼҺ�>5384000, �Һ��� 1");
				}
				}
			
				
				
			
	
		
		
		rconn.close();
		return x.asBytes();
		
	}

}
