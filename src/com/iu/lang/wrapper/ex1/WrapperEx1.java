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
//		System.out.println("주민등록번호를 \"-\"를 포함하여 입력해주세요");
//		String num = sc.next();
		String num = "940327-101011";
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
		
		int result = 0;
		String age = nums[0].substring(0, 2);
		if(a == '1' || a == '2') {
			age = "19" + age;
			result = 2022 - Integer.parseInt(age);
		}else {
			age = "20" + age;
			result = 2022 - Integer.parseInt(age);
		}
		System.out.println(result + "살 입니다");
		
		int month = Integer.parseInt(nums[0].substring(2,4));
		System.out.println(month);
		if(month >= 3 || month <= 5) {
			System.out.println("봄");
		}else if(month >= 6 || month <=8) {
			System.out.println("여름");
		}else if(month >=9 || month <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
		
		
		
		
	}
	

}
