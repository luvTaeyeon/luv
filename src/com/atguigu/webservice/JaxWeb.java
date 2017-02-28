package com.atguigu.webservice;

public class JaxWeb {

	interface WW{
		
		int fn(int a,int b);
	}
	
	public static void main(String[] args) {
		WW ww = (int a,int b)->a-b;
		
		System.out.println(ww.fn(8, 9));
		int ty = 309;
		
		String kim = "taeyeon";
	}
}
