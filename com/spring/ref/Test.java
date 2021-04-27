package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
		A a=(A) context.getBean("aref");
		//A's field
		System.out.println(a.getX());
		//B's field
		System.out.println(a.getOb().getY());
		
		System.out.println(a);
	}

}
