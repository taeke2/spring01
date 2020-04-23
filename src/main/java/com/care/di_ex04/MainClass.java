package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.di_ex03.SaveClass;

public class MainClass {
	public static void main(String[] args) {
		//Car car = new Controller02();
		//Controller02 car = new Controller02();
		
		String config = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("메인 클래스도 속력을 냅니다!!");
		car.speed();
		SubClass sc = new SubClass();
		sc.subFunc();
	}
}
