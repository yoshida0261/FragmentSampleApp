package com.starcompany.fragmentsampleapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

/**
 * Created by takeshi on 16/11/28.
 */
public class TitlesFragment extends ListFragment {

    public TitlesFragment(){}

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                News.Titles
        ));
    }

}
