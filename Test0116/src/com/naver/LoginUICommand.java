package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUICommand implements Command {

	@Override
	public CommandAction excute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		return new CommandAction(false, "login.jsp");//false면 디스팩쳐로 true면 리다이렉트로간다
	}

}
