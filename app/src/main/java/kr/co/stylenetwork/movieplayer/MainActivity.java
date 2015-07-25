package kr.co.stylenetwork.movieplayer;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity{
    /*
    * ViewPager 와 FragmentStatePagerAdapter와의 연결
   * */
    ViewPager viewPager;
    MyPagerAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    public void gotoPage(int position){
        viewPager.setCurrentItem(position);
    }
}

