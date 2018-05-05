package com.example.riki.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        switch (view.getId()){
            case R.id.OpenWeb:
                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i1);
                break;
            case R.id.opencall:
                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9867503510"));
                startActivity(i2);
                break;
            case R.id.openmap:
                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.5937,78.9629"));
                startActivity(i3);
                break;

        }
    }
}
