package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로 부터 파일명을 입력 받음, abcdfdfdfdfdfdfdf.txt   abcd.jpg
		//파일이 이미지파일인지 아닌지 구별
		//확장자 jpg, png, gif, jpeg
		System.out.println("파일명을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
		int a = file.lastIndexOf('.');
		String name = file.substring(a+1);
//		if(name.equals("jpg") || name.equals("png") || name.equals("gif") || 
//				name.equals("jpeg")){
//			System.out.println("이미지 파일입니다");
//			}else {
//				System.out.println("이미지 파일이 아닙니다");
//			}
		String [] files = {"jpg", "png", "gif", "jpeg"};
		String result = "이미지 파일이 아닙니다";
		for(int i = 0; i< files.length; i++) {
			if(name.equals(files[i])) {
				result = "이미지 파일입니다";
				break;
			}
		}
		System.out.println(result);
		
	}
	
	public void studyIndexofEx1() {
		String names = "iu,suji,choa,hani";
		String str = new String();
		//1.names에는 몇개의 쉼표가 있는가??
		//2.총 몇명입니까?
		boolean check = true;
		int a = -1;
		int i = 0;
		while(check) {
				a = names.indexOf(',',a+1);
				System.out.println(a);
				
			if(a != -1) {
				i++;
			}else {
				check = !check;
			}
		}
		int count = i + 1;
		System.out.println(count);
		
		str = "Google에 입사지원 동기는....Google에 입사하면 노예가....";
		
		str= str.replace("Google", "Samsung");
		System.out.println(str);
		
	}
	
	public void StudySubString() {
		//하나의 문자열을 분리하는 작업(parsing)
		String member = "iu/1234";
		String pw = member.substring(3);
		String id = member.substring(0, 2);
		System.out.println(pw);
		System.out.println(id);
	}
	
	
//	public void StudyIndexOf() {
//		String str = "Hello Java";
//		int a = str.indexOf("ll");
//		System.out.println(a);
//	}
	

}
