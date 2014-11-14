package com.l33tm4n.CT6CTPRO;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class MealOnePriceThree extends ListActivity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
     // storing string resources into Array
        String[] meal_one_price_three = getResources().getStringArray(R.array.meal_one_price_three);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.price_three, R.id.label_three, meal_one_price_three));
        
        
        ListView lv = getListView();
     // MEALS FOR 1 FOR �15 
     // Perfect Pita Pizza, Tuna Pasta Bake and Mince & Vegatable Pasta 
        
        lv.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick( AdapterView <?> parent, View view, int   
                                     position,long id){

                 switch(position){
                      case 0:
                    	  // user clicks on the 1st list item
                    	  Intent i7 = new Intent(getApplicationContext(), FoodSeven.class);
                          startActivity(i7);
                        break;
                      case 1:
                    	  // user clicks on the 2nd list item
                    	  Intent i8 = new Intent(getApplicationContext(), FoodEight.class);
                          startActivity(i8); 
                         break;
                      case 2:
                    	  // user clicks on the 3rd list item
                    	  Intent i9 = new Intent(getApplicationContext(), FoodNine.class);
                          startActivity(i9); 
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
