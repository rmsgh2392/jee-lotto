package com.web.lotto.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.lotto.domain.LottoBean;
import com.web.lotto.serviceImpl.LottoServiceImpl;
import com.web.lotto.services.LottoService;


@WebServlet("/lotto.do")
public class LottoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LottoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("테스트 성공");
		LottoService service = new LottoServiceImpl();
		String money = request.getParameter("money");
		System.out.println("넘어온 돈:" + money);
		LottoBean param = new LottoBean();
		service.createLotto(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
