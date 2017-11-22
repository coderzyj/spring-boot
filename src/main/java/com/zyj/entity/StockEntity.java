package com.zyj.entity;

import java.io.Serializable;

public class StockEntity implements Serializable{
	private int id;
	private int item;
	private int count;
	public StockEntity(int id, int item, int count) {
		super();
		this.id = id;
		this.item = item;
		this.count = count;
	}
	public StockEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "StockEntity [id=" + id + ", item=" + item + ", count=" + count
				+ "]";
	}
	
}
