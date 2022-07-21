package com.iu.lang.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherController wc = new WeatherController();
		wc.start();
		
		ArrayList<String> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		//제네릭은 레퍼런스 타입만 허용되기 떄문에 정수만 담으려면 int가 아니라 Integer로 써야한다.
		
		ArrayList<ArrayList<String>> ars = new ArrayList<>();
		//이론적으로 가능하다. 하나의 어레이를 또 다른 어레이에 집어넣는 것.
		
		ArrayList<ArrayList<ArrayList<String>>> all = new ArrayList<>();
		//이것도 이론적으로 가능하다.
		
		
		
		//ar2 = ar1;
		//제네릭 타입이 다른 ArrayList들은 같지 않다.
		
		//1. 클래스의 역할과 메서드의 역할, 변수의 역할
		//WeatherMain		: 프로그램 실행, Test
		//WeatherService	: Data 가공
		//WeatherController	: 관리
		//WeatherView		: 출력 전용
		//CityDTO			: Data
		//각각의 기능들을 파악해야 한다

	}

}
