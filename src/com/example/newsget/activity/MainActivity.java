package com.example.newsget.activity;

import com.example.newsget.R;
import com.example.newsget.Fragment.MainFragment1;
import com.example.newsget.Fragment.MainFragment2;
import com.example.newsget.Fragment.MainFragment3;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends FragmentActivity implements OnClickListener {

	private MainFragment1 mainFrament1;
	private MainFragment2 mainFrament2;
	private MainFragment3 mainFrament3;
	private android.support.v4.app.FragmentManager manager;
	private ImageButton iamgeButton1;
	private ImageButton iamgeButton2;
	private ImageButton iamgeButton3;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_main);
		manager = getSupportFragmentManager();

		initLayout();

	}

	private void initLayout() {
		// TODO Auto-generated method stub
		iamgeButton1 = (ImageButton) findViewById(R.id.bottom_pic1);
		iamgeButton2 = (ImageButton) findViewById(R.id.bottom_pic2);
		iamgeButton3 = (ImageButton) findViewById(R.id.bottom_pic3);

		iamgeButton1.setOnClickListener(this);

		iamgeButton2.setOnClickListener(this);
		iamgeButton3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bottom_pic1:
			mainFrament1 = new MainFragment1();

			manager.beginTransaction()
					.replace(R.id.main_layout_fragment, mainFrament1).commit();
			Log.d("MainA", "fragment1");
			break;

		case R.id.bottom_pic2:
			mainFrament2 = new MainFragment2();

			manager.beginTransaction()
					.replace(R.id.main_layout_fragment, mainFrament2).commit();
			Log.d("MainA", "fragment2");
			break;
		case R.id.bottom_pic3:
			mainFrament3 = new MainFragment3();

			manager.beginTransaction()
					.replace(R.id.main_layout_fragment, mainFrament3).commit();
			Log.d("MainA", "fragment3");
			break;
		default:
			break;
		}
	}

	

}
