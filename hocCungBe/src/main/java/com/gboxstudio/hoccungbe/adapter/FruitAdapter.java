package com.gboxstudio.hoccungbe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.gboxstudio.hoccungbe.R;

public class FruitAdapter extends BaseAdapter {

	private int[] arrData;
	private LayoutInflater layoutInflater;

	public FruitAdapter(Context context, int textViewResourceId, int[] datas) {
		this.arrData 		= datas;
		this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		return arrData.length;
	}

	@Override
	public Object getItem(int position) {
		return arrData[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final ViewHolder holder;
		
		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.item, parent, false);
			holder = new ViewHolder();

			holder.icon = (ImageView) convertView.findViewById(R.id.imgVatChu);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.icon.setBackgroundResource(arrData[position]);
		
		return convertView;
	}

	static class ViewHolder {
		ImageView icon;
	}
}
