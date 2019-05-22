package com.example.talkin;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IdCheckDialog extends Dialog {

    Context context;

    String title;
    String text;


    TextView txtIdCheckTitle;



    public IdCheckDialog(Context context){
        super(context);
        this.context = context;
    }

    public IdCheckDialog(Context context, String title, String text){
        super(context);
        this.context = context;
        this.title = title;
        this.text = text;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_pw_x);

        txtIdCheckTitle = findViewById(R.id.tvId);


    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void cancel() {
        super.cancel();
    }




}
