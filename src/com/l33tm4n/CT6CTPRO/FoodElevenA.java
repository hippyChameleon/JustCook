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
 
public class FoodElevenA extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.food_11_a);
        addListenerOnButton();
    }
    
    public void addListenerOnButton() {
    	 
		Button justcook11a = (Button) findViewById(R.id.justcook11a);
 
		justcook11a.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  Intent browserIntent = 
                new Intent(Intent.ACTION_VIEW, 
                Uri.parse("http://bit.ly/1j6FAgB"));
			    startActivity(browserIntent);
 
			}
 
		});
    }
    
    public void btnGetMap(View view)
	//Get Map 
	{
		Intent mapElevenA = new Intent(FoodElevenA.this, MapView.class);
		startActivity(mapElevenA);
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