package com.iu.io.file.ex1;

import java.util.ArrayList;

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
		try {
			ar = ss.getList();
			sv.view(ar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
