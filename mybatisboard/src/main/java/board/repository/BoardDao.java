package board.repository;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.model.Board;

public class BoardDao {
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "config.xml";
			//System.out.println(resource + "11111111111111111111111");
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public Board selectBoard(int a){
		SqlSession sqlSession = this.getSqlSessionFactory().openSession();
		return sqlSession.selectOne("board.repository.BoardMapper.selectBoard", a);
		
		
		
	}
}
