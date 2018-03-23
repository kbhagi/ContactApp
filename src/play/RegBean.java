package play;

import java.io.Serializable;

public class RegBean  implements Serializable {
	
	private static final long serialVersionUID = 1L;
 String uname;
	 String email;
  String password;
  String rpassword;
 
 public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
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
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	
		public String inputVal(){
		String msg = null ;
		//System.out.println("inside inputVal() of RegBean{}"+uname+email+rpassword+password);
		StringBuilder sb = new StringBuilder();
	  if(uname==null||uname.trim().equals(""))
		  sb.append("Your name is empty ??,please enter your name"+"<br/>");
	  if( email==null||email.trim().equals(""))
		  sb.append("Your email is empty ??, please enter your email"+"<br/>");
	  if(password==null||password.trim().equals(""))
		  sb.append("your password is empty ??, please enter your password+"+"<br/>");
	  else 
		  if(!password.equals(rpassword))
		  {
		  //System.out.println(password+""+rpassword);
		  sb.append("password and rpassword should be same !!, please try again"+"<br/>");
		  }
	//else 
	//{   	
		msg = sb.toString(); 
	//}	
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


