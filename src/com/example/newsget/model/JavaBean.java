package com.example.newsget.model;

import java.util.List;

public class JavaBean {

	private String reason;
	private int error_code;
	private Newsandstat result;
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the error_code
	 */
	public int getError_code() {
		return error_code;
	}
	/**
	 * @param error_code the error_code to set
	 */
	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
	/**
	 * @return the result
	 */
	public Newsandstat getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(Newsandstat result) {
		this.result = result;
	}
	
}
