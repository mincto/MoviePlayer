/*
* 유저가 스와이핑을 못하게 막으려면, ViewPager  클래스를 상속받아
* 스와이핑시 발생하는 이벤트를 낚아채어, 페이지 넘김을 방지해야 한다!
* */
package kr.co.stylenetwork.movieplayer;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyViewPager extends ViewPager {
    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}








