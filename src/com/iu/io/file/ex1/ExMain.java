package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentDAO studentDAO = new StudentDAO();
		try {
			ar = studentDAO.getList();
			for(int i = 0; i < ar.size(); i++) {
				System.out.println("이름 : " + ar.get(i).getName());
				System.out.println("번호 : " + ar.get(i).getNum());
				System.out.println("국어 : " + ar.get(i).getKor());
				System.out.println("영어 : " + ar.get(i).getEng());
				System.out.println("수학 : " +ar.get(i).getMath());
				System.out.println("총점 : " +ar.get(i).getTotal());
				System.out.println("평균 : " +ar.get(i).getAvg());
				System.out.println("============================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
