package com.myapp.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.myapp.project.R;


public class AuthenticationSignUpActivity extends AppCompatActivity {

    private EditText etPhoneNumber, etCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication_signup);

        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        etCode = findViewById(R.id.etCode);

        Button btnSendCode = findViewById(R.id.btnSendCode);
        btnSendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement code to send verification code to the provided phone number
                Toast.makeText(AuthenticationSignUpActivity.this, "Code sent!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnVerifyCode = findViewById(R.id.btnVerifyCode);
        btnVerifyCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement code to verify the entered code
                String enteredCode = etCode.getText().toString().trim();
                if (!enteredCode.isEmpty()) {
                    // Code verification logic here
                    Toast.makeText(AuthenticationSignUpActivity.this, "Code verified!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AuthenticationSignUpActivity.this, "Please enter the verification code.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
