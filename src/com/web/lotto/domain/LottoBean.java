package com.web.lotto.domain;

import java.io.Serializable;

import lombok.Data;
@Data
public class LottoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String lottoseq, lottoballnum, lotteryNum;
}
