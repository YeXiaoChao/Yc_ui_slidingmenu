package com.yanis.slidingmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
 Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
	}
	
	private void initView() {
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 = (Button)findViewById(R.id.btn2);
		btn3 = (Button)findViewById(R.id.btn3);
		btn4 = (Button)findViewById(R.id.btn4);
		btn5 = (Button)findViewById(R.id.btn5);
		btn6 = (Button)findViewById(R.id.btn6);
		btn7 = (Button)findViewById(R.id.btn7);

		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			startActivity(new Intent(MainActivity.this, SlidingMenuActivity_1.class));
			break;
		case R.id.btn2:
			startActivity(new Intent(MainActivity.this, SlidingMenuActivity_2.class));
			break;
		case R.id.btn3:
			startActivity(new Intent(MainActivity.this, SlidingMenuActivity_3.class));
			break;
		case R.id.btn4:
			startActivity(new Intent(MainActivity.this, SlidingMenuActivity_4.class));
			break;
		case R.id.btn5:
			startActivity(new Intent(MainActivity.this, SlidingMenuActivity_5.class));
			break;
		case R.id.btn6:
			startActivity(new Intent(MainActivity.this, SlidingMenuActivity_6.class));
			break;
		case R.id.btn7:
			startActivity(new Intent(MainActivity.this, SlidingMenuActivity_7.class));
			break;

		default:
			break;
		}
	}
}
