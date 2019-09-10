package com.web.lotto.command;

import javax.servlet.http.HttpServletRequest;

public class Receiver {
	
	public static Command cmd = new Command();//클래스 변수 cmd
	public static void init(HttpServletRequest request) {//클래스 메서드 (파라미터엔 리퀘스트 객체 )
		try {
			cmd = new MoveCommand(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
