package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st = new STBean();
		String config = "classpath:applicationST.xml";	// classpath �� resource�� �ִ� ������ ���ڴٴ� �ǹ� / config�� ��� ����
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);	// ctx�� ��ü���� ��� �����̳ʰ� ����ȴ�.
		STBean st = ctx.getBean("stb",STBean.class);	// xml�� ������ Bean�� �������µ� ��ȯ�Ǵ� ���°� STBean�̹Ƿ� st�� ��ü�� STBean�̴�.
		
		//st.setName("ȫ�浿123");
		//st.setAge(2000);
		//st.setSt(new Student());
		
		st.namePrint();
		st.agePrint();
	}
}
