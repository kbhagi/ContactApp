package play;

import java.io.Serializable;




public class LogBean  implements Serializable{
 
	private static final long serialVersionUID = 1L;
private String email;
 private String password;
 
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 public String inputVal(){
	
	 String msg = null;
	System.out.println("inside LogBean {} inputVal() "+msg);
	System.out.println(email);
	System.out.println(password);
	System.out.println(email+""+password);
	StringBuilder sb = new StringBuilder();
	if(email==null||email.trim().equals("")){
		sb.append("Email should not be empty" + "<br/>");
											}
	   	if(password==null||password.trim().equals(""))
	{
		sb.append("pass should not be empty" + "<br/>");
	} 
		msg = sb.toString();
												  	
	if(msg.equals(""))
	{
		return Constants.SUCCESS;
		
	}
	else
	{
		
		return msg;
	
	}
}
	

}
