package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	//getfood
	//서버 접속 후
	//1. 점심메뉴
	//2. 저녁메뉴
	//3. 종료
	// 번호를 입력받아서 server로 전송
	// 받아서 출력System.out.println("Server 접속 완료");
	public void getFood() throws Exception{
		
		OutputStream os = null; //0,1
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Socket socket = null;
		
		Scanner sc = new Scanner(System.in);
		socket = new Socket("192.168.7.40", 8282);
		boolean check = true;
		System.out.println("Server 접속 완료");
		
		while(check) {
		System.out.println("1. 점심 메뉴\t 2. 저녁 메뉴\t 3.종료");
		int num = sc.nextInt();
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		bw.write(num + "\r\n");
		bw.flush();
		
		if(num == 3) {
			break;
		}
		
		//-----------------------------------
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		String message = br.readLine();
		System.out.println(message);
		
		}
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
	
	}

}
