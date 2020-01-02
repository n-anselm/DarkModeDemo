package com.example.android.androiddarkmodeimplementationna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar mainToolbar;
    ThemeConfiguration themeConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkTheme();
        setContentView(R.layout.activity_main);
    }

    private void checkTheme() {
        themeConfiguration = new ThemeConfiguration(this);
        int resId = themeConfiguration.getThemeId();
        if (resId == 0) {
            setTheme(R.style.AppTheme);
        } else {
            setTheme(resId);
        }
    }

    public void activateDarkMode(View view) {
        themeConfiguration.saveTheme(R.style.DarkTheme);
        recreate();
    }

    public void activateDefaultMode(View view) {
        themeConfiguration.saveTheme(R.style.AppTheme);
        recreate();
    }
}
