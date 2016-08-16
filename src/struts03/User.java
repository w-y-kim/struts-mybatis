package struts03;

public class User {
	private String userId;
	private String userPw;
	private String userName;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String id) {
		userId = id;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String pw) {
		userPw = pw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String name) {
		userName = name;
	}
	@Override
	public String toString() {
		return "User [UserId=" + userId + ", UserPw=" + userPw + ", UserName=" + userName + "]";
	}
	
	
}
