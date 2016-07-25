package com.example.newsget.model;

import java.util.List;

public class Newsandstat {

	private int stat;
	private List<News> data;
	/**
	 * @return the stat
	 */
	public int getStat() {
		return stat;
	}
	/**
	 * @param stat the stat to set
	 */
	public void setStat(int stat) {
		this.stat = stat;
	}
	/**
	 * @return the data
	 */
	public List<News> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<News> data) {
		this.data = data;
	}
	
}
