package server_getchar;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class GetChar_Server {
	ServerSocket ss = null;
	ArrayList<CopyClient> list = null;

	public GetChar_Server() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(8787);
			System.out.println("서버 시작콩 ~");

			exe();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void exe() {
		while (true) {
			try {
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				list.add(cc);

			} catch (Exception e) {
			}
		}
	}
	
	// DB 처리하는 동안 
	public void sendMsg(Protocol p) {
		try {
			for (CopyClient cc : list) {
				cc.out.writeObject(p);
				cc.out.flush();
			}
		} catch (Exception e) {
		}
	}

	public void removeClient(CopyClient cc) {
		list.remove(cc);
	}

	public static void main(String[] args) {
		new GetChar_Server();
	}
}
