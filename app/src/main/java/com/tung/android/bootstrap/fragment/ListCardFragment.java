package com.tung.android.bootstrap.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tung.android.bootstrap.R;
import com.tung.android.bootstrap.adapter.PlaceSlidesFragmentAdapter;
import com.tung.android.bootstrap.adapter.AddImageAdapter;
import com.tung.android.bootstrap.util.ExtendedGallery;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.InjectView;
import butterknife.Views;

/**
 * Created by tung1123 on 5/1/2014.
 */
public class ListCardFragment extends Fragment {

    PlaceSlidesFragmentAdapter mAdapter;
   // TestFragmentAdapter mAdapter;
    TextView page_text[];
    int count = 0;
   /* @InjectView(R.id.indicatorImage)
    protected CirclePageIndicator indicator;

    @InjectView(R.id.pagerimage)
    protected ViewPager pager;*/

    @InjectView(R.id.mygallery01)
    protected ExtendedGallery mGallery;

    @InjectView(R.id.image_count)
    protected LinearLayout count_layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_card, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Views.inject(this, getView());
     /*   mAdapter = new PlaceSlidesFragmentAdapter(getActivity().getSupportFragmentManager());
        pager.setAdapter(mAdapter);
        indicator.setViewPager(pager);
        pager.setCurrentItem(1);
*/
        mGallery.setAdapter(new AddImageAdapter(getActivity().getApplicationContext()));
        mGallery.setScrollingEnabled(true);

        count = mGallery.getAdapter().getCount();

        page_text = new TextView[count];
        for (int i = 0; i < count; i++)
        {
            page_text[i] = new TextView(getActivity().getApplicationContext());
            page_text[i].setText(".");
            page_text[i].setTextSize(45);
            page_text[i].setTypeface(null, Typeface.BOLD);
            page_text[i].setTextColor(android.graphics.Color.GRAY);
            count_layout.addView(page_text[i]);
        }
        mGallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                // TODO Auto-generated method stub
                for (int i = 0; i < count; i++) {
                    page_text[i]
                            .setTextColor(android.graphics.Color.GRAY);
                }
                page_text[pos]
                        .setTextColor(android.graphics.Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

    }

}