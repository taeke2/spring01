package com.care.di_test03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_test03.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		StudentClass sc = ctx.getBean("sc", StudentClass.class);
		
		sc.execute();
	}
}
