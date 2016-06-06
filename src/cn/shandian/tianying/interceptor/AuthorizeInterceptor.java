package cn.shandian.tianying.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorizeInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Map<String, Object> session = ctx.getSession();
		if (session.get("name") != null) {
			String result = invocation.invoke();
			return result;
		}
		return "logout";
	}

}
