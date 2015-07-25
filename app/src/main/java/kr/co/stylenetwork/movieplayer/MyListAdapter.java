/*
* ListView 는 껍데기일 뿐이므로, 자체적으로 어떤 데이터를 보여줄지
* 그리고 데이터의 수량은 몇개 인지 등에 대한 정보가 전혀 없다.
* 따라서 이 ListView가 이러한 정보를 제공받기 위해서는 Adapter가 지원되는데
* (이런 뷰들을 AdapterView라 한다..)
* ListView 보여줄 데이터가 단순히 TextView 하나일 경우는, ArrayAdapter를
* 이용하면 되지만, 개발자가 정의한 복합 위젯일 경우 즉 커스터마이징 뷰일 경우는
* 상당히 복잡하고, 그 디자인을 구글에서 예측할수 없기 때문에 더이상 미리 제공되는
* 어댑터는 없다.. 따라서 개발자가 Adapter 클래스를 상속받아 알맞게 재정의하면 된다
* */
package kr.co.stylenetwork.movieplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {
    Context context;/*인플레이터 객체를 메모리에 올리기 위해서는 Activity가 필요
    하므로..*/
    LayoutInflater inflater;
    ArrayList<Movie> list = new ArrayList<Movie>();

    /* 아직 웹서버와의 연동을 시도하지 않았으므로, 가상으로 데이터를
    * 생성하여 ListView의 모습을 보자!!*/
    public MyListAdapter(Context context) {
        this.context=context;
        inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        for(int i=0;i<20;i++) {
            Movie dto = new Movie();
            dto.setTitle("배트맨 비긴즈");
            dto.setActor("크리스찬 베일");
            dto.setOpenDay("2015-08-15");

            list.add(dto);
        }
    }

    /*리스트뷰가 보여줄 아이템의 갯수를 반환해주는 메서드*/
    public int getCount() {
        return list.size();
    }

    /* position 번째에 해당하는 아이템을 반환하는 메서드!!*/
    public Object getItem(int position) {
        return null;
    }

    /* position 번째에 해당하는 아이템에 부여된 id */
    public long getItemId(int position) {
        return 0;
    }

    /* position 번째에 어떤 뷰를 보여줄지를 반환하는 메서드
    *  주로 개발자가 디자인한 xml 레이아웃 파일에서 가장 바깥쪽 부모 뷰그룹이
    *  반환된다 . 우리의 경우 RelativeLayout  이다!!
    * */
    public View getView(int position, View convertView, ViewGroup parent) {
        /* item.xml 파일을 인플레이션 시켜서, 반환해주자!!*/
        View view=null;
        view=inflater.inflate(R.layout.item, parent, false);

        return view;
    }
}




