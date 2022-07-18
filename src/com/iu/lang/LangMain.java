package com.iu.lang;

import java.util.*;

public class LangMain {

	public static void main(String[] args) {
	 Object obj = new Object();
	String str = obj.toString();
	Member member = new Member();
	System.out.println(str);
	str = member.toString();
	System.out.println(str);
	MemberClient mc = new MemberClient();
	Car car = new Car();
	Car car2 = new Car();
	obj = member;
	
	boolean check = car.equals(car2);
	System.out.println(car);
	System.out.println(car.toString());
	System.out.println(check);
	
	String name = "iu";
	System.out.println(name);
	//원래는 참조변수를 출력하면 주소가 나와야 하지만 값이 나왔다.
	//toString 메서드를 오버라이딩 한 것.
	
	}

}
