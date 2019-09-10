package com.web.lotto.command;

import javax.servlet.http.HttpServletRequest;

import com.web.lotto.constants.Constant;

import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action,domain,page,view;
	@Override
	public void execute()  {
		setDomain();
		setPage();
		this.view = String.format(Constant.VIEW_PATH, domain,page);
		
	}
	public void setDomain() {
		String path = request.getServletPath();
		domain = path.replace(".do","");
		domain = domain.substring(1);
	}
	public void setPage() {
		page = request.getParameter("page");
	}

}
