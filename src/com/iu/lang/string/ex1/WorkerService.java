package com.iu.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService {
	
	//private String info
	private StringBuffer sb;
	
//	public WorkerService() {
//		info = "iu-인사과-과장-0101111";
//		info = info + ", suji-IT-대리-0102222";
//		info = info + ", choa-영업-부장-0103333";
//		info = info + ", hani-마케팅-사원-0104444";
//	}
	
	public WorkerService() {
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
	}
	
	public WorkerDTO [] init() {
		//info 파싱해서 WorkerDTO에 대입하고 
		//WorkerDTO를 모은 배열을 리턴
//		String [] infos = this.info.split(", ");
//		for(int i = 0; i < infos.length; i++) {
//			infos[i].split("-");
//		}
		
//		String newInfo = this.sb.toString().replace(",","-");
		
//		String [] infos = newInfo.split("-");
		
//		WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];
//		
//		for(int i = 0; i < infos.length; i++) {
//			WorkerDTO workerDTO = new WorkerDTO();
//			workerDTOs[i/4]=workerDTO;
//			workerDTO.setName(infos[i].trim());			//4, 8
//			workerDTO.setDepartment(infos[++i].trim());	//5, 9
//			workerDTO.setJob(infos[++i].trim());			//6, 10
//			workerDTO.setPhone(infos[++i].trim());			//7, 11
//			}
		
		
		String info = sb.toString();
		String newInfo = info.replace(",", "-");
		
		StringTokenizer st = new StringTokenizer(newInfo, "-");
		WorkerDTO [] infos = new WorkerDTO[st.countTokens()/4];
		int i = 0;
		
		while(st.hasMoreTokens()) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTO.setName(st.nextToken());
			workerDTO.setDepartment(st.nextToken());
			workerDTO.setJob(st.nextToken());
			workerDTO.setPhone(st.nextToken());
			infos[i] = workerDTO;
			i++;
		}
		return infos;
		
		
//		return workerDTOs;
	}

}
