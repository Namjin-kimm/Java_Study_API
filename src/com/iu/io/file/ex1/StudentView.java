package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
	
	//view 3개
	//1. String 출력
	//2. StudentDTO 출력
	//3. ArrayList<StudentDTO> 출력
	
	public void view(ArrayList<StudentDTO> ar) {
		for(int i = 0; i < ar.size(); i++) {
			System.out.println("이름 : " + ar.get(i).getName());
			System.out.println("번호 : " + ar.get(i).getNum());
			System.out.println("국어 : " + ar.get(i).getKor());
			System.out.println("영어 : " + ar.get(i).getEng());
			System.out.println("수학 : " + ar.get(i).getMath());
			System.out.println("총점 : " + ar.get(i).getTotal());
			System.out.println("평균 : " + ar.get(i).getAvg());
			System.out.println("============================");
		}	
		
	}
	public void view(StudentDTO studentDTO) {
		System.out.println("이름 : " + studentDTO.getName());
		System.out.println("번호 : " + studentDTO.getNum());
		System.out.println("국어 : " + studentDTO.getKor());
		System.out.println("영어 : " + studentDTO.getEng());
		System.out.println("수학 : " + studentDTO.getMath());
		System.out.println("총점 : " + studentDTO.getTotal());
		System.out.println("평균 : " + studentDTO.getAvg());
		
		
	}
	
	public void view(String message) {
		System.out.println(message);
	}
}
