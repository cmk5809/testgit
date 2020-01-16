package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertUICommand implements Command {

	@Override
	public CommandAction excute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//request.getRequestDispatcher("insert.jsp").forward(request, response); 둘다 가능 but 도착하는 페이지가 다름
		//response.sendRedirect("insert.jsp");
		
		return new CommandAction(true, "insert.jsp");

	}

}
