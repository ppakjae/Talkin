package com.example.talkin;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainpageActivity extends AppCompatActivity {

    ImageView imgback_nav;
    ImageView imgmenu_mainpage;

    TextView tvlogout_nav;
    TextView tvreceive_nav;
    TextView tvsend_nav;

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        imgback_nav = (ImageView) findViewById(R.id.imgback_nav);
        imgmenu_mainpage = (ImageView) findViewById(R.id.imgmenu_mainpage);

        tvlogout_nav = (TextView) findViewById(R.id.tvlogout_nav);
        tvreceive_nav = (TextView) findViewById(R.id.tvreceive_nav);
        tvsend_nav = (TextView) findViewById(R.id.tvsend_nav);

        drawer = (DrawerLayout) findViewById(R.id.drawer);

        imgback_nav.setOnClickListener(Click);
        imgmenu_mainpage.setOnClickListener(Click);
        tvlogout_nav.setOnClickListener(Click);
        tvreceive_nav.setOnClickListener(Click);
        tvsend_nav.setOnClickListener(Click);
    }

    public void dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_logout, null);
        builder.setView(view);

        Button btnYes = (Button) view.findViewById(R.id.btnYes);
        Button btnNo = (Button) view.findViewById(R.id.btnNo);

        final AlertDialog dialog = builder.create();

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }

    View.OnClickListener Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imgmenu_mainpage:
                    drawer.openDrawer(Gravity.RIGHT);
                    break;

                case R.id.imgback_nav:
                    drawer.closeDrawer(Gravity.RIGHT);
                    break;

                case R.id.tvlogout_nav:
                    dialog();
                    break;

                case R.id.tvreceive_nav:
                    Intent intentmailbox = new Intent(MainpageActivity.this, JoinMailboxActivity.class);
                    startActivity(intentmailbox);
                    break;

                case R.id.tvsend_nav:
                    Intent intentsending = new Intent(MainpageActivity.this, JoinSendingActivity.class);
                    startActivity(intentsending);
                    break;
            }
        }
    };
}
