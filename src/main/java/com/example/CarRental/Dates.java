package com.example.CarRental;

public class Dates {
	private String begin;
	private String end;
	
	public Dates(String bd,String ed) {
		super();
		this.begin=bd;
		this.end=ed;
	}
	
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
}
