package server_getchar;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class CopyClient extends Thread {
	Socket s;
	GetChar_Server server;

	// 객체 직렬화(objectInputStream, objectOutputStream)
	ObjectInputStream in;
	ObjectOutputStream out;
	String ip;

	public CopyClient(Socket s, GetChar_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}

	@Override
	public synchronized void run() {
		bk: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 접속해제
						out.writeObject(p);
						out.flush();
						break bk; // 접속 해제
					
					case 1: // 전체보기
						Protocol p1 = new Protocol();
						List<CustomerVO> list = DAO.getList();
						// 전체 인원에게 전달하려면 server.sendMsg() 사용
						// 해당 사람에게만 보내려면 여기서 보냄
						p1.setCmd(1);
						p1.setList(list);
						out.writeObject(p1);
						out.flush();
						break;
					
					case 2: // 삽입
						// 삽입 전에 custid가 존재하는지 검사
						int res = DAO.getIdChk(p.getVo().getCustid());
						if(res > 0) {
							Protocol id_chk1 = new Protocol();
							id_chk1.setCmd(7);
							id_chk1.setResult(res);
							
							out.writeObject(id_chk1);
							out.flush();
							
						} else {
							int result = DAO.getIns(p.getVo());
							if(result >0){
								Protocol p2 = new Protocol();
								List<CustomerVO> list2 = DAO.getList();
								// 전체 인원에게 전달하려면 server.sendMsg() 사용
								// 해당 사람에게만 보내려면 여기서 보냄
								p2.setCmd(1);
								p2.setList(list2);
								out.writeObject(p2);
								out.flush();
							}							
						}
						break;
						
					case 3: // 삭제
						int res2 = DAO.getIdChk(p.getMsg());
						if(res2 > 0 ) {
							int result2 = DAO.getDel(p.getMsg());
							if(result2 > 0) {
								Protocol p3 = new Protocol();
								List<CustomerVO> list3 = DAO.getList();
								p3.setCmd(1);
								p3.setList(list3);
								out.writeObject(p3);
								out.flush();
							}	
						}else {
							Protocol id_chk2 = new Protocol();
							id_chk2.setCmd(7);
							id_chk2.setResult(res2);
							out.writeObject(id_chk2);
							out.flush();
						}			
						break;
						
					case 4: // 검색
						int res3 = DAO.getIdChk(p.getMsg());
						if(res3 > 0) {
							CustomerVO vo = DAO.getOne(p.getMsg());
							if(vo != null) {
								Protocol p4 = new Protocol();
								p4.setCmd(4);
								p4.setVo(vo);
								out.writeObject(p4);
								out.flush();
							}
						}else {
							Protocol id_chk3 = new Protocol();
							id_chk3.setCmd(7);
							id_chk3.setResult(res3);
							out.writeObject(id_chk3);
							out.flush();
						}
						break;
					
					case 5: // 불러오기
						int res4 = DAO.getIdChk(p.getMsg());
						if(res4 > 0) {
							CustomerVO vo2 = DAO.getOne(p.getMsg());
							if(vo2 != null) {
								Protocol p5 = new Protocol();
								p5.setCmd(5);
								p5.setVo(vo2);
								out.writeObject(p5);
								out.flush();
							}
						} else {
							Protocol id_chk4 = new Protocol();
							id_chk4.setCmd(7);
							id_chk4.setResult(res4);
							out.writeObject(id_chk4);
							out.flush();
						}
						break;
					
					case 6: // 수정
						int result3 = DAO.getUpdate(p.getVo());
						if(result3 > 0) {
							Protocol p6 = new Protocol();
							List<CustomerVO> list4 = DAO.getList();
							p6.setCmd(1);
							p6.setList(list4);
							out.writeObject(p6);
							out.flush();
						}
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		try {
			out.close();
			in.close();
			s.close();

			server.removeClient(this);
			Protocol p2 = new Protocol();
			p2.setCmd(2);
			p2.setMsg(ip + "님 퇴장");
		} catch (Exception e) {
			// TODO: handle exception
		}
	} // run 끝
}
