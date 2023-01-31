package server_getchar;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class DAO {
	// 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;

	// 싱글턴 패턴(동기화 처리) : 프로그램 종료시까지 한 번 만들어진 객체를 재사용하는 형식
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}

	// DB 처리하는 메서드들

	// customer 테이블의 전체 내용 보기
	// select, 결과는 여러개, 파라미터 없음
	public static List<CustomerVO> getList() {
		List<CustomerVO> list = null;
		// list = getSession().selectList("namespace.mapper의 id");
		list = getSession().selectList("customer.custList");
		return list;
	}

	public static CustomerVO getOne(String custid) {
		CustomerVO vo = null;
		vo = getSession().selectOne("customer.custOne", custid);
		return vo;

	}

	// 삽입, 삭제, 갱신은 반드시 commit을 해야함
	public static int getIns(CustomerVO vo) {
		int result = 0;
		if (!(vo.getCustid().isEmpty())) {
			result = getSession().insert("customer.custIns", vo);
			// commit 해야함
			ss.commit();
			return result;
		} else
			return 0;

	}

	public static int getDel(String custid) {
		int result = 0;
		if(custid != "") {
			result = getSession().delete("customer.custDel", custid);
			ss.commit();
			return result;			
		} else return result;
	}

	public static int getUpdate(CustomerVO vo) {
		int result = 0;
		result = getSession().update("customer.custUpdate", vo);
		ss.commit();
		return result;
	}

	public static int getIdChk(String custid) {
		int result = 0;
		result = getSession().selectOne("customer.idchk", custid);
		return result;
	}

}
