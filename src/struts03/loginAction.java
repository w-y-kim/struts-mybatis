package struts03;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {

	private String id;
	private String pw;
	private String name;
	private String msg;  
	
	private static final String my_id = "aaa";
	private static final String my_pw = "bbb";
	private static final String my_name = "ccc";
	
	public loginAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String execute(){
		if(id.equals(my_id) && pw.equals(my_pw)){
			name = my_name;
			msg = name+ "님 환영합니다."; 
		}else {
			msg ="아이디 또는 비밀번호가 틀렸습니다."; 
		}
		return SUCCESS;
		
	}
	
	public void validate(){
		if(id.equals("") || id.length() <3){
			addFieldError("id", "아이디를 입력해주세요");
		}
		if(pw.equals("") || pw.length() <3){
			addFieldError("pw", "패스워드를 입력해주세요");
		}
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
}
