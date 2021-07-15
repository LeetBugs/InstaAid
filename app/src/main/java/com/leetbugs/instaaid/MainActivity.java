package com.leetbugs.instaaid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private RecyclerView mRecyclerView;
    private Toolbar mToolbar;
    private ImageSlider mSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();

        setImageSlider();


//        if (!Python.isStarted()) {
//            Python.start(new AndroidPlatform(MainActivity.this));
//        }
//
//        Python py = Python.getInstance();
//        final PyObject pyObject = py.getModule("main");
//
//
//
//
//        textView.setText(pyObject.callAttr("run").toString());
    }

    private void setImageSlider() {
        List<SlideModel> imageList = new ArrayList<SlideModel>();
        imageList.add(new SlideModel(R.drawable.slide_1, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_3, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_4, ScaleTypes.CENTER_CROP));
        mSlider.setImageList(imageList);
    }

    private void setViews() {
        textView = findViewById(R.id.text);
        mToolbar = findViewById(R.id.main_activity_toolbar);
        mSlider = findViewById(R.id.main_activity_image_slider);
    }
}