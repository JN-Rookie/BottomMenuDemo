package com.sjsm.bottommenudemo;


import android.app.Dialog;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

/**
 * Created by Administrator on 2016/10/10 0010.
 */

public class ApplicationFragment extends Fragment {

    public static ApplicationFragment newInstance(int param1) {
        ApplicationFragment fragment = new ApplicationFragment();
        Bundle args = new Bundle();
        param1++;
        args.putInt("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_application, container, false);
        Bundle bundle = getArguments();
        int agrs1 = bundle.getInt("agrs1");
        String a= String.valueOf(agrs1);
        TextView textView= (TextView) view.findViewById(R.id.zadi);
        textView.setText(a);
        return view;
    }


}
