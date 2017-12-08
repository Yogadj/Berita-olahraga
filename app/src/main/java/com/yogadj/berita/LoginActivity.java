package com.yogadj.berita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private ImageView iv_logo;
    private EditText et_username;
    private EditText et_password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Form Login");


        iv_logo = (ImageView) findViewById(R.id.iv_logo);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = et_username.getText().toString();
                String pass = et_password.getText().toString();

                if (!user.isEmpty() && !pass.isEmpty() )
                {
                    if (pass.equals("123"))
                    {
                        Toast.makeText(LoginActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                        iv_logo.setImageDrawable(getResources().getDrawable(R.drawable.fox));
                        Intent intent = new Intent(LoginActivity.this,ListKategori.class);
                        intent.putExtra("username", user);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, "Password Anda salah", Toast.LENGTH_SHORT).show();
                    }

                } else
                {
                    Toast.makeText(LoginActivity.this, "Data anda belum Lengkap", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
