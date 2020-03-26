package com.app.viewpagerwithcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPagerProducts = findViewById(R.id.viewPagerProducts);

        List<Model> models = new ArrayList<>();
        models.add(new Model("Woman To Woman Naturals", "Shampoo", 12.67, R.drawable.ic_launcher_background));
        models.add(new Model("Woman To Woman Naturals", "Shampoo", 12.67, R.drawable.ic_launcher_background));
        models.add(new Model("Woman To Woman Naturals", "Shampoo", 12.67, R.drawable.ic_launcher_background));
        models.add(new Model("Woman To Woman Naturals", "Shampoo", 12.67, R.drawable.ic_launcher_background));
        models.add(new Model("Woman To Woman Naturals", "Shampoo", 12.67, R.drawable.ic_launcher_background));

        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(this, models);
        viewPagerProducts.setAdapter(customPagerAdapter);

    }
}
