package cn.shandian.tianying.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAspect {
	@Pointcut("execution(* cn.shandian.tianying.*.*.*(..))")
	public void pointCutMethod() {
	}

	@Before("pointCutMethod()")
	public void doBefore(JoinPoint jp) {
		System.out
				.println("doBefore........." + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
	}

	@After("pointCutMethod()")
	public void doAfter(JoinPoint jp) {
		System.out.println("doAfter......" + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
	}

	@AfterReturning(pointcut = "pointCutMethod()", returning = "result")
	public void doAfterReturning(String result) {
		System.out.println("doAfterReturning......" + result);
	}

	// @Around("pointCutMethod()")
	// public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
	// System.out.println("环绕执行前");
	// Object o = pjp.proceed();
	// System.out.println("环绕执行后");
	// return 0;
	// }
	//
	@AfterThrowing(pointcut = "pointCutMethod()", throwing = "ex")
	public void doAfterThrowing(Exception ex) {
		System.out.println("doAfterThrowing...." + ex.getMessage());

	}

}
