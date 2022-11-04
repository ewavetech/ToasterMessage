package com.ewavetech.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ewavetech.toasterlib.ToasterMessage;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_view);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.ewavetech.toaster", "com.ewavetech.toasterlib.ToastLibActivity");
                startActivity(intent);
            }
        });
        //ToasterMessage.show(this, "Calling from Github Library");
    }
}