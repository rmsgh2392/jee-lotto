package com.web.lotto.domain;

import java.io.Serializable;

public class LottoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String lottoseq, lottoballnum, lotteryNum;

	public String getLottoseq() {
		return lottoseq;
	}

	public void setLottoseq(String lottoseq) {
		this.lottoseq = lottoseq;
	}

	public String getLottoballnum() {
		return lottoballnum;
	}

	public void setLottoballnum(String lottoballnum) {
		this.lottoballnum = lottoballnum;
	}

	public String getLotteryNum() {
		return lotteryNum;
	}

	public void setLotteryNum(String lotteryNum) {
		this.lotteryNum = lotteryNum;
	}

	@Override
	public String toString() {
		return "LottoBean lottoseq=" + lottoseq + ""
				+ ", lottoballnum=" + lottoballnum + ""
				+ ", lotteryNum=" + lotteryNum+"";
				
	}
	
	
	
}
