package com.l33tm4n.CT6CTPRO;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

 
public class FoodNineA extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_9_a);
        addListenerOnButton();
    }
    
    public void addListenerOnButton() {
    	 
		Button justcook9a = (Button) findViewById(R.id.justcook9a);
 
		justcook9a.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  Intent browserIntent = 
                new Intent(Intent.ACTION_VIEW, 
                Uri.parse("http://bit.ly/OwYO5I"));
			    startActivity(browserIntent);
 
			}
 
		});
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	        NavUtils.navigateUpFromSameTask(this);
	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}
}