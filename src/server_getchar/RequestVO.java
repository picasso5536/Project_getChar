package server_getchar;

import java.io.Serializable;

public class RequestVO implements Serializable {
	private int REQUEST_ID, PDT_ID, KATEGORIE_ID, PDT_PRICE, REQUEST_DEPOSIT;
	private String PDT_INFO, MEMBER_NICKNAME, MEMBER_LOCAL, KATEGORIE_NAME, 
					REQUEST_START_DAY, REQUEST_END_DAY, PDT_NAME, MEMBER_ID, PDT_IMAGES;
	public int getREQUEST_ID() {
		return REQUEST_ID;
	}
	public void setREQUEST_ID(int rEQUEST_ID) {
		REQUEST_ID = rEQUEST_ID;
	}
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
	public int getREQUEST_DEPOSIT() {
		return REQUEST_DEPOSIT;
	}
	public void setREQUEST_DEPOSIT(int rEQUEST_DEPOSIT) {
		REQUEST_DEPOSIT = rEQUEST_DEPOSIT;
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
	public String getMEMBER_LOCAL() {
		return MEMBER_LOCAL;
	}
	public void setMEMBER_LOCAL(String mEMBER_LOCAL) {
		MEMBER_LOCAL = mEMBER_LOCAL;
	}
	public String getKATEGORIE_NAME() {
		return KATEGORIE_NAME;
	}
	public void setKATEGORIE_NAME(String kATEGORIE_NAME) {
		KATEGORIE_NAME = kATEGORIE_NAME;
	}
	public String getREQUEST_START_DAY() {
		return REQUEST_START_DAY;
	}
	public void setREQUEST_START_DAY(String rEQUEST_START_DAY) {
		REQUEST_START_DAY = rEQUEST_START_DAY;
	}
	public String getREQUEST_END_DAY() {
		return REQUEST_END_DAY;
	}
	public void setREQUEST_END_DAY(String rEQUEST_END_DAY) {
		REQUEST_END_DAY = rEQUEST_END_DAY;
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
	public String getPDT_IMAGES() {
		return PDT_IMAGES;
	}
	public void setPDT_IMAGES(String pDT_IMAGES) {
		PDT_IMAGES = pDT_IMAGES;
	}
	
	
}
