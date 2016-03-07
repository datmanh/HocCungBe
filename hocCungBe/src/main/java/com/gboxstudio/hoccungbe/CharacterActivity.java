package com.gboxstudio.hoccungbe;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.gboxstudio.hoccungbe.adapter.PagerAdapter;
import com.gboxstudio.hoccungbe.config.Constant;
import com.gboxstudio.hoccungbe.config.Data;
import com.gboxstudio.hoccungbe.utils.Methods;

public class CharacterActivity extends Activity implements OnClickListener {

	private ViewPager viewPager;
	private PagerAdapter pagerAdapter;

	private ImageView imgBack;
	private ImageView imgNext;

	// Viet_Eng
	private ToggleButton mbtnViet;
	private ToggleButton mbtnEng;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_character);

		Constant.mediaPlayer.pause();

		setlayoutMain();
		initView();

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Constant.mediaPlayer.seekTo(0);
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
		imgBack = (ImageView) findViewById(R.id.imgBack);
		imgNext = (ImageView) findViewById(R.id.imgNext);

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		
		if (Methods.getTypeSound(getApplicationContext()) == 1) {
			pagerAdapter = new PagerAdapter(getApplicationContext(), Data.letter,Data.word);
		} else if (Methods.getTypeSound(getApplicationContext()) == 2) {
			pagerAdapter = new PagerAdapter(getApplicationContext(), Data.letter_Eng,Data.word_Eng);
		}
		
		viewPager.setAdapter(pagerAdapter);

		imgBack.setOnClickListener(this);
		imgNext.setOnClickListener(this);

	}

	private int getItem(int i) {
		return viewPager.getCurrentItem() + i;
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();

		switch (id) {
		case R.id.btnViet:
			Methods.saveTypeSound(1, getApplicationContext());

			initView();
			
			mbtnViet.setChecked(true);
			if (mbtnEng.isChecked() == true) {
				mbtnEng.setChecked(false);
			}
			break;

		case R.id.btnEnglish:
			Methods.saveTypeSound(2, getApplicationContext());

			initView();
			
			mbtnEng.setChecked(true);
			if (mbtnViet.isChecked() == true) {
				mbtnViet.setChecked(false);
			}
			break;
		
		case R.id.imgBack:
			viewPager.setCurrentItem(getItem(-1), true);
			
			break;

		case R.id.imgNext:
			viewPager.setCurrentItem(getItem(+1), true);
			
			break;

		default:
			break;
		}
	}

}
