package cn.shandian.tianying.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	private File file;
	// �ύ������file������
	private String fileFileName;
	// �ύ������file��MIME����
	private String fileContentType;

	public String execute() throws Exception {
		String root = ServletActionContext.getServletContext().getRealPath("/upload");
		System.out.println(root);
		System.out.println(fileFileName);
		System.out.println(file);
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream(new File(root, fileFileName));

		System.out.println("fileFileName: " + fileFileName);

		// ��Ϊfile�Ǵ������ʱ�ļ��е��ļ������ǿ��Խ����ļ������ļ�·����ӡ����������֮ǰ��fileFileName�Ƿ���ͬ
		System.out.println("file: " + file.getName());
		System.out.println("file: " + file.getPath());

		byte[] buffer = new byte[500];
		int length = 0;
		while (-1 != (length = is.read(buffer, 0, buffer.length))) {
			os.write(buffer);
		}

		os.close();
		is.close();

		return "success";

	}
}
