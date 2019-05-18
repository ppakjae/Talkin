package com.example.talkin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class FindIdActivity extends AppCompatActivity {

    Button btnTransfer;
    Button btnVerify;

    EditText edtName;
    EditText edtEmail;
    EditText edtEmailCheck;

    ImageView imgBack;

    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);

        btnTransfer = (Button) findViewById(R.id.btnTransfer);
        btnVerify = (Button) findViewById(R.id.btnVerify);

        edtName = (EditText) findViewById(R.id.edtName);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtEmailCheck = (EditText) findViewById(R.id.edtEmailCheck);

        imgBack = (ImageView) findViewById(R.id.imgBack);

        edtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edtEmailCheck.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnTransfer.setOnClickListener(Click);
        btnVerify.setOnClickListener(Click);
        imgBack.setOnClickListener(Click);

    }

    View.OnClickListener Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imgBack:
                    Intent intent1 = new Intent(FindIdActivity.this, MainActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.btnTransfer:
                    count = 1;
                    dialog();
                    break;

                case R.id.btnVerify:
                    if (edtEmailCheck.getText().length() == 6) {
                        count = 2;
                    } else {
                        count = 3;
                    }
                    dialog();
                    break;
            }
        }
    };

    public void dialog() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(FindIdActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.email_verify_dialog, null);
        builder1.setView(view);

        ImageView imgEmail = (ImageView) view.findViewById(R.id.imgEmail);
        TextView txtEmailVerifyTitle = (TextView) view.findViewById(R.id.txtEmailVerifyTitle);
        TextView txtEmailVerifyText = (TextView) view.findViewById(R.id.txtEmailVerifyText);
        Button btnEmailVerifyDialog = (Button) view.findViewById(R.id.btnEmailVerifyDialog);

        if (count == 1) {
            imgEmail.setImageResource(R.drawable.mail_y);
            txtEmailVerifyTitle.setText("이메일 인증");
            txtEmailVerifyText.setText("인증번호가 전송되었습니다.");
        }
        else if (count == 2) {
            imgEmail.setImageResource(R.drawable.mail_check_y);
            txtEmailVerifyTitle.setText("인증 완료");
            txtEmailVerifyText.setText("이메일 인증이 완료되었습니다.");
        }
        else if (count == 3){
            imgEmail.setImageResource(R.drawable.mail_check_g);
            txtEmailVerifyTitle.setText("인증 실패");
            txtEmailVerifyText.setText("인증번호를 다시 확인해주세요.");
        }

        final AlertDialog dialog = builder1.create();

        btnEmailVerifyDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if(count == 2) {
                    Intent intent2 = new Intent(FindIdActivity.this, FindIdFinalActivity.class);
                    startActivity(intent2);
                }
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }

    public String getName(){
        return edtName.getText().toString();
    }



}
