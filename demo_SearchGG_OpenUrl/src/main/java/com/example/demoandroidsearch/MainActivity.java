package com.example.demoandroidsearch;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	private EditText txtSearch;
	private EditText txtUrl;
	private Button btnSearch;
	private Button btnUrl;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intitView();
    }
    
    public void intitView() {
		txtSearch = (EditText) findViewById(R.id.txtSearch);
		txtUrl = (EditText) findViewById(R.id.txtUrl);
		btnSearch = (Button) findViewById(R.id.btnSearch);
		btnUrl = (Button) findViewById(R.id.btnUrl);
		
		btnSearch.setOnClickListener(this);
		btnUrl.setOnClickListener(this);
	}
    
    @Override
	public void onClick(View v) {
		int id = v.getId();
		
		//Muon app vao dk mang thif phai khai bao doan code sau trong AndroidManifest
		// <uses-permission android:name="android.permission.INTERNET"/>
		
		switch (id) {
		case R.id.btnSearch:
			String search = txtSearch.getText().toString();
			Intent intent =new Intent(Intent.ACTION_WEB_SEARCH);
			intent.putExtra(SearchManager.QUERY, search);
			startActivity(intent);
			
			break;

		case R.id.btnUrl:
			String url = txtUrl.getText().toString();
			if (!url.startsWith("http://") && !url.startsWith("https://")) {
				url = "http://" + url;
			}
			//Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
			Intent intent2 = new Intent(Intent.ACTION_VIEW);
			intent2.setData(Uri.parse(url)); 
			startActivity(intent2);
			
			break;
		default:
			break;
		}
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

	

}
