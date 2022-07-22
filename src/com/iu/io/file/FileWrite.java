package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	
	public void write() throws Exception {
		File file = new File("/Users/namjinkim/Documents/Study","test.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("\nAnother String\r\n");
		//이것도 버퍼에 담아놨다가 보내는 것
		//버퍼는 용량이 다 차야 안에 있는 것들을 내보냄. 그렇기에 버퍼를 강제를 비워서(밀어서)
		//우리가 쓴 내용이 출력되게 해야함
		fw.flush();
		//밀어내면 안 돌아온다. 주사기 피스톤처럼 민 후에 다시 내용물을 넣고 싶으면 다시 당겨야한다.
		//밀어내고 다시 뒤로 당기려면 우리가 쓰고 싶은 문자열뒤에 "\r" 을 써주면 된다.
		//그리고 쓴 문장 다음줄에 쓰고 싶으면 우리가 배웠던 "\n"을 쓰면 된다.
		//flush는 마지막에 한 번만 해주면 된다.
	}

}
