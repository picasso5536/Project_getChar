package server_getchar;

import java.io.Serializable;

public class AdminVO implements Serializable{
	private String admin_id, admin_name, admin_phone, admin_aeg_num, member_id;
	private int admin_pw;
	
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_phone() {
		return admin_phone;
	}
	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}
	public String getAdmin_aeg_num() {
		return admin_aeg_num;
	}
	public void setAdmin_aeg_num(String admin_aeg_num) {
		this.admin_aeg_num = admin_aeg_num;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getAdmin_pw() {
		return admin_pw;
	}
	public void setAdmin_pw(int admin_pw) {
		this.admin_pw = admin_pw;
	}
}
