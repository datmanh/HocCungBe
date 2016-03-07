package com.gboxstudio.hoccungbe;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ToggleButton;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.gboxstudio.hoccungbe.adapter.ShapeAdapter;
import com.gboxstudio.hoccungbe.config.Constant;
import com.gboxstudio.hoccungbe.config.Data;
import com.gboxstudio.hoccungbe.utils.Methods;

public class ShapeActivity extends Activity implements OnItemClickListener, OnClickListener {

	private GridView gvShape;
	private ShapeAdapter mShapeAdapter;
	
	// Media
	private MediaPlayer mediaShape = null;
	private int musicShape;
	
	// Viet_Eng
	private ToggleButton mbtnViet;
	private ToggleButton mbtnEng;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shape);
		
		Constant.mediaPlayer.pause();
		
		setlayoutMain();
		initView();
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Constant.mediaPlayer.seekTo(3);
		Constant.mediaPlayer.start();
	}
	
	private void setlayoutMain() {
		mbtnViet = (ToggleButton) findViewById(R.id.btnViet);
		mbtnEng = (ToggleButton) findViewById(R.id.btnEnglish);

		if (Methods.getTypeSound(getApplicationContext()) == 1) {
			mbtnViet.setChecked(true);
		} else if (Methods.getTypeSound(getApplicationContext()) == 2) {
			mbtnEng.setChecked(true);
		}

		mbtnViet.setOnClickListener(this);
		mbtnEng.setOnClickListener(this);
	}
	
	private void initView() {
		gvShape = (GridView) findViewById(R.id.gvShape);
		mShapeAdapter = new ShapeAdapter(getApplicationContext(), 0, Data.shape);
		gvShape.setAdapter(mShapeAdapter);
		gvShape.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		
		try {
			for (int i = 0; i < Constant.audioShape.length; i++) {
				if(i == position) {
					
					if (Methods.getTypeSound(getApplicationContext()) == 1) {
						musicShape = Constant.audioShape[i];
					} else if (Methods.getTypeSound(getApplicationContext()) == 2) {
						musicShape = Constant.audioShapeEng[i];
					}
					
					mediaShape = MediaPlayer.create(ShapeActivity.this, musicShape);
				}
			}
			mediaShape.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();

		switch (id) {
		case R.id.btnViet:
			Methods.saveTypeSound(1, getApplicationContext());

			mbtnViet.setChecked(true);
			if (mbtnEng.isChecked() == true) {
				mbtnEng.setChecked(false);
			}
			break;

		case R.id.btnEnglish:
			Methods.saveTypeSound(2, getApplicationContext());

			mbtnEng.setChecked(true);
			if (mbtnViet.isChecked() == true) {
				mbtnViet.setChecked(false);
			}
			break;

		}
	}
}
