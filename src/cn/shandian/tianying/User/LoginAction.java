package cn.shandian.tianying.User;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.shandian.tianying.aop.Service;
import cn.shandian.tianying.inter.IUser;
import cn.shandian.tianying.utils.ApplicationContextUtils;
import cn.shandian.tianying.vo.UserRegisterFormBean;

public class LoginAction extends ActionSupport {
	private static Map session;
	private static ActionContext act;
	static {
		act = ActionContext.getContext();
		session = act.getSession();
	}
	private UserRegisterFormBean userRegisterFormBean;

	public UserRegisterFormBean getUserRegisterFormBean() {
		return userRegisterFormBean;
	}

	public void setUserRegisterFormBean(UserRegisterFormBean userRegisterFormBean) {
		this.userRegisterFormBean = userRegisterFormBean;
	}

	public LoginAction() {
		System.out.println("constructor...");
	}

	public String register() {
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// IUser mapper = (IUser) ctx.getBean("userMapper");

		IUser mapper = ApplicationContextUtils.getIUser();

		List<User> userl = mapper.selectUsers(userRegisterFormBean.getName());

		if (userl.size() > 0) {
			addActionMessage("���û����ѱ�ע�ᣡ");
			return "register";
		}

		User user = new User();
		try {
			user.setUserAge(userRegisterFormBean.getUserAge());
			user.setUserName(userRegisterFormBean.getName());
			user.setUserAddress(userRegisterFormBean.getUserAddress());
			mapper.addUser(user);
			return "login";
		} catch (Exception e) {
			addActionMessage("ע���û�ʧ�ܣ�");
			return "register";
		}
		// if (user1 != null) {
		// return "success";
		// } else {
		// return "input";
		// }
	}

	public String execute() {
		System.out.println("--------------------------" + userRegisterFormBean.getName());
		System.out.println("--------------------------" + userRegisterFormBean.getUserAge());
		// if (!name.equals("admin")) {
		// return "input";
		// }
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// IUser mapper = (IUser) ctx.getBean("userMapper");
		IUser mapper = ApplicationContextUtils.getIUser();
		User user = new User();
		user.setUserAge(userRegisterFormBean.getUserAge());
		user.setUserName(userRegisterFormBean.getName());
		User user1 = mapper.selectUserByUser(user);
		if (user1 != null) {
			session.put("name", user1.getUserName());
			return "success";
		} else {
			addActionMessage("�û������������");
			return "input";
		}

		// System.out.println("userMapper:" +
		// mapper.selectUserByID(1).getUserName());

		// List<User> users = mapper.selectUsers("����");

		// Service ser = (Service)ctx.getBean("serviceA");
		// ser.foo("serverA");
		// User user = (User) ctx.getBean("user");
		// user.setUserName("����");
		//
		// System.out.println(user.getUserName());
		// System.out.println("execute...");
		// return "success";

	}

	/** ���ܣ��˳���¼ */
	public String Logout() {
		session.clear();
		return "logout";
	}

}
