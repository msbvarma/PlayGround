package com.prac.singleton;

public class TestSingleTon{

	public static void main(String[] args) {

		SingleTonClassSample s1= SingleTonClassSample.getInstance();
		SingleTonClassSample s2= SingleTonClassSample.getInstance();
		
		//SingleTonClassSample s3= new SingleTonClassSample();
		System.out.println("Created S1:"+s1+" - S2:"+s2+" - S3:");
		
	}

}
