package com.myapp.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.myapp.entities.Account_Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class SignupActivity extends AppCompatActivity {

    private EditText emailEditText, confirmEmailEditText, passwordEditText;
    private Spinner genderSpinner;
    private CheckBox agreeCheckBox;
    private Button registerButton;
    private TextView errorLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        emailEditText = findViewById(R.id.emailEditText);
        confirmEmailEditText = findViewById(R.id.confirmEmailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        genderSpinner = findViewById(R.id.genderSpinner);
        agreeCheckBox = findViewById(R.id.agreeCheckBox);
        registerButton = findViewById(R.id.registerButton);
        errorLabel = findViewById(R.id.errorLabel);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndRegister();
            }
        });
    }


    private String generateUserId() {
        // Generate a unique user ID using timestamp and random number
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault());
        String timestamp = sdf.format(new Date());

        // Add a random number to the timestamp to make it more unique
        Random random = new Random();
        int randomNumber = random.nextInt(1000);

        // Combine timestamp and random number to create the user ID
        return timestamp + randomNumber;
    }

    private void validateAndRegister() {

        String email = emailEditText.getText().toString().trim();
        String confirmEmail = confirmEmailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        String gender = genderSpinner.getSelectedItem().toString();
        boolean agreeChecked = agreeCheckBox.isChecked();

        // Reset error label
        errorLabel.setText("");

        // Validate email
        if (!isValidEmail(email)) {
            showError("Invalid email");
            return;
        }

        // Validate confirm email
        if (!email.equals(confirmEmail)) {
            showError("Emails do not match");
            return;
        }

        // Validate password
        if (!isValidPassword(password)) {
            showError("Invalid password");
            return;
        }

        // Validate agreement checkbox
        if (!agreeChecked) {
            showError("Please agree to the terms and conditions");
            return;
        }

        // Registration logic here
        // You can handle the registration process based on your app's requirements
        String userId = generateUserId();

        // Include the user ID in your registration logic or store it in the database
        // For now, just print it as an example
        System.out.println("User ID: " + userId);

        /*errorLabel.setText("Registration successful!");*/

        try {
            Account_Entity User_Data = new Account_Entity(userId, "", email, password, gender);
            setContentView(R.layout.activity_authentication_signup);
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }

    private void showError(String errorMessage) {
        errorLabel.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        errorLabel.setText(errorMessage);
    }

    private boolean isValidEmail(String email) {
        // Simple email validation
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean isValidPassword(String password) {
        // Password validation: At least 6 characters, contains a number, and both upper and lower case letters
        return password.length() >= 6 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }
}
