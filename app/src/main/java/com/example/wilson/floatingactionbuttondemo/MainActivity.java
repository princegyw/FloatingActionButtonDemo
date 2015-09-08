package com.example.wilson.floatingactionbuttondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab1);

    }

    public void onClickHandler(View view) {
        switch (view.getId()) {
            case R.id.fab1:
                Log.d("gyw", "MainActivity::onClickHandler FloatingActionButton pressed");
                break;
        }
    }

}
