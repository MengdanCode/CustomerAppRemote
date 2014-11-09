package com.example.ifcustomerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class WishListActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wish_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wish_list, menu);
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

			startActivity(i);
			return true;
		}
		if (id == R.id.action_profile) {
			Intent i = new Intent(getApplicationContext(),
					ProfileActivity.class);

			startActivity(i);
			return true;
		}
		if (id == R.id.action_scan) {
			Intent i = new Intent(getApplicationContext(),
					ScanSurpriseActivity.class);

			startActivity(i);
			return true;
		}
		if (id == R.id.action_calendar) {
			Intent i = new Intent(getApplicationContext(),
					CalendarActivity.class);

			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
