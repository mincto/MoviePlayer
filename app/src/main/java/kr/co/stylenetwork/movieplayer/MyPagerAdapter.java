/*
* ListView 와 마찬가지고, ViewPager 껍데기일 뿐이다. 따라서
* 자체적으로 페이지에 대한 정보가 전혀 없다!!
* 따라서 총 몇페이지로 구성되어 있는지, 각 페이지에 보여줄 프레그먼트는
* 누구인지 등에 대한 정보를 전용 Adapter가 제공해준다
* 우리는 FragementStatePagerAdapter라는 클래스를 상속받아 , 재정의본다
*/
package kr.co.stylenetwork.movieplayer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter{
    /*
    * ViewPager라는 구글이 만든 위젯을 사용하지 않을 경우, 페이지 넘김 처리시
    * 트랜잭션 처리를 개발자가 부담해야 한다. commit 등..
    * 이때 트랜잭션 처리를 위한 객체가 바로 FramentManager이므로, ViewPager
    * 를 이용할 경우 더이상 개발자가 트랜잭션 처리에 대한 부담이 없게 된다.
    * 대신, 시스템이 알아서 트랜잭션을 처리하게 하려면, 적어도 FragmentManager
    * 를 전달해줘야 한다!
    * */
    Fragment[] pages = new Fragment[2];

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        pages[0] = new ListFragment();
        pages[1] = new DetailFragment();
    }

    /*  총 몇페이지를 보여줄지를 결정하는 메서드*/
    public int getCount() {
        return pages.length;
    }

    /* 각 페이지에 어떤 프레그먼트를 보여줄지를 결정하는 메서드*/
    public Fragment getItem(int position) {
        return pages[position];
    }


}
