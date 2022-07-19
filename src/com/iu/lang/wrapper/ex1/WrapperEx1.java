package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	//ex1
	//주민번호를 입력 : 6-7 : 971224-1234567
	//1. 남자 여자 판단
	//2. 현재 나이 출력
	// 3-5 월 : 봄
	// 6-8 월 :여름
	// 9-11 월: 가을
	// 12-2 월: 겨울
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 \"-\"를 포함하여 입력해주세요");
		String num = sc.next();
		String [] nums = num.split("-");
//		for(String names: nums) {
//			System.out.println(names);
//		}
		char a = nums[1].charAt(0);
//		System.out.println(a);
		if(a == '1' || a == '3') {
			System.out.println("남자입니다");
		}else {
			System.out.println("여자입니다");
		}
		
		
	}
	

}
