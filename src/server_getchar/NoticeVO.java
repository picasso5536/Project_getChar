package server_getchar;

import java.io.Serializable;

public class NoticeVO implements Serializable{
	private String notice_info, notice_file, notice_title;
	private int notice_id, notice_visible;
	
	public String getNotice_info() {
		return notice_info;
	}
	public void setNotice_info(String notice_info) {
		this.notice_info = notice_info;
	}
	public String getNotice_file() {
		return notice_file;
	}
	public void setNotice_file(String notice_file) {
		this.notice_file = notice_file;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public int getNotice_visible() {
		return notice_visible;
	}
	public void setNotice_visible(int notice_visible) {
		this.notice_visible = notice_visible;
	}
}
