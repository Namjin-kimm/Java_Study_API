package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadTest1 tt1 = new ThreadTest1();
		ThreadTest2 tt2 = new ThreadTest2();
		Thread t = new Thread(tt2);
		//Thread를 상속받게 되면 개발자가 직접 메서드를 호출하는 것이 아니라 OS에게 실행을 부탁하는 것
		
		tt1.start();
		t.start();
			
	

	}

}
