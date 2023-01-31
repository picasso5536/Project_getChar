package Sell_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * DAO(Data Access Object) : 데이터베이스의 data에 접근하기 위한 객체
 * 							비즈니스로직을 분리하기 위해 사용
 * DB에 접속해서 각종 SQL을 처리하는 클래스
 */
public class DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	ArrayList<VO> list = null;
	
	/*
	 * 싱글턴 패턴 : 소프트웨어 디자인 패턴에서 사용하는 패턴중 하나 생성자가 여러차례 호출되더라도 실제 생성되는 객체는 하나이고, 최소 생성
	 * 이후에는 호출된 생성자는 최소 생성자가 생성한 객체를 리턴함 가장 대표적인 것이 Spring이 기본적으로 싱글턴 패턴을 사용
	 */
	private static DAO dao = new DAO();

	public static DAO getInstance() {
		return dao;
	}

	// DB 접속 메서드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.0.23:1521:xe";
			String user = "c##picasso5536";
			String password = "h3z9bNkvn0c";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	// 전체보기 메서드
	public ArrayList<VO> getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customer order by custid";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();

			while (rs.next()) {
				VO vo = new VO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString(4));
				list.add(vo);
			}
			return list;
			
		} catch (SQLException e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return null;
	}

	// 특정 레코드 보기 메서드
	public VO getSelectOne(int c_id) {
		try {
			conn = getConnection();
			String sql = "select * from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c_id);
			rs = pstmt.executeQuery();
			VO vo = new VO();
			while (rs.next()) {
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString(4));
			}
			return vo;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return null;
	}

	// insert 메서드
	public int getInsert(int custid, String name, String address, String phone) {
		try {
			conn = getConnection();
			String sql = "insert into customer(custid, name, address, phone) values(?, ?, ?, ?)";
			System.out.println("번호\t이름\t주소\t전화번호\t");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			result = pstmt.executeUpdate();
			return result;

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return 0;
	}

	// delete 메서드
	public int getDelete(int c_id) {
		try {
			conn = getConnection();
			String sql = "delete from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c_id);
			result = pstmt.executeUpdate();

			return result;

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return 0;
	}

	// update 메서드
	public int getUpdate(int custid, String name, String address, String phone) {
		try {
			conn = getConnection();
			String sql = "update customer set name = ?, address = ?, phone = ? where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			
			result = pstmt.executeUpdate();
			
			return result;
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return 0;
	}
	
	// custid 중복 체크
	public boolean idChk(int custid) {
		boolean idchk = false;
		try {
			conn = getConnection();
			String sql = "select custid from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery();
			int cnt =0;
			if(rs.next()) cnt++;
			
			if(cnt != 0) {
				idchk = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return idchk; 
	}
}
