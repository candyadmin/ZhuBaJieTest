package domain;

public class User {
	private int user_id;
	private String user_username;
	private String user_password;
	private int user_idcard;
	private String user_realname;
	private String user_major;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public int getUser_idcard() {
		return user_idcard;
	}
	public void setUser_idcard(int user_idcard) {
		this.user_idcard = user_idcard;
	}
	public String getUser_realname() {
		return user_realname;
	}
	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}
	public String getUser_major() {
		return user_major;
	}
	public void setUser_major(String user_major) {
		this.user_major = user_major;
	}
	public String getUser_introduce() {
		return user_introduce;
	}
	public void setUser_introduce(String user_introduce) {
		this.user_introduce = user_introduce;
	}
	public String getUser_certificate() {
		return user_certificate;
	}
	public void setUser_certificate(String user_certificate) {
		this.user_certificate = user_certificate;
	}
	public String getUser_certificate_img() {
		return user_certificate_img;
	}
	public void setUser_certificate_img(String user_certificate_img) {
		this.user_certificate_img = user_certificate_img;
	}
	private String user_introduce;
	private String user_certificate;
	private String user_certificate_img;

}
