package com.example.ifcustomerapp;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SurpriseResultActivity extends ActionBarActivity {
	private TextView result;
	private String QRresult;
	private String userId;
	private String TAG = "Tag";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_surprise_result);
//		result = (TextView) findViewById(R.id.QRresult);

		Bundle bundle = getIntent().getExtras();
		QRresult = bundle.getString("result");

		SharedPreferences prefs = getSharedPreferences("test", MODE_PRIVATE);
		userId = prefs.getString("userId", null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.suprise_result, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_wishList) {
			Intent i = new Intent(getApplicationContext(),
					WishListActivity.class);
			finish();

			startActivity(i);
			return true;
		}
		if (id == R.id.action_profile) {
			Intent i = new Intent(getApplicationContext(),
					ProfileActivity.class);
			finish();

			startActivity(i);
			return true;
		}
		if (id == R.id.action_scan) {
			Intent i = new Intent(getApplicationContext(),
					ScanSurpriseActivity.class);
			finish();

			startActivity(i);
			return true;
		}
		if (id == R.id.action_calendar) {
			Intent i = new Intent(getApplicationContext(),
					CalendarActivity.class);
			finish();

			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
