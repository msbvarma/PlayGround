package com.prac.singleton;

public class SingleTonClassSample {
	public static SingleTonClassSample sample=null;
	
	private SingleTonClassSample(){
		
	}
	public static SingleTonClassSample getInstance() {
		if(sample==null)
			sample= new SingleTonClassSample();
	return sample;			
	}

}
