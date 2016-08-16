package struts03;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;
import vo.User;

public class Action3 extends ActionSupport {

	private User user; 
	
	
	public String execute(){
		UserDAO dao = new UserDAO(); 
		System.out.println(user+"액션유저");
 		dao.insertUser(user);                                                          
		
		return SUCCESS; 
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


}
