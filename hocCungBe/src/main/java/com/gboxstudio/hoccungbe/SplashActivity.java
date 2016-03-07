package com.gboxstudio.hoccungbe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

import com.gboxstudio.hoccungbe.config.Variables;

public class SplashActivity extends Activity {

	private ImageView imgSplash;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		imgSplash = (ImageView) findViewById(R.id.splash);
		
		DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        Variables.SCR_WIDTH = metrics.widthPixels;
        Variables.SCR_HEIGHT = metrics.heightPixels;
		
		AlphaAnimation animation = new AlphaAnimation(1.0f, 1.0f);
		animation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
				finish();
			}
		});
		animation.setDuration(3000);
		imgSplash.startAnimation(animation);
	}

}
