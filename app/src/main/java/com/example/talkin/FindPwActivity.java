package com.example.talkin;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class FindPwActivity extends AppCompatActivity {

    Button btnIdCheck;
    Button btnMailCheck;
    Button btnMailRecognize;

    EditText edtName;
    EditText edtId;
    EditText edtMail;
    EditText edtRecognize;

    ImageView imgName;
    ImageView imgId;
    ImageView imgMail;
    ImageView imgMailCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_pw);

        btnIdCheck = (Button) findViewById(R.id.btnIdCheck);
        btnMailCheck = (Button) findViewById(R.id.btnMailCheck);
        btnMailRecognize = (Button) findViewById(R.id.btnMailRecognize);

        edtName = (EditText) findViewById(R.id.edtName);
        edtId = (EditText) findViewById(R.id.edtId);
        edtMail = (EditText) findViewById(R.id.edtMail);
        edtRecognize = (EditText) findViewById(R.id.edtRecognize);

        imgName = (ImageView) findViewById(R.id.imgName);
        imgId = (ImageView) findViewById(R.id.imgId);
        imgMail = (ImageView) findViewById(R.id.imgMail);
        imgMailCheck = (ImageView) findViewById(R.id.imgMailCheck);



        edtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String name = edtName.getText().toString();
                if (name.length() != 0) {
                    imgName.setImageResource(R.drawable.name_y);
                }
                else {
                    imgName.setImageResource(R.drawable.name_g);
                }
            }
        });

        edtId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String id = edtId.getText().toString();
                if (id.length() >= 6 && id.length() <= 14) {
                    imgId.setImageResource(R.drawable.id_y);
                }
                else {
                    imgId.setImageResource(R.drawable.id_g);
                }
            }
        });

        edtMail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String email = edtMail.getText().toString();
                if (email.contains(".com") && email.contains("@")) {
                    imgMail.setImageResource(R.drawable.mail_y);
                }
                else {
                    imgMail.setImageResource(R.drawable.mail_g);
                }
            }
        });

        edtRecognize.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String recognize = edtRecognize.getText().toString();
                if (recognize.length() == 6) {
                    imgMailCheck.setImageResource(R.drawable.mail_check_y);
                }
                else {
                    imgMailCheck.setImageResource(R.drawable.mail_check_g);

                }
            }
        });


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
