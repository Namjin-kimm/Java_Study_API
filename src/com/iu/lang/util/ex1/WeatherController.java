package com.iu.lang.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	private Scanner sc;
	private WeatherService ws;
	private WeatherView wv;
	//WeatherController
		//start 메서드
		//1. 날씨 정보 초기화 - init메서드 호출
		//2. 전국날씨출력
		//3. 지역날씨검색 - find?
		//4. 지역정보추가
		//5. 지역정보삭제
		//6. 종		료
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		this.ws = new WeatherService();
		this.wv = new WeatherView();
		String ms = null;
		
//		CityDTO dto = new CityDTO();
		boolean check = true;
		
		while(check) {
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 전국 날씨 출력");
			System.out.println("3. 지역 날씨 검색");
			System.out.println("4. 지역 정보 추가");
			System.out.println("5. 지역 정보 삭제");
			System.out.println("6. 종	료");
			System.out.println("메뉴를 선택하세요");
		//wv.view(ms);
			this.sc = new Scanner(System.in);
		int num = this.sc.nextInt();
			
		if(num == 1) {
			ws.init(ar);
		}else if(num == 2) {
			wv.view(ar);
		}else if(num == 3) {
			CityDTO dto = ws.find(ar);
			wv.view(dto);
		}else if(num == 4) {
			ws.add(ar);
		}else if(num == 5) {
			ws.remove(ar);
		}else {
			System.out.println("종료합니다");
			check = !check;
		}
		
		}
	}

}
