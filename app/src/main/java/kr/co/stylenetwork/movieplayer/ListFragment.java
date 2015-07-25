/*
* Fragment 는 조각이라는 의미이고, 최초에 스마트폰이 출시될 시점에는
* 화면이 모두 작았으나, 점차 태블릿 기기가 출시됨에 따라 드디오 스마트폰도
* 화면이 커지게 되었다. 따라서 하나의 화면을 액티비티 하나만으로 처리하기에는
* 공간활용이 적절치 않은 경우가 많게 되었으므로, 하나의 액티비티로 처리되던
* 화면의 일부를 담당할 수 있는 프레그먼트라는 객체를 지원하게 되었다..
*
* 주의)  프레그먼트는 액티비티와 흡사한 객체이므로 위젯을 포함할 수 있는 큰 개념이다
* 하지만, 뷰그룹에 포함되기도 하는 이중성을 갖고 있다.... 마치 iframe과 흡사함..
* */
package kr.co.stylenetwork.movieplayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    MyListAdapter adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /* 프레그먼트가 보여줄 화면을 설계한 레이아웃 xml 인플레이션 시키자!*/
        View view=null;
        view=inflater.inflate(R.layout.fragment_list, container, false);

        listView= (ListView)view.findViewById(R.id.listView);

        /*모든 프레그먼트는 자신을 사용중인 컨텍스트인 액티비티를 참조할 수 있는
        메서드를 보유하고 있다!!*/
        adapter = new MyListAdapter(getActivity());

        /*어댑터와 리스트뷰와의 연결*/
        listView.setAdapter(adapter);

        /*리스너와의 연결 */
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), position+" 번째 선택함", Toast.LENGTH_SHORT).show();

        /*MainActivity가 보유한 페이지 이동 메서드 호출*/
        ((MainActivity)getActivity()).gotoPage(1);
    }
}











