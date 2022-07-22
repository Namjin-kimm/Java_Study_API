package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//File	: 파일이나 폴더의 정보를 담는 클래스
		//		: 실제 파일이나 폴더가 없을 수도 있음
		File file = new File("/Users/Study/test.txt");
		//parent : 폴더, Child : 파일명 또는 최종 폴더명
		
		//1. 폴더명 경로가 있는 File 객체 이용
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		file = new File("/Users/namjinkim/Documents/Study/sub2");
		if(!file.exists()) {
			file.mkdir();
		}
		
		File file2 = new File("/Users/Study/sub2/t1");
		//file.mkdir(); 중간에 폴더가 없으면 생성 X
		file2.mkdirs();
		
		//file.delete();
		
		File file3 = new File("/Users/Study/sub");
		//file2.delete();
		file3.delete();
	}

}
