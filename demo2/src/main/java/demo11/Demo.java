package demo11;

import java.io.PrintWriter;

import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Demo extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) 
	{
		try {
		String name= req.getParameter("txt1");
		String age= req.getParameter("text2");
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		out.println(name);
		out.println(age);
		}
		catch(Exception e)
		{e.getStackTrace();}
	}

}
