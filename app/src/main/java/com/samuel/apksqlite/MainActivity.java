package com.samuel.apksqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    TextView mSudahDaftar;
    Button mButtonLogin;
    TextView mTextViewRegister;
    DataBaseApp db;
    CheckBox mCheckBox;
    ViewGroup progressView;
    protected boolean isProgressShowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DataBaseApp(this);
        mTextUsername = findViewById(R.id.username);
        mTextPassword = findViewById(R.id.password);
        mButtonLogin = findViewById(R.id.loginBtn);
        mTextViewRegister = findViewById(R.id.register);
        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, MenuRegistrasi.class);
                startActivity(registerIntent);
            }
        });

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                Boolean res = db.CheckUser(user, pwd);

                if(res==true)
                {
                    Toast.makeText(MainActivity.this,"Berhasil Masuk", Toast.LENGTH_SHORT).show();
                    Intent contentIntent = new Intent(MainActivity.this, MenuAwal.class);
                    startActivity(contentIntent);;

                }

                else{
                    Toast.makeText(MainActivity.this,"Username atau Password Anda Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
