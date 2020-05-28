package com.min.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.min.board.util.SqlDaoSupport;

public class BoardTestMain {

	public static void main(String[] args) {

		SqlSessionFactory factory = SqlDaoSupport.getFactory();
		factory.openSession();
}
}











