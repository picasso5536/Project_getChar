package chat_;

import java.io.Serializable;

public class Protocol implements Serializable{

	// 객체 직렬화

	/*
	 * 통신 규약 cmd 0 -> 종료(접속해제) cmd 1 -> 닉네임 cmd 2 -> 메시지
	 */

	int cmd;
	String msg;

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
