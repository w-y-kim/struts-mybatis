package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;
import struts03.User;

public class UserAction extends ActionSupport {
	UserDAO dao = new UserDAO(); 
	private User user; 
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String selectUser() throws Exception{
		
 		
 		String userId = "a"; //임의로 테스트
 		User user = dao.selectUser(userId); 
 		System.out.println(user);//null 혹은 User의 toString
		
		
		return SUCCESS;  
	}

	public String selectUserList() throws Exception{
		
		ArrayList<User> list = dao.selectUserList(); 
		System.out.println(list);
		
		return SUCCESS;
	}
		
	public String updateUser() throws Exception{
		
		User user = new User(); 
		user.setUserId("a");
		user.setUserPw("패스워드");
		user.setUserName("이름");
		
		boolean result = dao.updateUser(user); 
		System.out.println(result);
		return SUCCESS;
	}
}
