package com.sjsm.bottommenudemo;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

/**
 * Created by Administrator on 2016/10/10 0010.
 */

public class PersonFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view=inflater.inflate(R.layout.fragment_person, container, false);
        return view;
    }
}
