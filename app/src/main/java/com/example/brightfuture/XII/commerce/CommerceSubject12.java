package com.example.brightfuture.XII.commerce;

import android.os.Bundle;
import android.widget.Toast;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;

public class CommerceSubject12 extends BaseActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setChildLayout(R.layout.activity_commerece_subject12);

        Toast.makeText(this, "Commerce 12", Toast.LENGTH_SHORT).show();
    }
}
