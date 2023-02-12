package org.antwalk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = (Student)context.getBean("beforeProxy");
		Student s2 = (Student)context.getBean("afterProxy");
		
		System.out.println("---------------------------------------");
		s1.showResult();
		System.out.println("---------------------------------------");
		
		System.out.println("---------------------------------------");
		s2.showResult();
		System.out.println("---------------------------------------");

	}

}
