package com.example.talkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FindIdFinalActivity extends AppCompatActivity {

    ImageView imgBack;

    Button btnLogin;
    Button btnFindPw;

    TextView txtFindIdFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id_final);

        imgBack = (ImageView) findViewById(R.id.imgBack);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnFindPw = (Button) findViewById(R.id.btnFindPw);
        txtFindIdFinal = (TextView) findViewById(R.id.txtFindIdFinal);

        imgBack.setOnClickListener(Click);
        btnLogin.setOnClickListener(Click);
        btnFindPw.setOnClickListener(Click);


//        setText(FindIdActivity.getName());

    }

    public void setText(String name){
        txtFindIdFinal.setText("반갑습니다. " + name + "님, 아이디는 다음과 같습니다.");
    }

    View.OnClickListener Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imgBack:
                    Intent intent1 = new Intent(FindIdFinalActivity.this, FindIdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.btnLogin:
                    Intent intent2 = new Intent(FindIdFinalActivity.this, MainActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.btnFindPw:
                    Intent intent3 = new Intent(FindIdFinalActivity.this, FindPwActivity.class);
                    startActivity(intent3);
                    break;
            }
        }
    };


}
