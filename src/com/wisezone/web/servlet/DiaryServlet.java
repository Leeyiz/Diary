package com.wisezone.web.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wisezone.biz.DiaryBiz;
import com.wisezone.biz.impl.DiaryBizImpl;
import com.wisezone.entity.Diary;

public class DiaryServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DiaryBiz biz = new DiaryBizImpl();

	public String index(HttpServletRequest request, HttpServletResponse response){
		List<Diary> list = biz.queryAll();//查询所有日志信息
		request.setAttribute("list", list);
		return "index.jsp";
	}
	
	public String add(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String diary_title = request.getParameter("diary_title");
		String diary_content = request.getParameter("diary_content");
		int diary_type = Integer.valueOf(request.getParameter("diary_type"));
		Date diary_date = new Date(); //默认当前时间
		
		Diary diary = new Diary(0, diary_title, diary_content, diary_date, diary_type);
		
		int result = biz.add(diary);
		
		String msg = result > 0 ? "添加成功":"添加失败";
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("<script>");
		response.getWriter().print("alert('"+msg+"');");
		response.getWriter().print("window.location.href='http://localhost:8080/Diary'");/*通过浏览器，定位到首页*/
		response.getWriter().print("</script>");
		
		response.getWriter().flush();
		response.getWriter().close();
		
		return null;
		
	}
}
