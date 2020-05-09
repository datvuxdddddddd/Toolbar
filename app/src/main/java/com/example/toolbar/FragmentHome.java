package com.example.toolbar;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHome extends Fragment {

    VideoView video;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        MediaController mc= new MediaController(getActivity());
        video = view.findViewById(R.id.video);
        video.setVideoPath(VideoPath.videopath);
        video.setMediaController(mc);
        mc.setAnchorView(video);
        video.start();

        //getActivity().anything; to access fragment
        return view;
    }


}
