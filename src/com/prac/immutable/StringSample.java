package com.prac.immutable;

public class StringSample {

	public static void main(String[] args) {
	String s1="Hello";//new String("abc");//"abc";
	String s2="Hello";//new String("abc");//"abc";
	System.out.println(s1.hashCode()+"--"+s2.hashCode());
	s1=s1+" bbc";
	
	System.out.println(s1.hashCode()+"--"+s2.hashCode());
	}
}
