package com.example.exampleapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        //this is a test comment for gitHub
    }


    public void btnSubmitOnClick(View view) {
        String name = edtName.getText().toString();
        String password = edtPassword.getText().toString();
        String msg  = "name : "+name + ", Passsword :" + password;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
}