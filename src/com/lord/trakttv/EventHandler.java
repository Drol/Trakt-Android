package com.lord.trakttv;

import java.util.Date;
import java.util.List;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.jakewharton.trakt.ServiceManager;
import com.jakewharton.trakt.entities.CalendarDate;
import com.jakewharton.trakt.entities.CalendarDate.CalendarTvShowEpisode;

public class EventHandler implements OnClickListener {
	TraktTVActivity activity;
	
	ServiceManager manager = new ServiceManager();

	
	public EventHandler(TraktTVActivity activity) {
		this.activity = activity;
		
		// Set up Trakt Service Manager
		manager.setAuthentication("Flanhare", "22KOttar11");
		manager.setApiKey("be214228f9c9cb9b792f43b5fe170919");
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonRefresh:
			//onButton1Click();
		}
	}
	/*
	private void onButton1Click() {
		TableLayout table = (TableLayout)activity.findViewById(R.id.tableLayoutShows);
				
		Date date = new Date();
		List<CalendarDate> calendarShows = manager.userService().calendarShows("Flanhare").date(date).days(7).fire();
		
		for (CalendarDate calendarDate : calendarShows) {
			// Date
			
			for (CalendarTvShowEpisode episode : calendarDate.getEpisodes()) {
				// Show Episode
								
				TextView tv = new TextView(activity);
				tv.setText("TESTAR");
				tv.setEnabled(true);
				
				TableRow tr = new TableRow(activity);
				tr.addView(tv);
				tr.setEnabled(true);
				
				table.addView(tr);
			}
		}
		
		//String showTitle = calendarShows.get(0).getEpisodes().get(0).getShow().getTitle();
		
		//tv1.setText(showTitle);
	}
	*/
}
