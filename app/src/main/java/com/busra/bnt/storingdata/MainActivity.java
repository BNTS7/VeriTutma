package com.busra.bnt.storingdata;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        //SharedPreferences ile veri tutma
        //string name olarak istedigi packet adı,int mode oluyor

        SharedPreferences sharedPreferences = this.getSharedPreferences ( "com.busra.bnt.storingdata",Context.MODE_PRIVATE );
        int age = 40;

        //kullanıcıdan alınan yası kaydediyoruz.hafızaya kaydedildi
        //sharedPreferences.edit ().putInt ( "userAge",age).apply ();
        //kaydedilen yası test ediyoruz.cagirdik
        
        int saved = sharedPreferences.getInt ("userAge" ,0 );
        System.out.println ("saved value" + saved );

        age = 10;
        sharedPreferences.edit ().putInt ( "userAge",age ).apply ();
        int savedAge = sharedPreferences.getInt ("userAge" ,0 );
        System.out.println ("Age"+ savedAge );

        sharedPreferences.edit ().remove ( "userAge" ).apply ();
        int savedAge2 = sharedPreferences.getInt ( "userAge", 0 );
        System.out.println ("saved value:"+ savedAge2 );
    }
}
