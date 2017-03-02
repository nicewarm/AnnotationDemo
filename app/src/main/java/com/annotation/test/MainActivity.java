package com.annotation.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nice.annotation.Router;
import com.nice.api.ViewInjector;

public class MainActivity extends AppCompatActivity {


    @Router(R.id.test)
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjector.injectView(this);
        test.setText("nicewarm");

    }
}
