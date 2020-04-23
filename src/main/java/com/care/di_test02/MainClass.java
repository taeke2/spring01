package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext gxc = new GenericXmlApplicationContext(config);
		SaveClass sc = gxc.getBean("sc",SaveClass.class);
		
//		System.out.print("num1 : ");
//		sc.setNum1(new Scanner(System.in).nextInt());
//		System.out.print("num2 : ");
//		sc.setNum2(new Scanner(System.in).nextInt());
//		System.out.print("op : ");
//		sc.setOp(new Scanner(System.in).next());
		
		sc.operationClass();
		sc.printClass();
	}
}
