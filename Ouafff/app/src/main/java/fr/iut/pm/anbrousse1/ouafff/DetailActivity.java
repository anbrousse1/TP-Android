package fr.iut.pm.anbrousse1.ouafff;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    private static final String INDEX = "INDEX";
    int index;
    ViewPager viewpager;
    PagerAdapter mpagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        index = getIntent().getIntExtra(INDEX,-1);
        FragmentManager fragmentManager  = getSupportFragmentManager();

        if(fragmentManager.findFragmentById(R.id.id_fragment) == null){
            fragmentManager.beginTransaction()
                    .add(R.id.id_fragment,FragmentDetail.newInstance(index))
                    .commit();
        }

        viewpager = (ViewPager)findViewById(R.id.viewpager);
        mpagerAdapter = new ScreenSlidePagerAdapter(fragmentManager);
        viewpager.setAdapter(mpagerAdapter);



    }

    public static Intent newInstance(Context context,int index){
        Intent i = new Intent(context,DetailActivity.class);
        i.putExtra(INDEX,index);
        return i;
    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return FragmentDetail.newInstance(position);
        }

        @Override
        public int getCount() {
            return MasterActivity.getChiens().size();
        }
    }





}
