package com.gboxstudio.hoccungbe.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.gboxstudio.hoccungbe.R;
import com.gboxstudio.hoccungbe.config.Constant;
import com.gboxstudio.hoccungbe.utils.Methods;

public class PagerAdapter extends android.support.v4.view.PagerAdapter {

	// Declare Variables
	private MediaPlayer mediaCharacter;
	private int musicCharacter;

	Context context;
	private int letter[];
	private int word[][];
	private LayoutInflater layoutInflater;

	public PagerAdapter(Context context, int letter[], int word[][]) {
		this.context = context;
		this.letter = letter;
		this.word = word;
		layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return letter.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((RelativeLayout) object);
	}

	@SuppressWarnings("unused")
	@Override
	public Object instantiateItem(ViewGroup parent, final int position) {
		final ViewHolder holder;

		View convertView = null;

		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.viewpager_item,parent, false);
			holder = new ViewHolder();

			// Locate the ImageView in viewpager_item.xml
			holder.imgLetter = (ImageView) convertView.findViewById(R.id.imgLetter);
			holder.imgWord_1 = (ImageView) convertView.findViewById(R.id.imgWord_1);
			holder.imgWord_2 = (ImageView) convertView.findViewById(R.id.imgWord_2);
			holder.imgWord_3 = (ImageView) convertView.findViewById(R.id.imgWord_3);
			holder.imgWord_4 = (ImageView) convertView.findViewById(R.id.imgWord_4);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		// Capture position and set to the ImageView
		holder.imgLetter.setImageResource(letter[position]);
		holder.imgWord_1.setImageResource(word[position][0]);
		holder.imgWord_2.setImageResource(word[position][1]);
		holder.imgWord_3.setImageResource(word[position][2]);
		holder.imgWord_4.setImageResource(word[position][3]);

		// Add viewpager_item.xml to ViewPager
		((ViewPager) parent).addView(convertView);

		// bat su kien Click
		holder.imgLetter.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (Methods.getTypeSound(context) == 1) {
					musicCharacter = Constant.audioLetter[position];
				} else if (Methods.getTypeSound(context) == 2) {
					musicCharacter = Constant.audioLetterEng[position];
				}
				
				mediaCharacter = MediaPlayer.create(context, musicCharacter);

				mediaCharacter.start();
			}
		});
		
		holder.imgWord_1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (Methods.getTypeSound(context) == 1) {
					musicCharacter = Constant.audioWord[position][0];
				} else if (Methods.getTypeSound(context) == 2) {
					musicCharacter = Constant.audioWordEng[position][0];
				}

				mediaCharacter = MediaPlayer.create(context, musicCharacter);

				mediaCharacter.start();
			}
		});
		
		holder.imgWord_2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (Methods.getTypeSound(context) == 1) {
					musicCharacter = Constant.audioWord[position][1];
				} else if (Methods.getTypeSound(context) == 2) {
					musicCharacter = Constant.audioWordEng[position][1];
				}
				
				mediaCharacter = MediaPlayer.create(context, musicCharacter);

				mediaCharacter.start();
			}
		});
		
		holder.imgWord_3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (Methods.getTypeSound(context) == 1) {
					musicCharacter = Constant.audioWord[position][2];
				} else if (Methods.getTypeSound(context) == 2) {
					musicCharacter = Constant.audioWordEng[position][2];
				}
				
				mediaCharacter = MediaPlayer.create(context, musicCharacter);

				mediaCharacter.start();
			}
		});
		
		holder.imgWord_4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (Methods.getTypeSound(context) == 1) {
					musicCharacter = Constant.audioWord[position][3];
				} else if (Methods.getTypeSound(context) == 2) {
					musicCharacter = Constant.audioWordEng[position][3];
				}
				
				mediaCharacter = MediaPlayer.create(context, musicCharacter);

				mediaCharacter.start();
			}
		});

		return convertView;
	}

	@Override
	public void destroyItem(ViewGroup parent, int position, Object object) {
		// Remove viewpager_item.xml from ViewPager
		((ViewPager) parent).removeView((RelativeLayout) object);

	}

	static class ViewHolder {
		// Declare Variables
		ImageView imgLetter;
		ImageView imgWord_1;
		ImageView imgWord_2;
		ImageView imgWord_3;
		ImageView imgWord_4;
	}
}
