package com.example.talkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindIdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);

        Button btnTransfer = findViewById(R.id.btnTransfer);
        Button btnVerify = findViewById(R.id.btnVerify);


        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmailVerifyDialog emailVerifyDialog = new EmailVerifyDialog(FindIdActivity.this);
                emailVerifyDialog.show();
            }
        });

        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(true) {
//                    EmailVerifyDialog emailVerifyDialog = new EmailVerifyDialog(FindIdActivity.this, "인증 실패" ,"인증번호를 다시 확인해주세요." );
//                    emailVerifyDialog.setImgMail();
//                    emailVerifyDialog.show();
//                }
//                else{
                    EmailVerifyDialog emailVerifyDialog = new EmailVerifyDialog(FindIdActivity.this, "인증 완료" ,"이메일 인증이 완료되었습니다." );
                    emailVerifyDialog.show();

//                }
            }
        });


    }



}
