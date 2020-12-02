package com.kumsal.spring.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	private Logger myLogger=Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.kumsal.spring.controller.*.*(..))")
	private void forControllPackacge(){
		
	}
	
		
	@Pointcut("execution(* com.kumsal.spring.service.*.*(..))")
	private void forServicePackacge(){
		
	}
	
	@Pointcut("execution(* com.kumsal.spring.dao.*.*(..))")
	private void forDaoPackacge(){
		
	}
	
	@Pointcut("forControllPackacge || forServicePackacge || forDaoPackacge")
	private void forAppFlow(){
		
	}
	
	@Before("forAppFlow")
	public void before(JoinPoint thePoint){
		String method=thePoint.getSignature().toString();
		myLogger.info("Before calling Method====>"+method);
		
		
		
	}
}
