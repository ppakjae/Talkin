package com.example.talkin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FindPwActivity extends AppCompatActivity {

    Button btnIdCheck;
    Button btnMailCheck;
    Button btnMailRecognize;

    EditText edtName;
    EditText edtId;
    EditText edtMail;
    EditText edtRecognize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIdCheck = (Button) findViewById(R.id.btnIdCheck);
        btnMailCheck = (Button) findViewById(R.id.btnMailCheck);
        btnMailRecognize = (Button) findViewById(R.id.btnMailRecognize);

        edtName = (EditText) findViewById(R.id.edtName);
        edtId = (EditText) findViewById(R.id.edtId);
        edtMail = (EditText) findViewById(R.id.edtMail);
        edtRecognize = (EditText) findViewById(R.id.edtRecognize);

        btnIdCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IdCheckDialog idCheckDialog = new IdCheckDialog(FindPwActivity.this);
                idCheckDialog.show();
            }
        });

        btnMailCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EmailVerifyDialog emailVerifyDialog = new EmailVerifyDialog(FindPwActivity.this);
                emailVerifyDialog.show();
            }
        });


        btnMailRecognize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(true) {
//                    EmailVerifyDialog emailVerifyDialog = new EmailVerifyDialog(FindIdActivity.this, "인증 실패" ,"인증번호를 다시 확인해주세요." );
//                    emailVerifyDialog.setImgMail();
//                    emailVerifyDialog.show();
//                }
//                else{
                EmailVerifyDialog emailVerifyDialog = new EmailVerifyDialog(FindPwActivity.this, "인증 완료" ,"이메일 인증이 완료되었습니다." );
                emailVerifyDialog.show();

//                }
            }
        });

    }
}
