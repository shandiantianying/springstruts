package cn.shandian.tianying.User;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.shandian.tianying.aop.Service;
import cn.shandian.tianying.inter.IUser;

public class LoginAction {
	private String name;
	private String pwd;

	public LoginAction() {
		System.out.println("constructor...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String execute() {
  
	   	if(!name.equals("admin")) {
	   		return "input";
	   	}
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUser mapper = (IUser) ctx.getBean("userMapper");
		System.out.println("userMapper:"+mapper.selectUserByID(1).getUserName());
		
		List<User> users= mapper.selectUsers("·ÉÄñ");
	
		// Service ser = (Service)ctx.getBean("serviceA");
		// ser.foo("serverA");
		// User user = (User) ctx.getBean("user");
		// user.setUserName("ÕÅÈý");
		//
		// System.out.println(user.getUserName());
		System.out.println("execute...");
		return "success";

	}

}
