package com.sjsm.bottommenudemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar               mNavigationBar;
    private ApplicationFragment               mApplicationFragment;
    private PersonFragment                    mPersonFrament;
    private android.support.v7.widget.Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        mNavigationBar.setInActiveColor(R.color.white)
                .setActiveColor(R.color.green)
                .setBarBackgroundColor(R.color.colorPrimary);
        mNavigationBar.addItem(new BottomNavigationItem(R.mipmap.application, "我的应用"))
                .addItem(new BottomNavigationItem(R.mipmap.person, "个人信息"))
                .initialise();
        mNavigationBar.setTabSelectedListener(this);
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();

        mApplicationFragment = ApplicationFragment.newInstance(1);
        transaction.replace(R.id.frame_content, mApplicationFragment);
        transaction.commit();
    }

    @Override
    public void onTabSelected(int position) {
        FragmentManager fm = this.getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (position) {
            case 0:
                if (mApplicationFragment == null) {
                    mApplicationFragment = new ApplicationFragment();
                }
                mToolbar.setTitle("我的应用");
                transaction.replace(R.id.frame_content, mApplicationFragment);
                break;
            case 1:
                if (mPersonFrament == null) {
                    mPersonFrament = new PersonFragment();
                }
                mToolbar.setTitle("个人中心");
                transaction.replace(R.id.frame_content, mPersonFrament);
                break;
        }
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
