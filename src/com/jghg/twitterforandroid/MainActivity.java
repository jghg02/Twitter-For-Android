package com.jghg.twitterforandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        profile = (Button) findViewById(R.id.profile);
    }


    public void onClickProfile(View view) {
        Toast.makeText(this, "Show Profile Twitter", Toast.LENGTH_SHORT).show();

        startActivity(new Intent(MainActivity.this, ProfileActivity.class));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
