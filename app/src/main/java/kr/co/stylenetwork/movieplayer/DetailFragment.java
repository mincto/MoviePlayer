/*
* 안드로이드에서 비디오를 제어하는 VideoView를사용해본다
* */
package kr.co.stylenetwork.movieplayer;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

public class DetailFragment extends Fragment {
    MediaController controller;
    VideoView videoView;
    String path;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=null;
        view=inflater.inflate(R.layout.fragment_detail, container, false);
        controller = new MediaController(getActivity());
        videoView = (VideoView)view.findViewById(R.id.videoView);
        videoView.setMediaController(controller);/*컨트롤러 부착!!*/

        /*영화가 끝나면, 버튼을 다시 활성화 시켜주자!*/
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                ((MainActivity)getActivity()).bt_list.setEnabled(true);
                Toast.makeText(getActivity(),"영화재생이 완료되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    /*동영상 실행하는 메서드 */
    public void playMovie(){
        /* 각 스마트폰이 사용하는 SD카드의 디렉토리 경로
        * 자바에서는 디렉토리 클래스는 없다!! 왜?? 디렉토리도 파일로 간주하므로...
        * */
        File file=Environment.getExternalStorageDirectory();
        //String dir=file.getAbsolutePath();/* SD카드의 절대 경로 얻기!!*/
        String dir="storage/emulated/0";
        path=dir+"/DCIM/Camera/20150718_234955.mp4";
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }

}
















