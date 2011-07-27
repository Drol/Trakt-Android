package com.lord.trakttv;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class TraktTVActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        /** Set up events */
        EventHandler eh = new EventHandler(this);
        
	    Button button = (Button)findViewById(R.id.buttonRefresh);
	    button.setOnClickListener(eh);
    }
    
    /** Create options menu */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
    }
    
    /** Handle menu item selections */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.exit:
        	// Fully close the program
        	System.exit(0);
            return true;
        case R.id.settings:
            //showHelp();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}