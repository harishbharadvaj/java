package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Father f = (Father)context.getBean("father");
		Son son = (Son) context.getBean("son");
		System.out.println(f.getFatherName());
		System.out.println(son.getFather().getFatherName());
		System.out.println(f.getSon().getSonName());
	}
}
