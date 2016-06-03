package cn.shandian.tianying.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAspect {
	public void doBefore() {
		System.out.println("XML Aspect doBefore....");
	}

	public void doAfter() {
		System.out.println("XML Aspect doAfter....");
	}

	public void doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("XML Aspect 环绕前....");
		Object o = pjp.proceed();
		System.out.println("XML Aspect 环绕后....");
	}

	public void doAfterReturning(String result) {
		System.out.println("XML doAfterReturning..." + result);
	}

	public void doAfterThrowing(Exception ex) {
		System.out.println("XML doAfterThrowing..." + ex.getMessage());
	}
}
