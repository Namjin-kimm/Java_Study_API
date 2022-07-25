package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	
	public void send() throws Exception{
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		OutputStream os = null; //0,1
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Socket socket = null;
		socket = new Socket("192.168.7.40", 8282);
		
		while(check) {
		System.out.println("서버로 보낼 메세지 입력");
		String message = sc.next();
		if(message.toLowerCase().equals("q")) {
			check = !check;
			System.out.println("시스템을 종료합니다");
			break;
		}
		
		os = socket.getOutputStream(); //0,1
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		
		//전송
		bw.write(message + "\r\n");
		bw.flush();
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String message2 = br.readLine();
		if(message2.toLowerCase().equals("q")) {
			check = !check;
			System.out.println("시스템을 종료합니다");
			break;
		}
		System.out.println("Server : " + message2);
		}
		
		//자원 해제
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		socket.close();
	}

}
