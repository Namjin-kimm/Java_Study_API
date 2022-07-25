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
		Socket socket = new Socket("192.168.7.40", 8282);
		System.out.println("Server 접속 완료");
		System.out.println("서버로 보낼 메세지 입력");
		
		
		String message = sc.next();
		
		OutputStream os = socket.getOutputStream(); //0,1
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		
		//전송
		bw.write(message + "\r\n");
		bw.flush();
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		String message2 = br.readLine();
		System.out.println("Server : " + message2);
		
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
