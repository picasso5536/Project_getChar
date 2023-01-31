package server_getchar;

import java.io.Serializable;

public class ReviewVO implements Serializable{
	private int REVIEW_ID, PDT_ID, REVIEW_STAR;
	private String REVIEW_INFO, MEMBER_NICKNAME, REVIEW_DRAW_UP, PDT_NAME, MEMBER_ID;
	public int getREVIEW_ID() {
		return REVIEW_ID;
	}
	public void setREVIEW_ID(int rEVIEW_ID) {
		REVIEW_ID = rEVIEW_ID;
	}
	public int getPDT_ID() {
		return PDT_ID;
	}
	public void setPDT_ID(int pDT_ID) {
		PDT_ID = pDT_ID;
	}
	public int getREVIEW_STAR() {
		return REVIEW_STAR;
	}
	public void setREVIEW_STAR(int rEVIEW_STAR) {
		REVIEW_STAR = rEVIEW_STAR;
	}
	public String getREVIEW_INFO() {
		return REVIEW_INFO;
	}
	public void setREVIEW_INFO(String rEVIEW_INFO) {
		REVIEW_INFO = rEVIEW_INFO;
	}
	public String getMEMBER_NICKNAME() {
		return MEMBER_NICKNAME;
	}
	public void setMEMBER_NICKNAME(String mEMBER_NICKNAME) {
		MEMBER_NICKNAME = mEMBER_NICKNAME;
	}
	public String getREVIEW_DRAW_UP() {
		return REVIEW_DRAW_UP;
	}
	public void setREVIEW_DRAW_UP(String rEVIEW_DRAW_UP) {
		REVIEW_DRAW_UP = rEVIEW_DRAW_UP;
	}
	public String getPDT_NAME() {
		return PDT_NAME;
	}
	public void setPDT_NAME(String pDT_NAME) {
		PDT_NAME = pDT_NAME;
	}
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	
	
}
