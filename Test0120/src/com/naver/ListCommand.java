package com.naver;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListCommand implements Command {

	@Override
	public CommandAction excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. client 보내준 데이터 획득/가공
		//2. DAO 객체 및 해당 메서드 호출
	   MemberDAO dao = new MemberDAO();
	   List<MemberDTO> list = dao.list();
		//3. 바인딩
	   request.setAttribute("list", list);
		//4. 포워딩
		return new CommandAction(false, "list.jsp");
		//request.getRequestDispatcher("list.jsp").forward(request, response);
	}

}
