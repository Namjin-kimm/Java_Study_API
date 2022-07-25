package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service{
	Scanner sc = new Scanner(System.in);

	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		//StudentDAO의 getList를 호출하고 총점과 평균을 각각
		//계산해서 대입하고 그 List를 리턴
		StudentDAO studentDAO = new StudentDAO();
		ArrayList<StudentDTO> ar = new ArrayList<>();
		ar = studentDAO.getList();
		for(int i = 0; i < ar.size(); i++) {
			ar.get(i).setTotal();
		}
		return ar;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		//StudentDAO의 setList를 호출하고
		//그 결과를 리턴
		StudentDAO studentDAO = new StudentDAO();
		return studentDAO.setList(ar);
		
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		System.out.println("검색할 학생의 번호를 입력하세요");
		int count = sc.nextInt();
		StudentDTO studentDTO = null;
		for(int i = 0; i < ar.size(); i++) {
			if(count == ar.get(i).getNum()) {
				studentDTO = ar.get(i);
			}
		}
		return studentDTO;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		System.out.println("삭제하려는 학생의 번호를 입력하세요");
		int count = sc.nextInt();
		int num = 0;
		for(int i = 0; i < ar.size(); i++) {
			if(count == ar.get(i).getNum()) {
				ar.remove(i);
				num = 1;
			}
		}
		return num;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("추가하려는 학생의 이름을 입력하세요");
		studentDTO.setName(sc.next());
		System.out.println("추가하려는 학생의 번호를 입력하세요");
		studentDTO.setNum(sc.nextInt());
		System.out.println("추가하려는 학생의 국어 점수를 입력하세요");
		studentDTO.setKor(sc.nextInt());
		System.out.println("추가하려는 학생의 영어 점수를 입력하세요");
		studentDTO.setEng(sc.nextInt());
		System.out.println("추가하려는 학생의 수학 점수를 입력하세요");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal();
		ar.add(studentDTO);
	}

}
