package server_getchar;

import java.io.Serializable;

public class InquireVO implements Serializable{
	private String inquire_title, inquire_nickname, inquire_draw_up, inquire_state, member_id;
	private int inquire__id;
	
	public String getInquire_title() {
		return inquire_title;
	}
	public void setInquire_title(String inquire_title) {
		this.inquire_title = inquire_title;
	}
	public String getInquire_nickname() {
		return inquire_nickname;
	}
	public void setInquire_nickname(String inquire_nickname) {
		this.inquire_nickname = inquire_nickname;
	}
	public String getInquire_draw_up() {
		return inquire_draw_up;
	}
	public void setInquire_draw_up(String inquire_draw_up) {
		this.inquire_draw_up = inquire_draw_up;
	}
	public String getInquire_state() {
		return inquire_state;
	}
	public void setInquire_state(String inquire_state) {
		this.inquire_state = inquire_state;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getInquire__id() {
		return inquire__id;
	}
	public void setInquire__id(int inquire__id) {
		this.inquire__id = inquire__id;
	}
	
}
