package com.example.android.androiddarkmodeimplementationna;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeConfiguration {
    private SharedPreferences preferences;
    private String RES_ID = "resId";

    public ThemeConfiguration(Context context) {
        preferences = context.getSharedPreferences("myTheme", Context.MODE_PRIVATE);
    }

    public void saveTheme(int resID) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(RES_ID, resID).apply();
    }

    public int getThemeId() {
        return preferences.getInt(RES_ID, 0);
    }
}
