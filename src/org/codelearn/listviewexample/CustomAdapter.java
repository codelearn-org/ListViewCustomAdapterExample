package org.codelearn.listviewexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CustomAdapter extends ArrayAdapter<String> {
	private LayoutInflater inflater;
	public CustomAdapter(Activity activity){
		super(activity,R.layout.tweet_row,new String[10]);
        inflater = activity.getWindow().getLayoutInflater();
	}	
	@Override
    public View getView(int position, View convertView, ViewGroup parent){
      return inflater.inflate(R.layout.tweet_row, parent, false);
    }

}
