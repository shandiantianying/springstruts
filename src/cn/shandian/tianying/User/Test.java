package cn.shandian.tianying.User;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

public class Test {
	public static void main(String[] args) throws OgnlException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", "zhangsan");
		map.put("age", 123);
		User user = new User();
		user.setUserName("zeor");
		Object obj = Ognl.getValue("#userName",map,user);
		System.out.println(obj);
	}

}
