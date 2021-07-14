package com.leetbugs.instaaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);

        if (!Python.isStarted()) {
            Python.start(new AndroidPlatform(MainActivity.this));
        }

        Python py = Python.getInstance();
        final PyObject pyObject = py.getModule("main");

        textView.setText(pyObject.callAttr("run").toString());
    }
}