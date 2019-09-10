package com.web.lotto.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.lotto.constants.Constant;
import com.web.lotto.domain.ConsumerBean;
import com.web.lotto.domain.LottoBean;
import com.web.lotto.serviceImpl.ConsumerServiceImpl;
import com.web.lotto.services.ConsumerService;


@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		switch (request.getParameter("action")) {
		case "move":
		
			break;
		case "join":
			String cid = request.getParameter("cid");
			String pw = request.getParameter("pw");
			ConsumerBean param = new ConsumerBean();
			param.setCid(cid);
			param.setPw(pw);
			param.toString();
		
			break;
			
		case "login":
		
			String money = request.getParameter("money");
			LottoBean lotto = new LottoBean();
			lotto.toString();
			break;
		
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
