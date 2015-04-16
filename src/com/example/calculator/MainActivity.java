package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView tv;
	Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btadd, btsub, btmul, btdiv, btdot, bteq, btclr;
	String str = "";
	double d1 = 0;
	double d2 = 0;
	int ad = 0, mn = 0, ml = 0, dv = 0;
	int flag = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String s1 = "";
		
		tv = (TextView)findViewById(R.id.textView1);
		bt1 = (Button)findViewById(R.id.button1);
		bt2 = (Button)findViewById(R.id.button2);
		bt3 = (Button)findViewById(R.id.button3);
		bt4 = (Button)findViewById(R.id.button4);
		bt5 = (Button)findViewById(R.id.button5);
		bt6 = (Button)findViewById(R.id.button6);
		bt7 = (Button)findViewById(R.id.button7);
		bt8 = (Button)findViewById(R.id.button8);
		bt9 = (Button)findViewById(R.id.button9);
		bt0 = (Button)findViewById(R.id.button0);
		btadd = (Button)findViewById(R.id.buttonadd);
		btsub = (Button)findViewById(R.id.buttonmin);
		btmul = (Button)findViewById(R.id.buttonmul);
		btdiv = (Button)findViewById(R.id.buttondiv);
		btdot = (Button)findViewById(R.id.buttondot);
		bteq = (Button)findViewById(R.id.buttoneq);
		btclr = (Button)findViewById(R.id.buttonclr);
		
		bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 1;
				tv.setText(s);
			}
		});
		
		bt2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 2;
				tv.setText(s);
			}
		});

		bt3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 3;
				tv.setText(s);
			}
		});

		bt4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 4;
				tv.setText(s);
			}
		});

		bt5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 5;
				tv.setText(s);
			}
		});

		bt6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 6;
				tv.setText(s);
			}
		});
		
		bt7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 7;
				tv.setText(s);
			}
		});
		
		bt8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 8;
				tv.setText(s);
			}
		});
		
		bt9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 9;
				tv.setText(s);
			}
		});
		
		bt0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (flag == 0) {
					flag = 1;
				}
				str = tv.getText().toString();
				String s = str + 0;
				tv.setText(s);
			}
		});
		
		btclr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = "";
				d1 = 0;
				d2 = 0;
				ad = 0;
				mn = 0;
				ml = 0;
				dv = 0;
				tv.setText(s);
			}
		});

		
		btdot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str = tv.getText().toString();
				String s = str + ".";
				tv.setText(s);
			}
		});

		
		btadd.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ad = 1;
				str = tv.getText().toString();
				d1 = Double.parseDouble(str);
				String s = "";
				tv.setText(s);
			}
		});
		
		btsub.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mn = 1;
				str = tv.getText().toString();
				d1 = Double.parseDouble(str);
				String s = "";
				tv.setText(s);
			}
		});
		
		btmul.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ml = 1;
				str = tv.getText().toString();
				d1 = Double.parseDouble(str);
				String s = "";
				tv.setText(s);
			}
		});
		
		btdiv.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dv = 1;
				str = tv.getText().toString();
				d1 = Double.parseDouble(str);
				String s = "";
				tv.setText(s);
			}
		});
		
		bteq.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str = tv.getText().toString();
				d2 = Double.parseDouble(str);
				flag = 0;
				
				if (ad == 1) {
					ad = 0;
					d1 = d1 + d2;
					String s = "" + d1;
					tv.setText(s);
					d1 = 0;
					d2 = 0;
				} else if (mn == 1) {
					mn = 0;
					d1 = d1 - d2;
					String s = "" + d1;
					tv.setText(s);
					d1 = 0;
					d2 = 0;
				} else if (ml == 1) {
					ml = 0;
					d1 = d1 * d2;
					String s = "" + d1;
					tv.setText(s);
					d1 = 0;
					d2 = 0;
				} else if (dv == 1) {
					dv = 0;
					d1 = d1 / d2;
					String s = "" + d1;
					tv.setText(s);
					d1 = 0;
					d2 = 0;
				}
			}
		});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
