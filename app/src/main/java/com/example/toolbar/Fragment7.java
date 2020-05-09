package com.example.toolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.HorizontalGridView;

import java.util.ArrayList;
import java.util.List;

public class Fragment7 extends Fragment {

    HorizontalGridView gridView7;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_7, container, false);

        gridView7 = view.findViewById(R.id.gridView7);

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
        Media3.setMediaInfo("coffin dance 3");
        Media3.setMediaTitle("coffin dance 3");
        aList.add(Media3);
        Media4.setMediaThumbnail("https://i0.wp.com/www.ghanacelebrities.com/wp-content/uploads/2017/07/Screenshot-2017-07-27-at-12.24.21.png?resize=770%2C460");
        Media4.setMediaTitle("coffin dance 4");
        Media4.setMediaInfo("coffin dance 4");
        aList.add(Media4);
        Media5.setMediaThumbnail("https://www.nairobiminibloggers.com/wp-content/uploads/2020/04/pallbearer-840x480.jpg");
        Media5.setMediaTitle("REAL MOVIE");
        Media5.setMediaInfo("CLICK HERE TO WATCH!!!");
        aList.add(Media5);


        ListAdapter7 adapter = new ListAdapter7(getActivity(), aList);
        gridView7.setAdapter(adapter);
        //gridView7.notifyDataSetChanged();
        return view;
    }
}
