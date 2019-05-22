package com.example.talkin;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EmailVerifyDialog extends Dialog {

    Context context;

    String title;
    String text;

    ImageView imgMail;

    TextView txtEmailVerifyTitle;
    TextView txtEmailVerifyText;

    boolean ch = false;


    public EmailVerifyDialog(Context context){
        super(context);
        this.context = context;
    }

    public EmailVerifyDialog(Context context, String title, String text){
        super(context);
        this.context = context;
        this.title = title;
        this.text = text;

        ch = true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_verify_dialog);

        Button btnEmailVerifyDialog;

        txtEmailVerifyTitle = findViewById(R.id.txtEmailVerifyTitle);
        txtEmailVerifyText = findViewById(R.id.txtEmailVerifyText);

        if(ch) {
            txtEmailVerifyTitle.setText(title);
            txtEmailVerifyText.setText(text);
        }
        btnEmailVerifyDialog = findViewById(R.id.btnEmailVerifyDialog);

        imgMail = findViewById(R.id.imgMail);

        btnEmailVerifyDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
//                if(ch){
//                    showing();
//                }
            }
        });

    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void cancel() {
        super.cancel();
    }

    public void setImgMail(){
        imgMail.setImageResource(R.drawable.mail_g);
    }


//    public void showing() {
//        Intent intent = new Intent(FindIdActivity., FindIdFinalActivity.class);
//        startActivity(intent);
//    }


}
