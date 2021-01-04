package com.example.pet;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.pet.Fragment.ShiPinFragment;
import com.example.pet.adapter.DingyueAdapter;
import com.example.pet.adapter.MemgXinAdapter;
import com.example.pet.adapter.SpacesItemDecoration;
import com.example.pet.adapter.TabFragmentPagerAdapter;
import com.example.pet.view.ViewPagerForScrollView;

import java.util.ArrayList;

import com.gyf.immersionbar.ImmersionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), ShangpinDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        RecyclerView re_mengxin = findViewById(R.id.re_mengxin);
        RecyclerView re_dingyue = findViewById(R.id.re_dingyue);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(i + "");
        }
        MemgXinAdapter memgXinAdapter = new MemgXinAdapter(this, strings);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        linearLayoutManager2.setOrientation(RecyclerView.HORIZONTAL);
        re_mengxin.setLayoutManager(linearLayoutManager);
        re_mengxin.addItemDecoration(new SpacesItemDecoration(15));
        re_mengxin.setAdapter(memgXinAdapter);
        DingyueAdapter dingyueAdapter = new DingyueAdapter(this, strings);
        re_dingyue.setLayoutManager(linearLayoutManager2);
        re_dingyue.addItemDecoration(new SpacesItemDecoration(15));
        re_dingyue.setAdapter(dingyueAdapter);


        final RadioGroup Rg_home = findViewById(R.id.Rg_home);
        final ViewPager Vp_home = findViewById(R.id.Vp_home);
        final RadioButton rb_zhushi = findViewById(R.id.rb_zhushi);
        final RadioButton rb_lingshi = findViewById(R.id.rb_lingshi);
        final RadioButton rb_xihu = findViewById(R.id.rb_xihu);
        final RadioButton rb_baojian = findViewById(R.id.rb_baojian);
        Drawable drawable1=getResources().getDrawable(R.mipmap.zhuliang_select); //获取图片
        Drawable drawable2=getResources().getDrawable(R.mipmap.select_line); //获取图片
        drawable2.setBounds(0,0,40,5);
        drawable1.setBounds(0,0,80,68);

        rb_zhushi.setCompoundDrawables(null,drawable1,null,drawable2);

        Drawable drawable3=getResources().getDrawable(R.mipmap.lingshi_notselect); //获取图片
        Drawable drawable4=getResources().getDrawable(R.mipmap.none); //获取图片

        drawable4.setBounds(0,0,40,5);
        drawable3.setBounds(0,0,78,65);
        rb_lingshi.setCompoundDrawables(null,drawable3,null,drawable4);

        Drawable drawable5=getResources().getDrawable(R.mipmap.xihuyongpin_notselect); //获取图片
        Drawable drawable6=getResources().getDrawable(R.mipmap.none); //获取图片

        drawable6.setBounds(0,0,40,5);
        drawable5.setBounds(0,0,158,65);
        rb_xihu.setCompoundDrawables(null,drawable5,null,drawable6);

        Drawable drawable7=getResources().getDrawable(R.mipmap.baojianpin_notselect); //获取图片
        Drawable drawable8=getResources().getDrawable(R.mipmap.none); //获取图片

        drawable8.setBounds(0,0,40,5);
        drawable7.setBounds(0,0,135,65);
        rb_baojian.setCompoundDrawables(null,drawable7,null,drawable8);

        rb_zhushi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.zhuliang_select); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.select_line); //获取图片
                    drawable2.setBounds(0,0,40,5);
                    drawable1.setBounds(0,0,80,68);

                    rb_zhushi.setCompoundDrawables(null,drawable1,null,drawable2);

                } else {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.zhuliang_notselect); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.none); //获取图片

                    drawable2.setBounds(0,0,40,5);

                    drawable1.setBounds(0,0,78,65);
                    rb_zhushi.setCompoundDrawables(null,drawable1,null,drawable2);

                }
            }
        });
        rb_lingshi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.lingshi_select); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.select_line); //获取图片
                    drawable2.setBounds(0,0,40,5);
                    drawable1.setBounds(0,0,80,68);
                    rb_lingshi.setCompoundDrawables(null,drawable1,null,drawable2);

                } else {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.lingshi_notselect); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.none); //获取图片

                    drawable2.setBounds(0,0,40,5);
                    drawable1.setBounds(0,0,78,65);
                    rb_lingshi.setCompoundDrawables(null,drawable1,null,drawable2);

                }
            }
        });
        rb_xihu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.xihuyongpin_select); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.select_line); //获取图片
                    drawable2.setBounds(0,0,40,5);
                    drawable1.setBounds(0,0,160,68);
                    rb_xihu.setCompoundDrawables(null,drawable1,null,drawable2);


                } else {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.xihuyongpin_notselect); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.none); //获取图片

                    drawable2.setBounds(0,0,40,5);
                    drawable1.setBounds(0,0,158,65);
                    rb_xihu.setCompoundDrawables(null,drawable1,null,drawable2);


                }
            }
        });
        rb_baojian.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.baojianpin_select); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.select_line); //获取图片
                    drawable2.setBounds(0,0,40,5);
                    drawable1.setBounds(0,0,138,68);
                    rb_baojian.setCompoundDrawables(null,drawable1,null,drawable2);

                } else {
                    Drawable drawable1=getResources().getDrawable(R.mipmap.baojianpin_notselect); //获取图片
                    Drawable drawable2=getResources().getDrawable(R.mipmap.none); //获取图片

                    drawable2.setBounds(0,0,40,5);
                    drawable1.setBounds(0,0,135,65);
                    rb_baojian.setCompoundDrawables(null,drawable1,null,drawable2);

                }
            }
        });
        ArrayList list = new ArrayList<>();
        list.add(new ShiPinFragment());
        list.add(new ShiPinFragment());
        list.add(new ShiPinFragment());
        list.add(new ShiPinFragment());

        TabFragmentPagerAdapter adapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), list);
        Vp_home.setAdapter(adapter);

        Vp_home.setCurrentItem(0);  //初始化显示第一个页面
        Rg_home.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                System.out.println("i==============" + i);
                switch (i) {
                    case R.id.rb_zhushi:

                        Vp_home.setCurrentItem(0);
                        break;
                    case R.id.rb_lingshi:

                        Vp_home.setCurrentItem(1);
                        break;
                    case R.id.rb_xihu:

                        Vp_home.setCurrentItem(2);
                        break;
                    case R.id.rb_baojian:
                        Vp_home.setCurrentItem(3);
                        break;
                }
            }
        });

        Vp_home.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        Rg_home.check(R.id.rb_zhushi);
                        break;
                    case 1:
                        Rg_home.check(R.id.rb_lingshi);
                        break;
                    case 2:
                        Rg_home.check(R.id.rb_xihu);
                        break;
                    case 3:
                        Rg_home.check(R.id.rb_baojian);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}