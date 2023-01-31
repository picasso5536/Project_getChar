package server_getchar;

import java.io.Serializable;

public class PDTVO implements Serializable{
	private int PDT_ID, KATEGORIE_ID, PDT_PRICE;
	private String PDT_STATE, PDT_INFO, MEMBER_NICKNAME, MEMBER_ID, PDT_IMAGES, MEMBER_LOCAL, PDT_NAME;
	public int getPDT_ID() {
		return PDT_ID;
	}
	public void setPDT_ID(int pDT_ID) {
		PDT_ID = pDT_ID;
	}
	public int getKATEGORIE_ID() {
		return KATEGORIE_ID;
	}
	public void setKATEGORIE_ID(int kATEGORIE_ID) {
		KATEGORIE_ID = kATEGORIE_ID;
	}
	public int getPDT_PRICE() {
		return PDT_PRICE;
	}
	public void setPDT_PRICE(int pDT_PRICE) {
		PDT_PRICE = pDT_PRICE;
	}
	public String getPDT_STATE() {
		return PDT_STATE;
	}
	public void setPDT_STATE(String pDT_STATE) {
		PDT_STATE = pDT_STATE;
	}
	public String getPDT_INFO() {
		return PDT_INFO;
	}
	public void setPDT_INFO(String pDT_INFO) {
		PDT_INFO = pDT_INFO;
	}
	public String getMEMBER_NICKNAME() {
		return MEMBER_NICKNAME;
	}
	public void setMEMBER_NICKNAME(String mEMBER_NICKNAME) {
		MEMBER_NICKNAME = mEMBER_NICKNAME;
	}
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getPDT_IMAGES() {
		return PDT_IMAGES;
	}
	public void setPDT_IMAGES(String pDT_IMAGES) {
		PDT_IMAGES = pDT_IMAGES;
	}
	public String getMEMBER_LOCAL() {
		return MEMBER_LOCAL;
	}
	public void setMEMBER_LOCAL(String mEMBER_LOCAL) {
		MEMBER_LOCAL = mEMBER_LOCAL;
	}
	public String getPDT_NAME() {
		return PDT_NAME;
	}
	public void setPDT_NAME(String pDT_NAME) {
		PDT_NAME = pDT_NAME;
	}
	
}
