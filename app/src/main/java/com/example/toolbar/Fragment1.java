package com.example.toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.leanback.widget.HorizontalGridView;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment{

    HorizontalGridView gridView1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        gridView1 = view.findViewById(R.id.gridView1);


        //create list of Model, and an object
        List<Model> aList = new ArrayList<>();
        Model Media1 = new Model();
        Model Media2 = new Model();
        Model Media3 = new Model();
        Model Media4 = new Model();
        Model Media5 = new Model();

        Media1.setMediaThumbnail("https://i.kym-cdn.com/entries/icons/original/000/033/381/dancing_coffin.jpg");
        Media1.setMediaInfo("coffin dance");
        Media1.setMediaTitle("coffin dance");
        aList.add(Media1);
        Media2.setMediaThumbnail("https://xdigitalnews.com/wp-content/uploads/2020/03/africa-1280x720.jpg");
        Media2.setMediaInfo("coffin dance 2");
        Media2.setMediaTitle("coffin dance 2");
        aList.add(Media2);
        Media3.setMediaThumbnail("https://newsday1.com/wp-content/uploads/2020/04/%D8%A7%D9%84%D8%AA%D8%A7%D8%A8%D9%88%D8%AA.jpg");
        Media3.setMediaInfo("CLICK HERE TO WATCH!!!");
        Media3.setMediaTitle("REAL MOVIE");
        aList.add(Media3);
        Media4.setMediaThumbnail("https://i0.wp.com/www.ghanacelebrities.com/wp-content/uploads/2017/07/Screenshot-2017-07-27-at-12.24.21.png?resize=770%2C460");
        Media4.setMediaTitle("coffin dance 4");
        Media4.setMediaInfo("coffin dance 4");
        aList.add(Media4);
        Media5.setMediaThumbnail("https://www.nairobiminibloggers.com/wp-content/uploads/2020/04/pallbearer-840x480.jpg");
        Media5.setMediaTitle("coffin dance 5");
        Media5.setMediaInfo("coffin dance 5");
        aList.add(Media5);


        ListAdapter1 adapter = new ListAdapter1(getActivity(), aList);
        gridView1.setAdapter(adapter);


        return view;


    }
}
