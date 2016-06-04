package cn.shandian.tianying.User;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.shandian.tianying.aop.Service;
import cn.shandian.tianying.inter.IUser;
import cn.shandian.tianying.utils.ApplicationContextUtils;

public class LoginAction {
	private String name;
	private String pwd;
	private String userAge;
	private String userAddress;

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	private String userPassword;

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

	public boolean checkUser(User user) {
		return false;
	}

	public String register() {
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// IUser mapper = (IUser) ctx.getBean("userMapper");
		IUser mapper = ApplicationContextUtils.getIUser();
		User user = new User();
		user.setUserAge(Integer.parseInt(pwd));
		user.setUserName(name);

		user.setUserAddress(userAddress);
		mapper.addUser(user);

		return "success";
		// if (user1 != null) {
		// return "success";
		// } else {
		// return "input";
		// }
	}

	public String execute() {
		System.out.println("--------------------------" + this.name);
		System.out.println("--------------------------" + this.pwd);
		// if (!name.equals("admin")) {
		// return "input";
		// }
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		IUser mapper = (IUser) ctx.getBean("userMapper");
		IUser mapper = ApplicationContextUtils.getIUser();
		User user = new User();
		user.setUserAge(Integer.parseInt(pwd));
		user.setUserName(name);
		User user1 = mapper.selectUserByUser(user);

		if (user1 != null) {
			return "success";
		} else {
			return "input";
		}

		// System.out.println("userMapper:" +
		// mapper.selectUserByID(1).getUserName());

		// List<User> users = mapper.selectUsers("·ÉÄñ");

		// Service ser = (Service)ctx.getBean("serviceA");
		// ser.foo("serverA");
		// User user = (User) ctx.getBean("user");
		// user.setUserName("ÕÅÈý");
		//
		// System.out.println(user.getUserName());
		// System.out.println("execute...");
		// return "success";

	}

}
