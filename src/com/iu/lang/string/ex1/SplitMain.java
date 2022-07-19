package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		
		WorkerDTO [] WorkerDTOs = ws.init();
		wv.view(WorkerDTOs);
		
//		int num = 10;
//		String.valueOf(num);
//		System.out.println(num);
		
		

	}

}
