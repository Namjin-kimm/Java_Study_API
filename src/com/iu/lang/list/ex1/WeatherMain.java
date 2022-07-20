package com.iu.lang.list.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherController wc = new WeatherController();
		wc.start();
		
		//1. 클래스의 역할과 메서드의 역할, 변수의 역할
		//WeatherMain		: 프로그램 실행, Test
		//WeatherService	: Data 가공
		//WeatherController	: 관리
		//WeatherView		: 출력 전용
		//CityDTO			: Data
		//각각의 기능들을 파악해야 한다

	}

}
