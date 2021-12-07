package com.example.jathusanuthayakumaran.j2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class FrontScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(FrontScreenActivity.this, MapActivity.class);
        startActivity(intent);
        finish();
    }
}
