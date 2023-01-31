package chat_;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	Server server;

	//객체 직렬화(objectInputStream, objectOutputStream)
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	public CopyClient(Socket s, Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		bk:while (true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					case 0: out.writeObject(p); break bk; // 접속 해제
					case 1: nickName = p.getMsg();
						p.setCmd(2);
						p.setMsg(nickName + "님 입장");// 닉네임
						//접속자 모두에게 전달
						server.sendMsg(p);
					case 2: p.setMsg(nickName + ": " + p.getMsg());
						server.sendMsg(p); break; // 메시지
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
			p2.setMsg(nickName + "님 퇴장");
		} catch (Exception e) {
			// TODO: handle exception
		}
	} // run 끝
	
	public String nickName() {
		return nickName;
	}
}
