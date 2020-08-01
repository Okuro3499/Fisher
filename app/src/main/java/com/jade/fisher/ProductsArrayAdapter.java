package com.jade.fisher;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class ProductsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mFishes;
    private String[] mAges;

    public ProductsArrayAdapter(Context mContext, int resource, String[] mFishes, String[] mAges) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mFishes = mFishes;
        this.mAges = mAges;
    }

    @Override
    public Object getItem(int position) {
        String fish = mFishes[position];
        String age = mAges[position];
        return String.format("%s \nIs at life cycle stage: %s", fish, age);
    }

    @Override
    public int getCount() {
        return mFishes.length;
    }
}
