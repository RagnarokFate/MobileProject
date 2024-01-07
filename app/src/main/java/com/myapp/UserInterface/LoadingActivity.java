package com.myapp.UserInterface;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.myapp.project.R;

public class LoadingActivity extends AppCompatActivity {

    private static final long DELAY_AMOUNT = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        // Simulate fetching user data and switch to the login activity
        fetchDataAndNavigate();
    }

    private void fetchDataAndNavigate() {
        // Simulate fetching user data (replace with your actual data fetching logic)
        // For example, you might use a network request or any other data retrieval method
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Data fetching complete, navigate to the login activity
                startActivity(new Intent(LoadingActivity.this, LoginActivity.class));
                finish();
            }
        }, DELAY_AMOUNT); // Simulating a 2-second delay, replace with your actual data fetching logic
    }
}


