package chat_;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class Server {
	ServerSocket ss = null;
	ArrayList<CopyClient> list = null;
	
	public Server() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7007);
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
				// TODO: handle exception
			}
		}
	}
	
	public void sendMsg(Protocol p) {
		try {
			for (CopyClient cc : list) {
				cc.out.writeObject(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void removeClient(CopyClient cc) {
		list.remove(cc);
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
