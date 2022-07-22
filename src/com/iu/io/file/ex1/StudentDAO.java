package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	//DAO : Data Access Object
	//DTO : Data Transfer Object
	//file data에 접근
	
	//2. setlist
	//public int setList(ArrayList<StudentDTO> ar) {
		//예외처리는 내부에서 처리
		//List로 받은 데이터들을 StudentData에다가 작성
		//기존의 내용은 삭제
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생했을 경우
	//}
	
	//1. getList
	// StudentData 파일의 내용을 읽어서 작업
	
	public ArrayList<StudentDTO> getList() throws Exception{
		File file = new File("/Users/namjinkim/Documents/Study","StudentData.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		boolean check = true;
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		while(check) {
			String student = br.readLine();
			if(student == null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(student, ",");
//			while(st.hasMoreTokens()) {
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(String.valueOf(st.nextToken().trim()));
				studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
				ar.add(studentDTO);
//			}
		}
		br.close();
		return ar;
	}

}
