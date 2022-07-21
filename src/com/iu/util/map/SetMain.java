package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(10);
		hashSet.add(1);
		hashSet.add(10);
		
		System.out.println(hashSet.size());
		
		Iterator<Integer> iterator = hashSet.iterator();
		//배열로 바꾸는 것처럼 iterator 형식으로 바꾸는 코드
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
