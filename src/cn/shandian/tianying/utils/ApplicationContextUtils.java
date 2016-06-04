package cn.shandian.tianying.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.shandian.tianying.inter.IUser;

public class ApplicationContextUtils {
	private static ApplicationContext ctx;
	private static IUser mapper;
	static {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		mapper = (IUser) ctx.getBean("userMapper");
	}

	public static IUser getIUser() {
		return mapper;
	}
}
