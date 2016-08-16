package struts03;
import com.opensymphony.xwork2.Action;

public class Hello implements Action {
	
	private String message; 
	private String name2; 
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		message = "환영하오 " + name2 ; 
		return SUCCESS;
	}
	public String test() throws Exception{
		message = "test"; 
		return "success";
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name2;
	}

	public void setName(String name2) {
		this.name2 = name2;
	}
	
	
}
