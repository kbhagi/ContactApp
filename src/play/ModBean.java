package play;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModBean {
 	 
 public String inputVal(LogBean lb) {
	String logresult=null;
	 logresult=lb.inputVal();
	 System.out.println("inside ModBean inputVal(LogBean lb)");
	 if(logresult.equals(Constants.SUCCESS))
	 {
Connection con = null;PreparedStatement ps_sel=null;ResultSet rs = null;

		try
		{
			con = JDBCHelper.getConnection();
			if(con==null)
			return "Cannot connect to db. Please contact Admin!";
			else
			{
			con.setAutoCommit(false);
			ps_sel = con.prepareStatement("select * from register where email = ? and password = ?");
			ps_sel.setString(1,lb.getEmail());
			ps_sel.setString(2,lb.getPassword());
			ps_sel.execute();
			
			rs = ps_sel.getResultSet();
		if(rs.next())
		{
			
		return Constants.SUCCESS;	
			
		}
		else
		{
		return "Your email/pass is wrong.Try again once more";
		
		}		
			}
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return "Oops something bad happened"+e.getMessage();
		}
		 finally
		 {
			 JDBCHelper.close(rs);
			 JDBCHelper.close(ps_sel);
			 JDBCHelper.close(con);
		 }
	 } 
	 else
	
	  return logresult;
	 
	 }
 	/*	public  String inputVal(LogBean lb)
	{
		result=lb.inputVal();
		return result;
	}	*/
	public String register(RegBean rb)
	{
		String regresult=null;
		regresult=rb.inputVal();

		if(regresult.equals(Constants.SUCCESS))
		{
			
			Connection con = null; PreparedStatement ps_sel=null;PreparedStatement ps_ins = null;String sql;ResultSet rs =null;
							
		try
			{
			con=JDBCHelper.getConnection();
			
			if(con==null)
			{
				Throwable e = null;
				return "Oops connection cannot be established to db" +e.getMessage();
			}
			else
			{
				con.setAutoCommit(false);
			ps_sel=con.prepareStatement("select * from register where email=?");
			ps_sel.setString(1,rb.getEmail());
			ps_sel.execute();
			rs=ps_sel.getResultSet();
			if(rs.next())
			{
				
			return "You have a duplicate email-id";
			
			}
			else 
			{
			
				ps_ins =con.prepareStatement("insert into register(uname,email,password) values(?,?,?)");
				ps_ins.setString(1, rb.getUname());
				ps_ins.setString(2, rb.getEmail());
				ps_ins.setString(3, rb.getPassword());
				ps_ins.execute();
				
				con.commit();
				}	
			}
			}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		finally
		{
			JDBCHelper.close(rs);
			JDBCHelper.close(ps_ins);
			JDBCHelper.close(ps_sel);
			JDBCHelper.close(con);
		
		}
		return Constants.SUCCESS;
		}
		else
		return regresult;
		}
	
	
	public RegBean getDetails(String email) {
		Connection con = null;
		PreparedStatement ps_sel=null;
		ResultSet rs=null;
		RegBean rb=null;
    try 
    {
    	con=JDBCHelper.getConnection();
    	if(con==null)
    	{
    		
    		throw new RuntimeException("Connection not established, Contact Admin !!");
    	}
    	else
    	{
    		ps_sel=con.prepareStatement("select uname, email, password from register where email=?");
    		ps_sel.setString(1,email);
    		ps_sel.execute();
    		rs = ps_sel.getResultSet();
    		while(rs.next())
    		{
    			rb = new RegBean();
    			rb.setUname(rs.getString("uname"));
    			rb.setPassword(rs.getString("password"));
    			rb.setEmail(rs.getString("email"));
    		
    		}
    		return rb;
    	
    }
    }
    catch (SQLException e)
    {
    	e.printStackTrace();
    	throw new RuntimeException(e);
    	
    }
    finally
    {
    	JDBCHelper.close(rs);
    	JDBCHelper.close(ps_sel);
    	JDBCHelper.close(con);
    }
	}

	}
