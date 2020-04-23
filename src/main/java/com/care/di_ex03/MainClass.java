package com.care.di_ex03;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:applicationPC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		SaveClass st = ctx.getBean("sc", SaveClass.class);
		/*
		ArrayList<String> hobby = new ArrayList<String>();
		HashMap<String, String> weather = new HashMap<String, String>();
		hobby.add("°ÔÀÓ");
		hobby.add("À¥Å÷");
		weather.put("¿À´Ã", "¹Ù¶÷ Ãä´Ù");
		weather.put("³»ÀÏ", "´þ´Ù");
		st.setName("È«±æµ¿");
		st.setHobby(hobby);
		st.setWeather(weather);
		*/
		st.pcFunc();
		System.out.println();
		SaveClass st01 = ctx.getBean("sc01", SaveClass.class);
		st01.pcFunc();
	}
}
