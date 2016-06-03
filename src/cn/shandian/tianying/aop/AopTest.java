package cn.shandian.tianying.aop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.shandian.tianying.User.Article;
import cn.shandian.tianying.User.User;
import cn.shandian.tianying.aop.Service;
import cn.shandian.tianying.aop.ServiceB;
import cn.shandian.tianying.inter.IUser;

public class AopTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUser mapper = (IUser) ctx.getBean("userMapper");
		// ����id=1���û���ѯ���������ݿ��е���������Ըĳ����Լ���.
		User user = mapper.selectUserByID(2);
		if (user == null)
			System.out.println("user is null");
		else
			System.out.println(user.getUserName());
		// User uer =(User)ctx.getBean("user");
		// uer.setUserAge(30);
		// uer.setUserName("����");
		// uer.setUserAddress("�ڷ�ͷ�д����");
		//
		// mapper.addUser(uer);
		//
		// List<Article> articles = mapper.getUserArticles(1);
		//
		// for(Article article:articles){
		// User ur = article.getUser();
		// System.out.println(article.getTitle()+"----"+article.getContent()+"----"+ur.getUserName()+"-----"+ur.getUserAddress());
		// }

		// List<User> users = mapper.selectUsers("����");
		//
		// for (User us : users) {
		// System.out.println(us.getUserAge() + "-------" + us.getUserName() +
		// "-----" + us.getUserAddress());
		// }
	}

}
