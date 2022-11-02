package com.ewavetech.toasterlib;
import android.widget.Toast;
import android.content.Context;

public class ToasterMessage {

    public static void show(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_LONG).show();
    }
}