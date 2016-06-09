package cn.shandian.tianying.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownAction extends ActionSupport {
	private int number;
	private String fileName;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getDownloadFile() throws Exception {
		if (1 == number) {
			this.fileName = "Drame.jpg";
			return ServletActionContext.getServletContext().getResourceAsStream("upload/Dream.jpg");
		} else if (2 == number) {
			this.fileName = "客户端税务局.rar";
			this.fileName = new String(this.fileName.getBytes("GBK"), "ISO-8859-1");
			return ServletActionContext.getServletContext().getResourceAsStream("upload/客户端税务局.rar");
		} else {
			return null;
		}
	}

	public String execute() throws Exception {
		return SUCCESS;
	}
}
