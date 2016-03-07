package com.gboxstudio.hoccungbe.utils;

import android.content.Context;
import android.content.SharedPreferences;


public class Methods {
	
	public static void saveTypeSound(int pType, Context pContext) {
		SharedPreferences sp = pContext.getSharedPreferences("hoccungbe", 0);
		SharedPreferences.Editor editor = sp.edit();
		editor.putInt("typesound", pType);
		editor.commit();
	}
	
	public static int getTypeSound(Context pContext) {
		SharedPreferences sp = pContext.getSharedPreferences("hoccungbe", 0);
		return sp.getInt("typesound", 1);
	}
	
}
