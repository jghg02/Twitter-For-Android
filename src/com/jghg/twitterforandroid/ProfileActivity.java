package com.jghg.twitterforandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toast.makeText(this, "aqui", Toast.LENGTH_SHORT).show();
    }


}
