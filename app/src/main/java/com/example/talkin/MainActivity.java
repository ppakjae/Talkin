package com.example.talkin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtId, edtPw;
    TextView txtId, txtPw, txtJoin, txtLogin;
    ImageButton imgbtnState;

    boolean check = false;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        btnListener();

        imgbtnState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check = !check;
                if(check)
                    imgbtnState.setImageResource(R.drawable.login_checked);
                else
                    imgbtnState.setImageResource(R.drawable.login_unchecked);
            }
        });

        handler = new Handler(

        );

    }

    private void btnListener() {
        txtLogin.setOnClickListener(txtListener);
        txtJoin.setOnClickListener(txtListener);
        txtPw.setOnClickListener(txtListener);
        txtId.setOnClickListener(txtListener);
    }

    private void initView() {
        edtId = (EditText)findViewById(R.id.edtId);
        edtPw = (EditText)findViewById(R.id.edtPw);

        txtId = (TextView)findViewById(R.id.txtId);
        txtPw = (TextView)findViewById(R.id.txtPw);
        txtJoin = (TextView)findViewById(R.id.txtJoin);
        txtLogin = (TextView)findViewById(R.id.txtLogin);

        imgbtnState = (ImageButton)findViewById(R.id.imgbtnKeep);

    }

    View.OnClickListener txtListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.txtId:
                    show();
                    break;
                case R.id.txtPw:
                    Intent intentPw = new Intent(MainActivity.this, FindPwActivity.class);
                    startActivity(intentPw);
                    break;
                case R.id.txtJoin:
                    Intent intent = new Intent(MainActivity.this, Join.class);
                    startActivity(intent);
                    break;
                case R.id.txtLogin:
                    break;
            }
        }
    };

    public void show(){
        Intent intent = new Intent(MainActivity.this, FindIdActivity.class);
        startActivity(intent);
    }


}
