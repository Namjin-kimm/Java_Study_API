package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//juminCheck
	//주민번호 입력 받음
	//	9	7	1	1	2	4	-	1	2	3	4	5	6	7(체크용번호)
	//*	2	3	4	5	6	7		8	9	2	3	4	5	
	//+	18 21	4	5	12	28		8	18	27	12	20	30
	//	총합 : 182
	
	//	총합을 11로 나누어서 나머지를 구함
	//182 / 11 -- 몫 16 나머지 6
	//나머지를 11에서 뺀 결과 체크용 번호와 같은지 비교
	// 11 - 6 = 5
	
	//만약에 위의 연산결과가 두자리라면
	//연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
	public void juminCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 \"-\"를 포함하여 입력해주세요");
		String jumin = sc.next();
		//String jumin = "971124-1234567";
		int sum = 0;
		int j = 2;
		for(int i = 0; i < jumin.length() - 1; i++) {
			if(i == 6) {
				continue;
			}
			int count = Integer.parseInt(String.valueOf(jumin.charAt(i)));
			count *= j;
			sum += count;
			j++;
			if(j > 9) {
				j = 2;
			}
		}
		
		int c = 11 - sum%11;
		System.out.println(c);
		
		if(c > 9 && c < 100) {
			c = c%10;
		}
		if(c == Integer.parseInt(String.valueOf(jumin.charAt(13)))) {
			System.out.println("합법 주민입니다");
		}else {
			System.out.println("합법 주민이 아닙니다");
		}
		
	}
	
}
