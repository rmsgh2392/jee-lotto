package com.web.lotto.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.web.lotto.DAO.LottoDAO;
import com.web.lotto.DAOImpl.LottoDAOImpl;
import com.web.lotto.domain.LottoBean;
import com.web.lotto.services.LottoService;

public class LottoServiceImpl implements LottoService{
	private LottoDAO dao;
	
	public LottoServiceImpl() {
		dao = new LottoDAOImpl(); 
	}		

	@Override
	public void createLotto(LottoBean param) {
		param.setLottoseq(createLottoseq());
		param.setLottoballnum(createBall()+"");
		param.setLotteryNum(createLotteryNum());
		dao.insertLotto(param);
		
	}

	@Override
	public String createLottoseq() {
		String seqNum = "No.";
		Random random = new Random();
		for(int i=0;i<4;i++) {
			if(i==3) {
				seqNum += random.nextInt(10)+"/";
			}else {
				seqNum += random.nextInt(10);
			}
		}
		System.out.println("일련번호"+seqNum);
		return seqNum;
	}

	@Override
	public int createBall() {
	return new Random().nextInt(45)+1;
	}

	@Override
	public String createLotteryNum() {
//		Random r = new Random();
//		String lotteryNum = "";
//		for(int i=0;i<6;i++) {
//			if(i!=5) {
//				lotteryNum += createBall()+",";
//			}else {
//				lotteryNum += createBall();
//			}
//		}
		String result = "";
//		String lotteryNum = "";
//		List<String> lottos = new ArrayList<>();
//		for(int i=0;i<6;i++) {
//			lotteryNum = createBall();
//			while(duplicaterprevention(lottos,lotteryNum)) {
//				lotteryNum = createBall();
//			}
//			lottos.add(lotteryNum);
//		}
//		for(String num : lottos) {
//			result += num+",";
//		}
		int[] arr = new int[6];
		for(int i=0;i<arr.length;i++) {
			int a = createBall();//1~45의 랜덤 숫자가 들어와서 a에 저장
			if(!exist(arr,a)) {//이미 exist메서드에서 arr과 a의 담긴 숫자를 비교함
				arr[i] = a;
			}else {
				i--;
			}
		}
		arr = bubbleSort(arr,true);
		for(int i=0;i<arr.length;i++) {
			result += arr[i] +",";
		}				
		return result;
	}

	@Override
	public boolean exist(int[] arr,int a) {
		boolean result = false;
		for(int i : arr) {
			if(a==i) {
				result = true;
			}
		}
		return 	result;
	}

	@Override
	public int[] bubbleSort(int[] arr,boolean flg) {
		int t = 0;
		for(int k=0;k<arr.length;k++) {
			for(int i=0;i<arr.length-1;i++) {
				if(flg) {
					if(arr[i]>arr[i+1]) {
						t = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = t;
					}
				}else {
					if(arr[i]<arr[i+1]) {
						t = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = t;
					}
				}
			}
		}
		return arr;
	}
}
