package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet3
 */
@WebServlet("*.do")
public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String what = request.getServletPath(); 실제로는 잘 사용안함
		
		String uri = request.getRequestURI();
		System.out.println(uri);
		String cPath = request.getContextPath();
		System.out.println(cPath);
		
		String what = uri.substring(cPath.length());
		
		command com = null;
		
		if (what.equalsIgnoreCase("/insert.do")) {
			com = new InsertCommand();
			//System.out.println("insert working");
		}else if (what.equalsIgnoreCase("/list.do")) {
			com = new SelectCommand();
			//System.out.println("select working");
		}else if (what.equalsIgnoreCase("/insertui.do")) {
			com = new InsertUICommand();
			//System.out.println("forword to insertui file");
		} //프론트 콘트롤러 mvc2모델에서 컨트롤 역할 마지막 if가 view역할 
		
		
		if (com != null) {
			com.execute(request, response);
		}
		
		//System.out.println(what);
		
		
		
		//System.out.println("ms3: 확장자형");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
