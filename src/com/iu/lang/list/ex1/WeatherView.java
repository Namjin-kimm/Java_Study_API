package com.iu.lang.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	
//	WeatherView 
//		view 메서드
//		리스트를 받아서 모든 정보를 출력
//		또다른 view 메서드
//		City 하나를 받아서 모든 정보 출력
//		또다른 view
//		메세지 하나를 받아서 출력
	
	public void view(ArrayList<CityDTO> ar) {
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getGion());
			System.out.println(ar.get(i).getHum());
			System.out.println(ar.get(i).getStatus());
		}
	}
		
	public void view(CityDTO dto) {
		System.out.println(dto.getName());
		System.out.println(dto.getGion());
		System.out.println(dto.getHum());
		System.out.println(dto.getStatus());
		
	}
	
	public void view(String ms) {
		
		
		
	
//		System.out.println("1. 날씨 정보 초기화");
//		System.out.println("2. 전국 날씨 출력");
//		System.out.println("3. 지역 날씨 검색");
//		System.out.println("4. 지역 정보 추가");
//		System.out.println("5. 지역 정보 삭제");
//		System.out.println("6. 종	료");
//		System.out.println("메뉴를 선택하세요");
	}
		

}
