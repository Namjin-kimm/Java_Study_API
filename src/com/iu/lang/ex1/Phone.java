package com.iu.lang.ex1;

public class Phone {
	
	private int price;
	private int size;
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
////	public boolean equals(Phone p1, Phone p2) {
////		boolean check = p1.price == p2.price && p1.size == p2.size ? true : false;
////		
////		return check;
//	
//	
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Phone p2 = (Phone)obj;
//		boolean check = p2.price == this.price && p2.size == this.size ? true : false;
//		
//		return check;
//	}
	
	@Override
	public boolean equals(Object obj) {
		Phone p2 = (Phone) obj;
		boolean check = false;
		if(this.getPrice() == p2.getPrice() && this.getSize() == p2.getSize()) {
			check = !check;
		}
		return check;
	}
	

}
