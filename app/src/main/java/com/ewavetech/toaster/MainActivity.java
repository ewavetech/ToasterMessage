package com.ewavetech.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.ewavetech.toasterlib.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.show(this, "Show Message from library");
    }
}