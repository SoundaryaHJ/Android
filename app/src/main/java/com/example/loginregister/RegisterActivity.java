package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText RegName;
    EditText RegPassword;
    EditText RegEmail;
    EditText RegPhone;
    Button Reg;
    TextView login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        RegName = (EditText) findViewById(R.id.RegName);
        RegPassword = (EditText) findViewById(R.id.RegPassword);
        RegEmail = (EditText) findViewById(R.id.RegEmail);
        RegPhone = (EditText) findViewById(R.id.RegPhoneno);
        Reg = (Button) findViewById(R.id.Reg);
        login = (TextView) findViewById(R.id.login);


        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = RegName.getText().toString();
                String email = RegEmail.getText().toString();
                String password = RegPassword.getText().toString();
                String phone = RegPhone.getText().toString();

                if (RegName.equals("") || RegEmail.equals("") || password.equals("") || phone.equals(""))
                    Toast.makeText(RegisterActivity.this, "Fields should not be Empty", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(RegisterActivity.this, "User Register Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplication(), MainActivity.class);
                    startActivity(intent);
                }

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

}
