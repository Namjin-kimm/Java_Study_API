package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	//start 메서드
	//1. 학생 정보 출력 - 모든 학생정보 출력
	//2. 학생 정보 검색 - getStudent
	//3. 학생 정보 추가
	//4. 학생 정보 삭제
	//5. 백		업	- 현재 리스트의 백업 정보를 파일에 저장, setList
	//6. 종 		료
	
	public void start() {
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		ArrayList<StudentDTO> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		StudentDTO studentDTO = new StudentDTO();
		boolean check = true;
		
		while(check) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 학생 정보 출력");
			System.out.println("2. 학생 정보 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 백		업");
			System.out.println("6. 종		료");
			int num = sc.nextInt();
			
		if(num == 1) {
			try {
				ar = ss.getList();
				sv.view(ar);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}else if(num == 2) {
				try {
					studentDTO = ss.getStudent(ar);
					sv.view(studentDTO);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}else if(num == 3) {
				try {
					ss.setStudentAdd(ar);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}else if(num == 4) {
				try {
					int result = ss.setStudentDelete(ar);
					System.out.println(result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}else if(num == 5) {
				try {
					int result1 = ss.setList(ar);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}else {
			System.out.println("종료합니다");
			check = !check;
			break;
			}
		}
	
	}

}
