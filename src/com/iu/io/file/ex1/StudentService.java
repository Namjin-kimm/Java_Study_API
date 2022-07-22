package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service{

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
		return 0;
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
