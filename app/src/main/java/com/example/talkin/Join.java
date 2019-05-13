package com.example.talkin;

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

public class Join extends AppCompatActivity {

    Button btnEnroll;
    Button btnTransfer;
    Button btnVerify;

    EditText edtName;
    EditText edtId;
    EditText edtPw;
    EditText edtCheck;
    EditText edtEmail;
    EditText edtEmailCheck;

    ImageView imgName;
    ImageView imgId;
    ImageView imgPw;
    ImageView imgCheck;
    ImageView imgUncheck;
    ImageView imgEmail;
    ImageView imgEmailCheck;
    ImageView imgBack;

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        btnEnroll = (Button) findViewById(R.id.btnEnroll);
        btnTransfer = (Button) findViewById(R.id.btnTransfer);
        btnVerify = (Button) findViewById(R.id.btnVerify);

        edtName = (EditText) findViewById(R.id.edtName);
        edtId = (EditText) findViewById(R.id.edtId);
        edtPw = (EditText) findViewById(R.id.edtPw);
        edtCheck = (EditText) findViewById(R.id.edtCheck);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtEmailCheck = (EditText) findViewById(R.id.edtEmailCheck);

        imgName = (ImageView) findViewById(R.id.imgName);
        imgId = (ImageView) findViewById(R.id.imgId);
        imgPw = (ImageView) findViewById(R.id.imgPw);
        imgCheck = (ImageView) findViewById(R.id.imgCheck);
        imgUncheck = (ImageView) findViewById(R.id.imgUncheck);
        imgEmail = (ImageView) findViewById(R.id.imgEmail);
        imgEmailCheck = (ImageView) findViewById(R.id.imgEmailCheck);
        imgBack = (ImageView) findViewById(R.id.imgBack);

        //이름
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
        //아이디
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
        //비밀번호
        edtPw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String pw = edtPw.getText().toString();
                if (pw.length() >= 6 && pw.length() <= 14) {
                    imgPw.setImageResource(R.drawable.pw_y);
                }
                else {
                    imgPw.setImageResource(R.drawable.pw_g);
                }
            }
        });
        //비밀번호 확인
        edtCheck.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String check = edtCheck.getText().toString();
                if (check.equals(edtPw.getText().toString())) {
                    if (check.length() >= 6 && check.length() <= 14) {
                        imgCheck.setImageResource(R.drawable.pw_check_y);
                        imgUncheck.setImageResource(R.drawable.pw_checked);
                    }
                }
                else {
                    imgCheck.setImageResource(R.drawable.pw_check_g);
                    imgUncheck.setImageResource(R.drawable.pw_unchecked);
                }
            }
        });
        //이메일
        edtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String email = edtEmail.getText().toString();
                if (email.contains(".com") && email.contains("@")) {
                    imgEmail.setImageResource(R.drawable.mail_y);
                }
                else {
                    imgEmail.setImageResource(R.drawable.mail_g);
                }
            }
        });
        //이메일 인증번호 입력
        edtEmailCheck.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String emailcheck = edtEmailCheck.getText().toString();
                if (emailcheck.length() == 6) {
                    imgEmailCheck.setImageResource(R.drawable.mail_check_y);
                }
                else {
                    imgEmailCheck.setImageResource(R.drawable.mail_check_g);

                }
            }
        });

        btnEnroll.setOnClickListener(Click);
        btnTransfer.setOnClickListener(Click);
        btnVerify.setOnClickListener(Click);
        imgBack.setOnClickListener(Click);
    }

    View.OnClickListener Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imgBack:
                    Intent intent1 = new Intent(Join.this, MainActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.btnEnroll:
                    Intent intent2 = new Intent(Join.this, JoinFinal.class);
                    startActivity(intent2);
                    break;

                case R.id.btnTransfer:
                    count = 1;
                    dialog();
                    break;

                case R.id.btnVerify:
                    if (edtEmailCheck.getText().length() == 6) {
                        count = 2;
                    }
                    else {
                        count = 3;
                    }
                    dialog();
                    break;
            }
        }
    };

    public void dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        builder.setView(view);

        ImageView imgMessage = (ImageView) view.findViewById(R.id.imgMessage);
        TextView txtMessage_main = (TextView) view.findViewById(R.id.txtMessage_main);
        TextView txtMessage_sub = (TextView) view.findViewById(R.id.txtMessage_sub);
        Button btnMessage = (Button) view.findViewById(R.id.btnMessage);

        if (count == 1) {
            imgMessage.setImageResource(R.drawable.mail_y);
            txtMessage_main.setText("이메일 인증");
            txtMessage_sub.setText("인증번호가 전송되었습니다.");
        }
        else if (count == 2) {
            imgMessage.setImageResource(R.drawable.mail_check_y);
            txtMessage_main.setText("인증 완료");
            txtMessage_sub.setText("이메일 인증이 완료되었습니다.");
        }
        else if (count == 3){
            imgMessage.setImageResource(R.drawable.mail_check_g);
            txtMessage_main.setText("인증 실패");
            txtMessage_sub.setText("인증번호를 다시 확인해주세요.");
        }

        final AlertDialog dialog = builder.create();

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }
}
