package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Fragment_MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final Fragment BlankFragment =new BlankFragment();
    private final Fragment BlankFragment2=new BlankFragment2();
    private final Fragment BlankFragment3=new BlankFragment3();
    private final Fragment BlankFragment4=new BlankFragment4();

    private FragmentManager fragmentManager;

    private LinearLayout LinearLayout1,LinearLayout2,LinearLayout3,LinearLayout4;

    private ImageView ImageView1,ImageView2,ImageView3,ImageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.fragment_activity_main);

        LinearLayout1=findViewById(R.id.lay1);
        LinearLayout2=findViewById(R.id.lay2);
        LinearLayout3=findViewById(R.id.lay3);
        LinearLayout4=findViewById(R.id.lay4);

        ImageView1=findViewById(R.id.imageView1);
        ImageView2=findViewById(R.id.imageView2);
        ImageView3=findViewById(R.id.imageView3);
        ImageView4=findViewById(R.id.imageView4);

        LinearLayout1.setOnClickListener(this);
        LinearLayout2.setOnClickListener(this);
        LinearLayout3.setOnClickListener(this);
        LinearLayout4.setOnClickListener(this);
        initFragment();
        showFragment(0);
    }

    private void initFragment(){
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.frame,BlankFragment);
        transaction.add(R.id.frame,BlankFragment2);
        transaction.add(R.id.frame,BlankFragment3);
        transaction.add(R.id.frame,BlankFragment4);
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction){
        transaction.hide(BlankFragment);
        transaction.hide(BlankFragment2);
        transaction.hide(BlankFragment3);
        transaction.hide(BlankFragment4);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.lay1) {
            showFragment(1);
        } else if (view.getId() == R.id.lay2) {
            showFragment(2);
        } else if (view.getId() == R.id.lay3) {
            showFragment(3);
        } else if (view.getId() == R.id.lay4) {
            showFragment(4);
        }
    }

    private void showFragment(int i) {
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch(i){
            case 1:
                transaction.show(BlankFragment);
                ImageView1.setImageResource(R.drawable.time);
                ImageView2.setImageResource(R.drawable.yibiaopan);
                ImageView3.setImageResource(R.drawable.tongzhi);
                ImageView4.setImageResource(R.drawable.my);
                break;
            case 2:
                transaction.show(BlankFragment2);
                ImageView1.setImageResource(R.drawable.time);
                ImageView2.setImageResource(R.drawable.yibiaopan);
                ImageView3.setImageResource(R.drawable.tongzhi);
                ImageView4.setImageResource(R.drawable.my);
                break;
            case 3:
                transaction.show(BlankFragment3);
                ImageView1.setImageResource(R.drawable.time);
                ImageView2.setImageResource(R.drawable.yibiaopan);
                ImageView3.setImageResource(R.drawable.tongzhi);
                ImageView4.setImageResource(R.drawable.my);
                break;
            case 4:
                transaction.show(BlankFragment4);
                ImageView1.setImageResource(R.drawable.time);
                ImageView2.setImageResource(R.drawable.yibiaopan);
                ImageView3.setImageResource(R.drawable.tongzhi);
                ImageView4.setImageResource(R.drawable.my);
                break;
            default:
                break;
        }
        transaction.commit();
    }
}