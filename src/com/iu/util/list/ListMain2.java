package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		//
		ListView listView = new ListView();
		ArrayList<String> ar = new ArrayList();
		ar.add("first");
//		ar.add(2); //int가 Integer로 Auto Boxing된다. 다형성 때문이다(모든 데이터 타입은 오브젝트 타입).
//		ar.add('c');//char 타입이 Character 타입으로 Auto Boxing 된다.
//		ar.add(2.123); //double 타입이 Double 타입으로 Auto Boxing 된다.
		ar.add(null); //null은 레퍼런스 타입의 상수값이다.
		
		//listView.view(ar);
		
		//get	-> 특정 index의 요소를 반환
		String n1 = ar.get(0);
		//나올때는 object 타입으로 나오기 때문에 강제형변환을 해줘야 한다.
//		int n = (Integer)ar.get(1);
//		//원래는 Integer가 들어가야 하는데 int로 해도 되는 이유는 Integer가 int로 Auto unboxing이 되기 때문
//		char ch = (Character)ar.get(2);
//		double d = (Double)ar.get(3);
		
		System.out.println(ar.get(0) instanceof String);
		//0	번쨰에서 꺼낸 값이 String 타입입니까? 라고 물어보는 것
		
		System.out.println(n1);
//		System.out.println(n);
//		System.out.println(ch);
//		System.out.println(d);
		
	}

}
