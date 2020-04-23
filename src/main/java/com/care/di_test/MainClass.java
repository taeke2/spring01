package com.care.di_test;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_test.xml";
		GenericXmlApplicationContext gxc = new GenericXmlApplicationContext(config);
		PrintBean ps = gxc.getBean("pb", PrintBean.class );
		
		//System.out.print("°ª ÀÔ·Â : ");
		//ps.setPrint(new Scanner(System.in).next());
		ps.printString();
	}
}
