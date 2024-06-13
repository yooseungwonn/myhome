package himedia.myhome.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public abstract class BaseServlet extends HttpServlet{
	protected String dbuser = null;
	protected String dbpass = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// 서블릿 초기화
		ServletContext context = getServletContext();
		dbuser = context.getInitParameter("dbuser");
		dbpass = context.getInitParameter("dbpass");
	}
	
	
}
