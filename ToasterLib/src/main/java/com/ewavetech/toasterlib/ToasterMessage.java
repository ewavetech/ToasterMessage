package com.ewavetech.toasterlib;

public class ToasterMessage {

    public static void show(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}