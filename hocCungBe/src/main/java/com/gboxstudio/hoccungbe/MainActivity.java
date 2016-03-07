package com.gboxstudio.hoccungbe;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.gboxstudio.hoccungbe.config.Constant;
import com.gboxstudio.hoccungbe.config.Variables;

public class MainActivity extends Activity implements OnClickListener {

	private ImageView btnCharacter, btnAnimal, btnShape;
	private ImageView btnNumber, btnFruit, btnCar;
	
	private boolean doubleBackToExitPressedOnce = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Constant.initMusic(MainActivity.this);
		
		initView();
	}
	
	@SuppressLint("NewApi")
	private void initView() {
		btnCharacter = (ImageView) findViewById(R.id.btnChuCai);
		btnAnimal = (ImageView) findViewById(R.id.btnConVat);
		btnShape = (ImageView) findViewById(R.id.btnHinhDang);
		btnNumber = (ImageView) findViewById(R.id.btnSoDem);
		btnFruit = (ImageView) findViewById(R.id.btnTraiCay);
		btnCar = (ImageView) findViewById(R.id.btnXeCo);

		// animation character move from right to left
		AnimatorSet setCharacter = new AnimatorSet();
		setCharacter.playTogether(ObjectAnimator.ofFloat(btnCharacter, "translationX", Variables.SCR_WIDTH, Variables.SCR_WIDTH/9),
	               ObjectAnimator.ofFloat(btnCharacter, "translationY", Variables.SCR_HEIGHT, Variables.SCR_HEIGHT/5));
		setCharacter.setDuration(1700);
		setCharacter.start();
		
		// animation animal move from right to left		
		AnimatorSet setAnimal = new AnimatorSet();
		setAnimal.playTogether(ObjectAnimator.ofFloat(btnAnimal, "translationX", Variables.SCR_WIDTH, Variables.SCR_WIDTH/4),
	               ObjectAnimator.ofFloat(btnAnimal, "translationY", Variables.SCR_HEIGHT, Variables.SCR_HEIGHT/3));
		setAnimal.setDuration(1500);
		setAnimal.start();
		
		// animation shape move from right to left
		AnimatorSet setShape = new AnimatorSet();
		setShape.playTogether(ObjectAnimator.ofFloat(btnShape, "translationX", Variables.SCR_WIDTH, Variables.SCR_WIDTH/2 - 100),
	               ObjectAnimator.ofFloat(btnShape, "translationY", Variables.SCR_HEIGHT, Variables.SCR_HEIGHT/4));
		setShape.setDuration(1800);
		setShape.start();
		
		// animation number move from right to left
		AnimatorSet setNumber = new AnimatorSet();
		setNumber.playTogether(ObjectAnimator.ofFloat(btnNumber, "translationX", Variables.SCR_WIDTH, Variables.SCR_WIDTH/2 + 100),
	               ObjectAnimator.ofFloat(btnNumber, "translationY", Variables.SCR_HEIGHT, Variables.SCR_HEIGHT/3 + 100));
		setNumber.setDuration(1800);
		setNumber.start();
		
		// animation fruit move from right to left
		AnimatorSet setFruit = new AnimatorSet();
		setFruit.playTogether(ObjectAnimator.ofFloat(btnFruit, "translationX", Variables.SCR_WIDTH, Variables.SCR_WIDTH - 350),
	               ObjectAnimator.ofFloat(btnFruit, "translationY", Variables.SCR_HEIGHT, Variables.SCR_HEIGHT/4));
		setFruit.setDuration(2000);
		setFruit.start();
		
		// animation car move from right to left
		AnimatorSet setCar = new AnimatorSet();
		setCar.playTogether(ObjectAnimator.ofFloat(btnCar, "translationX", Variables.SCR_WIDTH, Variables.SCR_WIDTH - 200),
	               ObjectAnimator.ofFloat(btnCar, "translationY", Variables.SCR_HEIGHT, Variables.SCR_HEIGHT/6));
		setCar.setDuration(2000);
		setCar.start();

		btnCharacter.setOnClickListener(this);
		btnAnimal.setOnClickListener(this);
		btnShape.setOnClickListener(this);
		btnNumber.setOnClickListener(this);
		btnFruit.setOnClickListener(this);
		btnCar.setOnClickListener(this);
	}
	
	@Override
	public void onBackPressed() {
		if (doubleBackToExitPressedOnce) {
			Constant.mediaPlayer.stop();
			super.onBackPressed();
			finish();
			System.exit(0);
			return;
		}
		this.doubleBackToExitPressedOnce = true;
		Toast.makeText(this, "Nhấn 'back' lần nữa để thoát.", Toast.LENGTH_SHORT).show();
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				doubleBackToExitPressedOnce = false;
			}
		}, 2000);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.btnChuCai:
			Intent character = new Intent(getApplicationContext(), CharacterActivity.class);
			startActivity(character);
			break;

		case R.id.btnConVat:
			Intent animal = new Intent(getApplicationContext(), AnimalActivity.class);
			startActivity(animal);
			break;

		case R.id.btnHinhDang:
			Intent shape = new Intent(getApplicationContext(), ShapeActivity.class);
			startActivity(shape);
			break;

		case R.id.btnSoDem:
			Intent number = new Intent(getApplicationContext(), NumberActivity.class);
			startActivity(number);
			break;

		case R.id.btnTraiCay:
			Intent fruit = new Intent(getApplicationContext(), FruitActivity.class);
			startActivity(fruit);
			break;

		case R.id.btnXeCo:
			Intent car = new Intent(getApplicationContext(), CarActivity.class);
			startActivity(car);
			break;

		default:
			break;
		}
	}
}
