package com.example.talkin;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtId, edtPw;
    TextView txtId, txtPw, txtJoin, txtLogin;
    ImageView imgState;

    boolean check = false;

    String _id="", _pw="";

    Monitor monitor = new Monitor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        btnListener();
        edtListener();

        imgState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check = !check;
                if(check)
                    imgState.setImageResource(R.drawable.login_checked);
                else
                    imgState.setImageResource(R.drawable.login_unchecked);
            }
        });

    }

    private void btnListener() {
        txtLogin.setOnClickListener(txtListener);
        txtJoin.setOnClickListener(txtListener);
        txtPw.setOnClickListener(txtListener);
        txtId.setOnClickListener(txtListener);
    }

    private void edtListener()
    {
        edtId.setOnClickListener(editListener);
        edtPw.setOnClickListener(editListener);
    }

    private void initView() {
        edtId = (EditText)findViewById(R.id.edtId);
        edtPw = (EditText)findViewById(R.id.edtPw);
        edtPw.addTextChangedListener(monitor);

        txtId = (TextView)findViewById(R.id.txtId);
        txtPw = (TextView)findViewById(R.id.txtPw);
        txtJoin = (TextView)findViewById(R.id.txtJoin);
        txtLogin = (TextView)findViewById(R.id.txtLogin);

        imgState = (ImageView)findViewById(R.id.imgKeep);
    }


    View.OnClickListener txtListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.txtId:
                    Intent intentId = new Intent(MainActivity.this, FindIdActivity.class);
                    startActivity(intentId);
                    onResume();
                    break;
                case R.id.txtPw:
                    Intent intentPw = new Intent(MainActivity.this, FindPwActivity.class);
                    startActivity(intentPw);
                    break;
                case R.id.txtJoin:
                    Intent intentJoin = new Intent(MainActivity.this, JoinActivity.class);
                    startActivity(intentJoin);
                    break;
                case R.id.txtLogin:
                    Intent intentMainpage = new Intent(MainActivity.this, MainpageActivity.class);
                    startActivity(intentMainpage);
                    break;
            }
        }
    };

    View.OnClickListener editListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.edtId:
                    break;
                case R.id.edtPw:
                    break;
            }
        }
    };

    class Monitor implements TextWatcher
    {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            _id = edtId.getText().toString();
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            _id = edtId.getText().toString();
            if(s.length() >=4)
            {
                txtLogin.setBackgroundResource(R.drawable.round_solid_yellow_background);
            } else {
                txtLogin.setBackgroundResource(R.drawable.round_solid_gray_background);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }


}
