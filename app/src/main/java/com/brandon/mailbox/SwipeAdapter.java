package com.brandon.mailbox;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Brandon on 6/20/16.
 */
public class SwipeAdapter extends FragmentStatePagerAdapter {

    public SwipeAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        if(position == 0){
            fragment = new ContactFragment();
        }
        else if(position == 1){
            fragment = new ChatListFragment();
        }
        else{
            fragment = new ProfileFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
