package com.example.vmac.WatBot.intro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vmac.WatBot.MainActivity;
import com.example.vmac.WatBot.R;

public class thirdFragment extends Fragment {
    private static final String ARG_LAYOUT_RES_ID = "thirdFragment";
    private int layoutResId;

    public static thirdFragment newInstance(int layoutResId) {
        thirdFragment third = new thirdFragment();

        Bundle args = new Bundle();
        args.putInt(ARG_LAYOUT_RES_ID, layoutResId);
        third.setArguments(args);

        return third;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.thirdfragment, container, false);

        Button b = (Button) v.findViewById(R.id.third_fragment_action_button);
        final Button login = (Button) v.findViewById(R.id.thirdfragment_login);
        final LinearLayout layout = (LinearLayout) v.findViewById(R.id.registerform);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.third_fragment_action_button:
                        hideScreenAndShowRegistration(v);
                        login.setVisibility(View.VISIBLE);
                        layout.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.thirdfragment_login:
                        openChatBot(v);
                        break;
                }
            }
        });


        return v;
    }

    private void openChatBot(View v) {

        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("loggedin", 1);
        editor.commit();

        Intent i = new Intent(getContext(), MainActivity.class);
        getActivity().finish();  //Kill the activity from which you will go to next activity
        startActivity(i);
    }

    public void hideScreenAndShowRegistration(View v){

        Button button = (Button) v.findViewById(R.id.third_fragment_action_button);
        LinearLayout linearLayout = (LinearLayout) getActivity().findViewById(R.id.registerform);

        if (button != null)
            button.setVisibility(View.GONE);

        if (linearLayout != null)
            linearLayout.setVisibility(View.VISIBLE);

    }
}
