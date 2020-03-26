package com.app.viewpagerwithcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class CustomPagerAdapter extends PagerAdapter {

    private Context context;
    private List<Model> models;

    public CustomPagerAdapter(Context context, List<Model> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ViewGroup view = (ViewGroup) layoutInflater.inflate(R.layout.viewpager_item, container, false);

        final TextView appName, productName, price;
        final ImageView productImage;

        appName = view.findViewById(R.id.appName);
        productName = view.findViewById(R.id.productName);
        price = view.findViewById(R.id.price);
        productImage = view.findViewById(R.id.productImage);

        appName.setText(models.get(position).getProductName());
        productImage.setImageResource(models.get(position).getProductImage());
        price.setText(String.valueOf(models.get(position).getPrice()));
        productName.setText(models.get(position).getProductName());

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


}
