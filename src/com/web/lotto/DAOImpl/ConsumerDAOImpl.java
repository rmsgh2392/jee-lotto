package com.web.lotto.DAOImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.web.lotto.DAO.ConsumerDAO;
import com.web.lotto.domain.ConsumerBean;

public class ConsumerDAOImpl implements ConsumerDAO{
	public static final String FILE_PATH =String.format
			("C:%sUsers%suser%seclipes-jee%sjee-lotto2%sWebContent%sresources%stxt%s"
																	,File.separator
																	,File.separator
																	,File.separator
																	,File.separator
																	,File.separator
																	,File.separator
																	,File.separator
																	,File.separator);
	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(FILE_PATH+"Consumers.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s,%s",param.getCid(),param.getPw()));
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	}


