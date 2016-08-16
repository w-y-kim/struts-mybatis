package dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.User;


public class UserDAO {
	SqlSessionFactory sqlSessionFactory = MybatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;

	public void insertUser(User user) {
		try {
			sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("User.insertUser", user);
			System.out.println(user);
			// UserMapper.xml nameSpace의 이름. insertUser
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		System.out.println("DB 입력 :" + user);
	}

	public User selectUser(String userId) {
		User user = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			user = sqlSession.selectOne("User.selectUser", userId);
			// sqlSession.selectOne("User.selectUser"); 
			// UserMapper.xml에서 where절을 주지 않는 경우 파라미터 한개로 수행  
			
			// 결과가 한줄 혹은 여러줄 나옴 , 일단 하나받는 경우가 selectOne
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return user;
	}
	
	public ArrayList<User> selectUserList(){
		ArrayList<User> list = null;
		try{
		
		sqlSession = sqlSessionFactory.openSession();
//		list = (ArrayList<User>) sqlSession.selectList("User.selectUserList");//namespace user를 안줘도 고유한 값이라 실행은 됨
		list = (ArrayList) sqlSession.selectList("User.selectUserList");//namespace user를 안줘도 고유한 값이라 실행은 됨
		sqlSession.commit();
		}catch (Exception e){
			e.printStackTrace();
		} finally{
			if(sqlSession != null) sqlSession.close();
		}
		
		return list; 
	}

	public boolean updateUser(User user){
		boolean result = false; 
		try{
		sqlSession = sqlSessionFactory.openSession();
		int cnt = sqlSession.update("User.updateUser", user); 
		sqlSession.commit();
		if(cnt > 0) result = true; 
		
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			if(sqlSession != null) sqlSession.close();
		}
		return result; 
	}
	
	public HashMap selectUserHash(String userId) {
		HashMap userHash = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			userHash = sqlSession.selectOne("User.selectUserHash", userId);
			// sqlSession.selectOne("User.selectUser"); 
			// UserMapper.xml에서 where절을 주지 않는 경우 파라미터 한개로 수행  
			
			// 결과가 한줄 혹은 여러줄 나옴 , 일단 하나받는 경우가 selectOne
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return userHash;
	}
}
