package cn.shandian.tianying.User;

import java.util.List;

import org.springframework.transaction.support.TransactionTemplate;

public class AddUserDao {
	private TransactionTemplate transactionTemplate;

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void addUser() {

		/// transactionTemplate.execute(arg0)
		// transactionTemplate.execute(arg0)
	}

	public void delUser() {

	}

	public List<User> getlistuser() {
		return null;
	}
}
