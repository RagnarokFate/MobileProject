package com.myapp.project;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signUpLabel = findViewById(R.id.signUpLabel);
        signUpLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SignupActivity when the "Sign up here" text is clicked
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
