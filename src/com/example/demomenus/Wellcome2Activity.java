package com.example.demomenus;

import com.google.android.glass.app.Card;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Wellcome2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Card card1 = new Card(this);
		card1.setText("Hinh xuan 3");
		card1.addImage(R.drawable.xuan2); 
		card1.setImageLayout(Card.ImageLayout.FULL);
		//card1.getFullScreenImages();
		// Don't call this if you're using TimelineManager
		View card1View = card1.toView();
		setContentView(card1View);
		//setContentView(R.layout.activity_wellcome2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wellcome2, menu);
		return true;
	}

}
