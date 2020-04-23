package com.care.di_ex01;

public class MainClass {
	public static void main(String[] args) {
		STBean st = new STBean();
		st.setName("ȫ�浿");
		st.setAge(20);
		st.setSt(new Student());
		
		st.namePrint();
		st.agePrint();
	}
}
