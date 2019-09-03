package com.web.lotto.services;

import com.web.lotto.domain.LottoBean;
import java.util.List;
import java.util.ArrayList;
public interface LottoService {
	public void createLotto(LottoBean param);
	public String createLottoseq();
	public int createBall();
	public String createLotteryNum();
	public boolean exist(int[]arr,int a);
	public int[] bubbleSort(int[]arr,boolean flg);
}
