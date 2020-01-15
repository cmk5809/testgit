package com.naver;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectCommand implements command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//1. client가 보내준 데이터 획득 및 가공
		//select는 1번 필요없음
		//2. dao 객체 생성 및 해당 메서드 호출 및 데이터 획득
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.select();
		
		//3. 바인딩 작업 영역객체.SetAttribute();
		request.setAttribute("list", list);
		
		//4. 포워딩 작업: commandAction 객체 반환
		request.getRequestDispatcher("list.jsp").forward(request, response);

	}

}
