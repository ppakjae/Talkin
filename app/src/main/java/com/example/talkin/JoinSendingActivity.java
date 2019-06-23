package com.example.talkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JoinSendingActivity extends AppCompatActivity {

    ImageView imgback_sending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_sending);

        imgback_sending = (ImageView) findViewById(R.id.imgback_sending);

        imgback_sending.setOnClickListener(Click);
    }

    View.OnClickListener Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imgback_sending:
                    Intent intentback = new Intent(JoinSendingActivity.this, MainpageActivity.class);
                    startActivity(intentback);
                    break;
            }
        }
    };
}
