package play;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControlServlet
 */
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Process(request,response);
	}

	@SuppressWarnings("null")
	protected void Process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//PrintWriter out = response.getWriter();
		String uri= request.getRequestURI();
	String result=null;
	String regresult=null;
	ModBean mb = new ModBean();
	if(uri.contains("/openRegisterView.do")){
		RequestDispatcher ro =request.getRequestDispatcher("register.jsp");
		ro.forward(request,response);
											}
	
	else if(uri.contains("/openLoginView.do")){
		RequestDispatcher rl = request.getRequestDispatcher("login.jsp");
		rl.forward(request, response);
											}
	
	else  if(uri.contains("/login.do")){
		System.out.println("logging-in");
		LogBean ob= (LogBean)request.getAttribute("LB");
		
	 result = mb.inputVal(ob);
	 System.out.println("controlServlet"+result);
	if (result.equals(Constants.SUCCESS)){
		HttpSession s = request.getSession(true);
		s.setAttribute("userId", ob.getEmail());
		RequestDispatcher rb = request.getRequestDispatcher("menu.jsp");
		rb.forward(request,response);
										}
		else 
										{
			
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		request.setAttribute("error", result);
		rd.forward(request,response);
			
										       }	
											  }
		
	else if(uri.contains("/register.do")){
		
			System.out.println("signing-in");
	RegBean ab = (RegBean)request.getAttribute("RB");
	regresult=mb.register(ab);
	
	if(regresult.equals(Constants.SUCCESS)){
		RequestDispatcher sb = request.getRequestDispatcher("success.jsp");
			sb.forward(request, response);
			
											}
	
	else 									{
		System.out.println(regresult);
		RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
		request.setAttribute("error", regresult);
		rd.forward(request, response);
		
											}}
	else if(uri.contains("/openAddContactView.do")){
		RequestDispatcher rd = request.getRequestDispatcher("addContact.jsp");
		rd.forward(request,response);
		
		
													}
    
	else if(uri.contains("/openListContactView.do")){
		RequestDispatcher rd = request.getRequestDispatcher("listContact.jsp");
			rd.forward(request,response);	
		
		
													}
	
	else if(uri.contains("/openSearchView.do"))		{
		RequestDispatcher rc = request.getRequestDispatcher("search.jsp");
		System.out.println("inside searchview.do");
		rc.forward(request,response);	
		
													}
		
	else if(uri.contains("/openEditContact.do"))	{
		RequestDispatcher rd = request.getRequestDispatcher("editContact.jsp");
		rd.forward(request,response);	
													}
    
	
	else if (uri.contains("/openEditAccView.do"))		{
	HttpSession s = request.getSession(false);
	if(s==null)
	{	
	request.setAttribute("errorMsg","Your session has timed-out, Try again"+"<br/>");	
		RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");	
	rd.forward(request,response);
	}
	else
	{	
	String email = (String) s.getAttribute("userId");
	RegBean ub = mb.getDetails(email);
	System.out.println(ub.getUname()+" "+ub.getEmail()+" "+ub.getPassword()+" "+ub.getRpassword());
	request.setAttribute("userDetails", ub);
RequestDispatcher rd = request.getRequestDispatcher("/editAcc.jsp");
	rd.forward(request,response);
	}
	}
    else if(uri.contains("/editAcc.do"))				{
		
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request,response);
	
														}
	else if(uri.contains("/addContact.do")){
		
	RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
	rd.forward(request,response);
		
											}
    
	
	else if(uri.contains("/search.do")){
		
		RequestDispatcher rd = request.getRequestDispatcher("searchResults.jsp");
		rd.forward(request,response);
	
										}
	
	else if(uri.contains("/listContact.do")){
		
		RequestDispatcher rd = request.getRequestDispatcher("listResults.jsp");
		rd.forward(request,response);
											}
	
	else if(uri.contains("/editContact.do")){
		
		RequestDispatcher rd = request.getRequestDispatcher("listEditContact.jsp");
		rd.forward(request,response);
											}
	
	else if(uri.contains("/updateContact.do")){
	
	
			RequestDispatcher rd = request.getRequestDispatcher("listEditContact.jsp");
		rd.forward(request, response);
		
											  }
	else if(uri.contains("/logout.do"))		{
		
		HttpSession s= request.getSession(false);
		if(s==null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");	
		request.setAttribute("lout", "you have not logged in!!");	
		rd.forward(request,response);
		//response.sendRedirect("login.jsp");
		
		//rd.forward(request, response);
		}
		else 
			
		{
			s.removeAttribute("userId");
			s.invalidate();
			response.sendRedirect("homePage.jsp");
		}
		
		//RequestDispatcher rl = request.getRequestDispatcher("success.jsp");
			//rl.forward(request,response);								
											}	
    }
	}
	
	

