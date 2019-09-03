package com.web.lotto.domain;

import java.io.Serializable;

public class ConsumerBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String cid,pw,lottoseq,prizeMoney;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getLottoseq() {
		return lottoseq;
	}

	public void setLottoseq(String lottoseq) {
		this.lottoseq = lottoseq;
	}

	public String getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(String prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	@Override
	public String toString() {
		return "ConsumerBean cid=" + cid + ","
				+ " pw=" + pw + ", "
				+ "lottoseq=" + lottoseq + ", "
				+ "prizeMoney=" + prizeMoney+"";
				
	}
	
	
}
