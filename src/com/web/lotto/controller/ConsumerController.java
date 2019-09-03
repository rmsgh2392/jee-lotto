package com.web.lotto.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.lotto.domain.ConsumerBean;
import com.web.lotto.serviceImpl.ConsumerServiceImpl;
import com.web.lotto.services.ConsumerService;


@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("맥락이 맞아서 들어옴");
		ConsumerService service = new ConsumerServiceImpl();
		String cid = request.getParameter("cid");
		String pw = request.getParameter("pw");
		ConsumerBean param= new ConsumerBean();
		param.setCid(cid);
		param.setPw(pw);
		service.registerConsumer(param);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
