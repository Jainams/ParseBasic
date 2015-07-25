package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ParseStarterProjectActivity extends Activity {
	//String jainam;

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {

		//jainam = "hello jainam1";
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
		ParseAnalytics.trackAppOpenedInBackground(getIntent());
		ParseObject gameScore = new ParseObject("GameScore");
		gameScore.put("score", 1338);
		gameScore.put("playerName", "Jainam Shah");
		gameScore.put("cheatMode", false);
		gameScore.saveInBackground();
		//t.setText("trial1");

	}

		public void buttonOnclick(View v){
			TextView t = (TextView)findViewById(R.id.Text1);
			EditText favcolor = (EditText) findViewById(R.id.editText);
			t.setText(favcolor.getText());
		}


}
