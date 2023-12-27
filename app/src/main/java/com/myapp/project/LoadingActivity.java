package com.myapp.project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class LoadingActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        // Simulate fetching session user data (replace this with your actual logic)
        fetchSessionUserData();

        // Delayed start of the main activity after SPLASH_DELAY
        new Handler().postDelayed(() -> {
            Intent welcomeIntent = new Intent(LoadingActivity.this, MainActivity.class);
            startActivity(welcomeIntent);
            finish();
        }, SPLASH_DELAY);
    }

    private void fetchSessionUserData() {
        // Simulate fetching session user data
        // Replace this with your actual logic to obtain the latest session user data
        // For example, you can make a network request, fetch from local storage, etc.
    }
}
