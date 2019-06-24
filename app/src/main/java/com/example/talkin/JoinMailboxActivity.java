package com.example.talkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

public class JoinMailboxActivity extends AppCompatActivity {

    ImageView imgback_mailbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_mailbox);

        imgback_mailbox = (ImageView) findViewById(R.id.imgback_mailbox);

        imgback_mailbox.setOnClickListener(Click);
    }

    View.OnClickListener Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imgback_mailbox:
                    Intent intentback = new Intent(JoinMailboxActivity.this, MainpageActivity.class);
                    startActivity(intentback);
                    break;
            }
        }
    };
}
