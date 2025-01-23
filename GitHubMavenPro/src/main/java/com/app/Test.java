package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);

	
   Student s=(Student) apc.getBean("s1");
	
	System.out.println(s.getRollno());
	System.out.println(s.getName());
	System.out.println(s.getAddress());
	System.out.println(s.getMobile());
}
}
