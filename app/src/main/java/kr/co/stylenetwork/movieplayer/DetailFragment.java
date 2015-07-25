/*
* 안드로이드에서 비디오를 제어하는 VideoView를사용해본다
* */
package kr.co.stylenetwork.movieplayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import java.io.File;

public class DetailFragment extends Fragment {
    VideoView videoView;
    String path;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=null;
        view=inflater.inflate(R.layout.fragment_detail, container, false);

        /* 각 스마트폰이 사용하는 SD카드의 디렉토리 경로
        * 자바에서는 디렉토리 클래스는 없다!! 왜?? 디렉토리도 파일로 간주하므로...
        * */
        File file=Environment.getExternalStorageDirectory();
        String dir=file.getAbsolutePath();/* SD카드의 절대 경로 얻기!!*/
        path=dir+"/DCIM/Camera/20150725_120916.mp4";

        videoView = (VideoView)view.findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();

        return view;
    }
}











