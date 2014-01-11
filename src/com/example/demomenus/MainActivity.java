package com.example.demomenus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.glass.app.Card;
import com.google.android.glass.app.Card.ImageLayout;

 

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Card card2 = new Card(this);
		card2.setText("This card has a puppy background image.");
		 
	    card2.setImageLayout(ImageLayout.FULL);
		card2.addImage(R.drawable.hinh);
		// Don't call this if you're using TimelineManager
		View card2View = card2.toView();
		setContentView(card2View);
	}

	@Override
	public boolean onKeyDown(int keycode, KeyEvent event) {
		if (keycode == KeyEvent.KEYCODE_DPAD_CENTER) { // KEYCODE_DPAD_CENTER
			openOptionsMenu();
			return true;
		}
		return false;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.action_settings:
			
			Intent i = new Intent(this, WellcomeActivity.class);
			
			startActivity(i);
			break;
		case R.id.action_start:
			Intent i2 = new Intent(this, Wellcome2Activity.class);
			startActivity(i2);
			break;
		case R.id.action_reset:
			Intent i3 = new Intent(this, WellcomeActivity.class);
			startActivity(i3);
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
