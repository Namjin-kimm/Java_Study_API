package com.iu.lang.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul, 30.2, 70, 맑음,");
		sb.append("Daegu-38.9-90,흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
	}
	//init 메서드
	//sb에 있는 Data들을 파싱해서 CityDTO에 담아서 리턴
	
	public void init(ArrayList<CityDTO> ar) {
		String info = sb.toString();
		info = info.replace(",", "-");
		StringTokenizer st = new StringTokenizer(info, "-");
		while(st.hasMoreTokens()) {
			CityDTO cd = new CityDTO();
			cd.setName(st.nextToken().trim());
			cd.setGion(Double.parseDouble(st.nextToken().trim()));
			cd.setHum(Integer.parseInt(st.nextToken().trim()));
			cd.setStatus(st.nextToken().trim());
			ar.add(cd);
		}
	}
	
	//add 메서드
	//city정보를 입력받아서 추가
	
	public void add(ArrayList<CityDTO> ar) {
		CityDTO dto = new CityDTO();
		System.out.println("도시 이름을 입력하세요");
		dto.setName(sc.next());
		System.out.println("온도를 입력하세요");
		dto.setGion(sc.nextDouble());
		System.out.println("습도를 입력하세요");
		dto.setHum(sc.nextInt());
		System.out.println("상태를 입력하세요");
		dto.setStatus(sc.next());
		ar.add(dto);
		
	}
	
	//remove 메서드
	//도시명을 입력받아서 리스트에서 삭제
	
	public void remove(ArrayList<CityDTO> ar) {
		System.out.println("삭제하려는 도시명을 입력하세요");
		String name = sc.next().toUpperCase();
		String result = "일치하는 정보가 없습니다";
		for(int i = 0; i < ar.size(); i++) {
			if(name.equals(ar.get(i).getName().toUpperCase())) {
				ar.remove(i);
				result = "해당도시의 정보가 삭제되었습니다";
			}
		}
		
//		향상된 for문
//		for(CityDTO cityDTO: ar) {
//			if(name.equals(cityDTO.getName())) {
//				ar.remove(cityDTO);
//			}
//		}
			System.out.println(result);
	}
	
	//find 메서드
	//도시명을 입력받아서 리스트에서 검색
	
	public CityDTO find(ArrayList<CityDTO> ar) {
		System.out.println("찾으려는 도시명을 입력하세요");
		String name = sc.next().toLowerCase();
		CityDTO result = null;
		for(int i = 0; i < ar.size(); i++) {
			if(name.equals(ar.get(i).getName().toLowerCase())) {
				result = ar.get(i);
			}
		}
		return result;
	}
	//WeatherView 
	//view 메서드
	//리스트를 받아서 모든 정보를 출력
	//또다른 view 메서드
	//City 하나를 받아서 모든 정보 출력
	//또다른 view
	//메세지 하나를 받아서 출력
	
	//WeatherController
	//start 메서드
	//1. 날씨 정보 초기화 - init메서드 호출
	//2. 전국날씨출력
	//3. 지역날씨검색 - find?
	//4. 지역정보추가
	//5. 지역정보삭제
	//6. 종		료

}
