package com.kg.avatartest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final AvatarView avatarView = (AvatarView) findViewById(R.id.avatarView);

		Spinner hairSpinner = (Spinner) findViewById(R.id.hairSpinner);
		Spinner eyesSpinner = (Spinner) findViewById(R.id.eyesSpinner);
		Spinner lipsSpinner = (Spinner) findViewById(R.id.lipsSpinner);

		hairSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
				
				switch (pos) {
				case 0:
					avatarView.setHair(R.drawable.hair1);
					break;
				case 1:
					avatarView.setHair(R.drawable.hair2);
					break;
				case 2:
					avatarView.setHair(R.drawable.hair3);
					break;
				case 3:
					avatarView.setHair(R.drawable.hair4);
					break;
				case 4:
					avatarView.setHair(R.drawable.hair5);
					break;
				}
				
				avatarView.invalidate();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		eyesSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
				
				switch (pos) {
				case 0:
					avatarView.setEyes(R.drawable.eye1);
					break;
				case 1:
					avatarView.setEyes(R.drawable.eye2);
					break;
				case 2:
					avatarView.setEyes(R.drawable.eye3);
					break;
				case 3:
					avatarView.setEyes(R.drawable.eye4);
					break;
				case 4:
					avatarView.setEyes(R.drawable.eye5);
					break;
				}
				
				avatarView.invalidate();

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		lipsSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {

				switch (pos) {
				case 0:
					avatarView.setLips(R.drawable.lips1);
					break;
				case 1:
					avatarView.setLips(R.drawable.lips2);
					break;
				case 2:
					avatarView.setLips(R.drawable.lips3);
					break;
				case 3:
					avatarView.setLips(R.drawable.lips4);
					break;
				case 4:
					avatarView.setLips(R.drawable.lips5);
					break;
				}
				
				avatarView.invalidate();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
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
