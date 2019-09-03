package com.web.lotto.DAOImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.web.lotto.DAO.LottoDAO;
import com.web.lotto.domain.ConsumerBean;
import com.web.lotto.domain.LottoBean;

public class LottoDAOImpl implements LottoDAO{
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
	public void insertLotto(LottoBean param) {
			try {
				File file = new File(FILE_PATH+"lotto2.txt");
				@SuppressWarnings("resource")
				BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
				System.out.println(param.getLottoseq()+"/"+param.getLotteryNum());
				writer.write(String.format("%s%s",param.getLottoseq(),param.getLotteryNum()));
				writer.newLine();
				writer.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}


