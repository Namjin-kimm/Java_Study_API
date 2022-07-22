package com.iu.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public void t1() {
		Random random = new Random();
		
		String str = null;
		if(random.nextInt(10)%2 == 0) {
			str = "10";
		}
		
		int num = Integer.parseInt(str);
//		try {
//			num = num/0;
//			System.out.println(num);
//		}catch(ArithmeticException e) {
//		
//		}
//		num = num/random.nextInt(2);
//		System.out.println(num);
//		System.out.println(str.toString());
		//예외가 발생하면 JVM이 new NullPointerException(); 라는 객체를 만든다
		
//		System.out.println("t1 메서드 종료");
	}
	
	public void t2() {
		String [] str = {"10", "five", "3.14"};
		Scanner sc = new Scanner(System.in);
		
		for(String s : str) {
			try {
				
				System.out.println("숫자를 입력하세요");
				int n = sc.nextInt();
				
			int num = Integer.parseInt(s);
			num = n/num;
			System.out.println(num);
			}catch(NumberFormatException e) {
				//예외처리
				System.out.println("예외 처리");
			}catch(ArithmeticException e) {
				System.out.println("수학 오류 해결");
			}catch(Exception e) {
				e.printStackTrace();
			}catch(Throwable e) {
				
			}
		}
	}
	
	public void t3() throws Exception{
		String str = null;
		System.out.println(str.toString());
	}
	
	public void t4() throws MyException //Exception도 가능 
	{
		//유치원생 프로그램
		//0-99
		int num = 48;
		int num2 = 82;
		int num3 = num + num2;
		int num4 = num - num2;
		
		if(num3 > 99) {
			throw new MyException();
			//throw new Exception("????");
			
		}
		
		if(num4 < 0) {
			throw new MyException("그런 숫자 몰라요");
		
		}
	}
}
