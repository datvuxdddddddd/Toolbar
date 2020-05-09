// taskkill /im java.exe /f
package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     TextView txt_btn1,txt_btn2,txt_btn3;
     ImageButton btn1,btn3,btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);

        txt_btn1 = findViewById(R.id.txt_btn1);
        txt_btn3 = findViewById(R.id.txt_btn3);
        txt_btn2 = findViewById(R.id.txt_btn2);
       /*
        btn1.setOnFocusChangeListener(this);
        btn3.setOnFocusChangeListener(this);
        btn2.setOnFocusChangeListener(this);
        */

        //setOnClickListener()
    }
/*
    @Override
    public void onFocusChange(View v, boolean hasFocus) {

        if (v.getId() == R.id.btn1){
            if (hasFocus){
                txt_btn1.setVisibility(View.VISIBLE);
                //selectFragment(1);
            }
            else txt_btn1.setVisibility(View.INVISIBLE);
        }

        else if (v.getId() == R.id.btn2){
            if (hasFocus){
                txt_btn2.setVisibility(View.VISIBLE);
                //selectFragment(7);
            }
            else txt_btn2.setVisibility(View.INVISIBLE);
        }

        else if (v.getId() == R.id.btn3){
            if (hasFocus){
                txt_btn3.setVisibility(View.VISIBLE);
                //selectFragment(3);
            }
            else txt_btn3.setVisibility(View.INVISIBLE);

        }
    }

*/


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                selectFragment(1);
                break;
            case R.id.btn2:
                selectFragment(3);
                break;
            case R.id.btn3:
                selectFragment(7);
                break;
            default: break;
        }
    }



    Fragment fragment = null;
    String fragmentTag = "";
    public void selectFragment(int position) {




        Class fragmentClass = null;
        switch (position) {
            case 1:
                fragmentClass = Fragment1.class;
                fragmentTag = "Fragment1";
                break;
            case 3:
                fragmentClass = Fragment3.class;
                fragmentTag = "Fragment3";
                break;
            case 7:
                fragmentClass = Fragment7.class;
                fragmentTag = "Fragment7";
                break;
            case 0:
                fragmentClass = FragmentHome.class;
                fragmentTag = "FragmentHome";
            default:
                break;
        }
        try {
            Bundle bundle = new Bundle();
            fragment = (Fragment) fragmentClass.newInstance();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_home, fragment).commitAllowingStateLoss();
        } catch (Exception e) {
           // Log.e("hello", "selectFragment " + e.getMessage());
        }
    }
}
