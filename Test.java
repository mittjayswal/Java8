package com.as.mitt.javainterview;

import java.io.CharConversionException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface  Test {
	default void m1() {
		System.out.println("default method m1");
	}
	default void m2() {
		System.out.println("default method m2");
	}
	default void m3(int a) {
		System.out.println("default method m3 a= "+a);
	}
	
	public static void m4() {
		System.out.println("m4");
	}
	public static void m5() {
		System.out.println("m5");
	}
}
interface a{
	default void m1() {
		System.out.println("default method m1");
	}
}
class b implements Test,a{
	
	public static void main(String[] args) {
		Test t =   new b();
		t.m1();
		t.m3(2);
		Test.m4();
		Test.m5();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Test.super.m1();
	}

	/*@Override
	public void m1() {
		// TODO Auto-generated method stub
		a.super.m1();
	}*/
}

