package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st = new STBean();
		String config = "classpath:applicationST.xml";	// classpath 는 resource에 있는 파일을 보겠다는 의미 / config에 경로 저장
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);	// ctx에 객체들이 담긴 컨테이너가 저장된다.
		STBean st = ctx.getBean("stb",STBean.class);	// xml에 설정된 Bean을 가져오는데 반환되는 형태가 STBean이므로 st의 객체는 STBean이다.
		
		//st.setName("홍길동123");
		//st.setAge(2000);
		//st.setSt(new Student());
		
		st.namePrint();
		st.agePrint();
	}
}
