package com.igc.hoteldemo.entity;

public class FoodEntity {

	private int fid;
	
	private String fname;
	
	private double price;
	
	private int qty;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "FoodEntity [fid=" + fid + ", fname=" + fname + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}
