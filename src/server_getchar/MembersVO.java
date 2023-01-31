package server_getchar;

import java.io.Serializable;

public class MembersVO implements Serializable{
	private String member_id, member_pw, member_nickname, member_local, member_name1, member_reg_num,
	member_attention, member_path, member_email, member_join, member_access;
	
	private int member_phone, member_withdraw, member_point;

	
	
	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_nickname() {
		return member_nickname;
	}

	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}

	public String getMember_local() {
		return member_local;
	}

	public void setMember_local(String member_local) {
		this.member_local = member_local;
	}

	public String getMember_name1() {
		return member_name1;
	}

	public void setMember_name1(String member_name1) {
		this.member_name1 = member_name1;
	}

	public String getMember_reg_num() {
		return member_reg_num;
	}

	public void setMember_reg_num(String member_reg_num) {
		this.member_reg_num = member_reg_num;
	}

	public String getMember_attention() {
		return member_attention;
	}

	public void setMember_attention(String member_attention) {
		this.member_attention = member_attention;
	}

	public String getMember_path() {
		return member_path;
	}

	public void setMember_path(String member_path) {
		this.member_path = member_path;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_join() {
		return member_join;
	}

	public void setMember_join(String member_join) {
		this.member_join = member_join;
	}

	public String getMember_access() {
		return member_access;
	}

	public void setMember_access(String member_access) {
		this.member_access = member_access;
	}

	public int getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(int member_phone) {
		this.member_phone = member_phone;
	}

	public int getMember_withdraw() {
		return member_withdraw;
	}

	public void setMember_withdraw(int member_withdraw) {
		this.member_withdraw = member_withdraw;
	}

	public int getMember_point() {
		return member_point;
	}

	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}

}
