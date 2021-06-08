package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText LogName;
    EditText LogPassword;
    Button Log;
    TextView register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogName = (EditText) findViewById(R.id.LogName);
        LogPassword = (EditText) findViewById(R.id.LogPassword);
        Log = (Button) findViewById(R.id.Log);
        register = (TextView) findViewById(R.id.register);


        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = LogName.getText().toString();
                String password = LogPassword.getText().toString();


                if (user.isEmpty() && password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Fields should not be Empty", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(MainActivity.this, "Loged In Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, HomeAvtivity.class);
                    startActivity(intent);
                }
            }

        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

}
