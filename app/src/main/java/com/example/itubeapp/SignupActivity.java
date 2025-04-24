package com.example.itubeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    EditText enterFullName, enterUsername, enterPassword, enterReEnterPassword;
    Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        enterFullName = findViewById(R.id.enterFullName);
        enterUsername = findViewById(R.id.enterUsername);
        enterPassword = findViewById(R.id.enterPassword);
        enterReEnterPassword = findViewById(R.id.enterReEnterPassword);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);

        btnCreateAccount.setOnClickListener(v -> {
            String Name = enterFullName.getText().toString();
            String username = enterUsername.getText().toString();
            String password = enterPassword.getText().toString();
            String confirmPassword = enterReEnterPassword.getText().toString();

            if (username.isEmpty() || password.isEmpty() || !password.equals(confirmPassword)) {
                Toast.makeText(SignupActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(SignupActivity.this, "Account Created", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignupActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}
