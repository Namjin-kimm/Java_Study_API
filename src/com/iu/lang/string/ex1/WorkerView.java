package com.iu.lang.string.ex1;

public class WorkerView {
	
//	view라는 메서드
//	WorkerDTO를 받아서 정보를 출력
	
	public void view(WorkerDTO [] workerDTOs) {
		for (WorkerDTO workerDTO: workerDTOs) {
			System.out.println("이름 : " + workerDTO.getName());
			System.out.println("부서 : " + workerDTO.getDepartment());
			System.out.println("직급 : " + workerDTO.getJob());
			System.out.println("전화번호 : " + workerDTO.getPhone());
		}
	}
	

}
