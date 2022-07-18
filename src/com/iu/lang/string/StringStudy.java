package com.iu.lang.string;

public class StringStudy {
	
	public void studyCharAt() {
		//문자열 = 문자배열
		char [] ch = {'H', 'e', 'l','l','o',' ','W','o','r','l','d'};
		String str = "Welcome to Hell";
		
		System.out.println(ch[0]);
		char c = str.charAt(0);
		System.out.println(c);
		
		c = str.charAt(0);
		System.out.println(c);
		
		System.out.println(str.length());
		
		System.out.println("================");
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
		
		
	}

}
