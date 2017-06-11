package com.example.vmac.WatBot.intro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.vmac.WatBot.MainActivity;
import com.example.vmac.WatBot.R;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import static com.example.vmac.WatBot.R.drawable.bot_icon;

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        int loggedin = sharedPref.getInt("loggedin", 0);

        if (loggedin == 1){
            Intent i = new Intent(this, MainActivity.class);
            finish();  //Kill the activity from which you will go to next activity
            startActivity(i);
        }

        addSlide(firstFragment.newInstance(R.layout.firstfragment));
        addSlide(secondFragment.newInstance(R.layout.secondfragment));
        addSlide(thirdFragment.newInstance(R.layout.thirdfragment));

        // Override bar/separator color.
        setBarColor(Color.parseColor("#1E90FF"));

        // Hide Skip/Done button.
        showSkipButton(false);
        setProgressButtonEnabled(false);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
