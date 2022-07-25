package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		OutputStream os = null; //0,1
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Socket socket = null;
		ServerSocket serverSocket = null;
		while(check) {
		serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client의 접속을 기다립니다
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1 통신
		
		socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String message = br.readLine();
		if(message.toLowerCase().equals("q")) {
//			check = !check;
//			System.out.println("서버를 종료합니다");
			break;
		}else {
			System.out.println("Client : " + message);
		}
		
		System.out.println("Client로 보낼 메세지 입력");
		String message2 = sc.next();
		if(message2.toLowerCase().equals("q")) {
			check = !check;
			System.out.println("서버를 종료합니다");
			break;
		}
		
		os = socket.getOutputStream(); //0,1
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		//전송
		bw.write(message2 + "\r\n");
		bw.flush();
		}
		
		
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		serverSocket.close();
	}

}
