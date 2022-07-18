package com.iu.lang.string;

public class StringStudy2 {
	
	public void studyIndexofEx1() {
		String names = "iu,suji,choa,hani";
		//1.names에는 몇개의 쉼표가 있는가??
		//2.총 몇명입니까?
		boolean check = true;
		int a = -1;
		int i = 0;
		while(check) {
				a = names.indexOf(',',a+1);
				System.out.println(a);
				
			if(a != -1) {
				i++;
			}else {
				check = !check;
			}
		}
		int count = i + 1;
		System.out.println(count);
		
	}
	
	
//	public void StudyIndexOf() {
//		String str = "Hello Java";
//		int a = str.indexOf("ll");
//		System.out.println(a);
//	}
	

}
