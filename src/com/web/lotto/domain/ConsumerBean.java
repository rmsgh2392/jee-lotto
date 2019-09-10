package com.web.lotto.domain;

import java.io.Serializable;

import lombok.Data;
@Data
public class ConsumerBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String cid,pw,lottoseq,prizeMoney;
}
