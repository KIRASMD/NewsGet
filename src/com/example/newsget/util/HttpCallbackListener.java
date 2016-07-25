package com.example.newsget.util;

public interface HttpCallbackListener {

	void onFinish(String response);
	void onErroe(Exception e);
}
