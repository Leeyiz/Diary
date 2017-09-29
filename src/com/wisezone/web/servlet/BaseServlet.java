package com.wisezone.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getParameter("method");
		if (null == method) {
			method = "index";
		}
		
		Class<? extends BaseServlet> claz = this.getClass();
		
		try {
			Method m = claz.getMethod(method, HttpServletRequest.class,HttpServletResponse.class);
			String path = (String) m.invoke(this, request,response);
			if (null != path) {
				request.getRequestDispatcher(path).forward(request, response);
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

	public String index(HttpServletRequest request, HttpServletResponse response){
		return null;
	}
	
}
