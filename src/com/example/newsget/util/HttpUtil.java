package com.example.newsget.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {

	public static void sendHttpRequest(final String address,final HttpCallbackListener listener){
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				HttpURLConnection connection =null;
				try{
					URL url=new URL(address);
					connection=(HttpURLConnection) url.openConnection();
					connection.setReadTimeout(5000);
					connection.setReadTimeout(5000);
					connection.setRequestMethod("GET");
					InputStream in=connection.getInputStream();
					BufferedReader reader=new BufferedReader(new InputStreamReader(in));
					StringBuilder response=new StringBuilder();
					String line="";
					while((line=reader.readLine())!=null){
						response.append(line);
					}
					if(listener!=null){
						listener.onFinish(response.toString());
					}
					
				}catch (Exception e){
					listener.onErroe(e);
				}finally{
					if(connection!=null){
						connection.disconnect();
					}
				}
			}
		}).start();
		
	}
	
}
