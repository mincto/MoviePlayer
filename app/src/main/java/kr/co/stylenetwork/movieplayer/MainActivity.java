/*
*
* ViewPager 는 트랜잭션 관련한 이벤트가 지원된다!!
* */
package kr.co.stylenetwork.movieplayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{
    /*
    * ViewPager 와 FragmentStatePagerAdapter와의 연결
   * */
    MyViewPager viewPager;
    MyPagerAdapter adapter;
    Button bt_config, bt_list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(MyViewPager)findViewById(R.id.viewPager);
        bt_config=(Button)findViewById(R.id.bt_config);
        bt_list=(Button)findViewById(R.id.bt_list);

        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(this);

        bt_list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*목록보기 버튼 누르면, 0번째 페이지로 전환*/
                gotoPage(0);
            }
        });
    }

    public void gotoPage(int position){
        viewPager.setCurrentItem(position);
    }

    public void onPageScrolled(int i, float v, int i1) {
    }

    /* 페이지 전환이 완료되는 시점에 호출!!*/
    public void onPageSelected(int currentPage) {
        /*동영상 재생!! DetailFragment 보유한 메서드 호출!!*/
        if(currentPage ==1) {
            DetailFragment detailFragment = (DetailFragment) adapter.getItem(1);
            detailFragment.playMovie();
        }
        bt_list.setEnabled(false);
    }
    public void onPageScrollStateChanged(int i) {

    }
}

