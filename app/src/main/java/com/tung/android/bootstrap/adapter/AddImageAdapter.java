package com.tung.android.bootstrap.adapter;

/**
 * Created by tung1123 on 5/12/2014.
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tung.android.bootstrap.R;

public class AddImageAdapter extends BaseAdapter
{
    Context mycontext = null;
    int galitembg = 0;

    public int[] IMAGE_IDS = { R.drawable.a1, R.drawable.a2,
            R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a6,
            R.drawable.a7, R.drawable.a8,
            R.drawable.a9, R.drawable.a10};

    public AddImageAdapter(Context c)
    {
        mycontext = c;
        TypedArray typArray = mycontext.obtainStyledAttributes(R.styleable.GalleryTheme);
        galitembg = typArray.getResourceId(R.styleable.GalleryTheme_android_galleryItemBackground, 0);
        typArray.recycle();
    }

    @Override
    public int getCount()
    {
        return IMAGE_IDS.length;
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageview = new ImageView(mycontext);
        imageview.setImageResource(IMAGE_IDS[position]);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageview;
    }

}