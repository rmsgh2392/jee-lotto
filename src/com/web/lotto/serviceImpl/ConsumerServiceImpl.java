package com.web.lotto.serviceImpl;

import com.web.lotto.DAO.ConsumerDAO;
import com.web.lotto.DAOImpl.ConsumerDAOImpl;
import com.web.lotto.domain.ConsumerBean;
import com.web.lotto.services.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService{
	private	ConsumerDAO dao;
	
	public ConsumerServiceImpl() {
		dao = new ConsumerDAOImpl(); 
	}

	@Override
	public void registerConsumer(ConsumerBean param) {
		dao.insertConsumer(param);
	}

}
