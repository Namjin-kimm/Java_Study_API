package com.iu.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		String str1 = "max";
		String str2 = "age";
		
		//str1 = str1 + str2;
		//불필요한 객체 생성
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		//불필요한 객체 생성하지 않음
		
		String result = sb.toString();
		
		System.out.println(sb);
		System.out.println(result);

	}

}
