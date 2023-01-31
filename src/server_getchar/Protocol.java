package server_getchar;

import java.io.Serializable;
import java.util.List;

//객체 직렬화
public class Protocol implements Serializable{
	/*
	 * 통신 규약
	 * cmd 0 -> 종료(접속해제)
	 * cmd 1 -> 접속
	 * cmd 2 -> 전체보기 (list)
	 * cmd 3 -> 삽입 (result)
	 * cmd 4 -> 삭제 (result)
	 * cmd 5 -> 검색 (vo)
	 * cmd 6 -> 수정 (result)
	 * cmd 7 -> 아이디 체크 결과 (result, 0 = 없음 / 1이상 = 있음)
	 * cmd 8 -> msg(채팅)
	 */
	
	int cmd;
	String msg;
	List<MembersVO> list;
	// List<KategorieVO> list2;
	
	int result;
	MembersVO vo; // 직렬화를 미리 해두어야 함
	
	public List<MembersVO> getList() {
		return list;
	}
	public void setList(List<MembersVO> list) {
		this.list = list;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public MembersVO getVo() {
		return vo;
	}
	public void setVo(MembersVO vo) {
		this.vo = vo;
	}
	
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
