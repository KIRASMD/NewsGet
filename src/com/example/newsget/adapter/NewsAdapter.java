package com.example.newsget.adapter;

import java.util.List;

import com.example.newsget.model.News;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter<News> {

	private int itemLayoutId;
	
	public NewsAdapter(Context context, int resource, List<News> objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		itemLayoutId=resource;
	}

	/* (non-Javadoc)
	 * @see android.widget.ArrayAdapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return super.getView(position, convertView, parent);
		
		
		
		
		
		
	}

	class ViewHolder{
		ImageView imageView;
		TextView textView;
	}
}
