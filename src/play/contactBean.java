package play;

import java.io.Serializable;

public class contactBean extends Bean implements Serializable {

	private static final long serialVersionUID = 1L;
String name=null;
String sex=null;
String tags=null;
int [] phnum = new int[50];
String [] email = new String[50];
String  date =null;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getTags() {
	return tags;
}
public void setTags(String tags) {
	this.tags = tags;
}
public int[] getPhnum() {
	return phnum;
}
public void setPhnum(int[] phnum) {
	this.phnum = phnum;
}
public String[] getEmail() {
	return email;
}
public void setEmail(String[] email) {
	this.email = email;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
	
}
