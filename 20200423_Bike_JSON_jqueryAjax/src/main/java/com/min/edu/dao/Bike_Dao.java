package com.min.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.board.util.SqlDaoSupport;
import com.min.edu.dto.BikeDto;

public class Bike_Dao {

	private Logger log = Logger.getLogger(this.getClass());
	private SqlSessionFactory factory = SqlDaoSupport.getFactory();
	private final String NS = "sqls.bike";
	
	
	//입력 bike.xml 기본 insert

		public int insert(List<BikeDto> lists) {
		      log.info("insert 실행");
		      int cnt=0;
		      SqlSession session  = factory.openSession(false); // autoCommit중지
		      try {
		         for(BikeDto dto : lists) {
		            cnt +=session.delete(NS+"insert",dto);
		         }
		         session.commit();
		      } catch (Exception e) {
		         //강제적으로 Rollback 처리 하기 위함.
		         session.rollback();
		         e.printStackTrace();
		      }
//		      finally {
//		         factory.openSession(true);
//		      }
		      return cnt;
		   }
	
	
	
	//삭제
	public int delete() {
		log.info("delete 실행");
		int cnt =0;
		SqlSession session = 
				factory.openSession(true); //Auto -Commit을 실행하겠다.
		session.delete(NS+"delete");
		session.close();
		
		return cnt;
	}
}
