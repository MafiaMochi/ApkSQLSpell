package com.samuel.apksqlite;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MenuRegistrasi extends AppCompatActivity {

    DataBaseApp db;
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextCnfPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registrasi);

        db = new DataBaseApp(this);
        mTextUsername = (EditText)findViewById(R.id.username);
        mTextPassword = (EditText)findViewById(R.id.password);
        mTextCnfPassword = (EditText)findViewById(R.id.confirm_password);
        mButtonRegister = (Button)findViewById(R.id.registerBtn);
        mTextViewLogin = (TextView) findViewById(R.id.register);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(MenuRegistrasi.this, MainActivity.class);
                startActivity(LoginIntent);
            }
        });

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                String cnf_pwd = mTextCnfPassword.getText().toString().trim();

                if (pwd.equals(cnf_pwd)){
                    long val = db.addUser(user,pwd);
                    if (val > 0){
                        Toast.makeText(MenuRegistrasi.this,"Berhasil Mendaftar", Toast.LENGTH_SHORT).show();
                        Intent moveToLogin = new Intent(MenuRegistrasi.this, MainActivity.class);
                        startActivity(moveToLogin);
                    }

                }
                else
                {
                    Toast.makeText(MenuRegistrasi.this,"Pasword Anda Salah", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
