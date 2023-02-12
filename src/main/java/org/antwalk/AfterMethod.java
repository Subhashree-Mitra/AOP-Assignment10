package org.antwalk;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterMethod implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("AFTER METHOD EXECUTED");
	}

}
