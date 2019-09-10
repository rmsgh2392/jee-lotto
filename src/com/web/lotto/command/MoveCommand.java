package com.web.lotto.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(domain);
		setAction((request.getParameter("action")==null) 
				? "move" : request.getParameter("action"));
	
	}
	
		
		
}
		
		


