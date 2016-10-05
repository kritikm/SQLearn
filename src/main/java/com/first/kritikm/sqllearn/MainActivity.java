package com.first.kritikm.sqllearn;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showRegister(View view)
    {
        final Dialog register = new Dialog(this);
        register.setContentView(R.layout.register_layout);
        register.setCancelable(false);
        register.show();
    }
}
