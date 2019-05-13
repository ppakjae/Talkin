package com.example.talkin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class FindpwActivity extends AppCompatActivity {

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


    }
}
