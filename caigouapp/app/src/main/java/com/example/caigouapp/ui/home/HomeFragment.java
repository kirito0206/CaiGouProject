package com.example.caigouapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.caigouapp.R;
import com.example.caigouapp.databinding.FragmentHomeBinding;
import com.zhouwei.mzbanner.holder.MZHolderCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        initView();
        return binding.getRoot();
    }

    public void initView(){
        //初始化轮播图
        List pictureList = new ArrayList<>(Arrays.asList(R.drawable.banner1, R.drawable.banner2, R.drawable.banner3));
        binding.mzbHome.setPages(pictureList, new MZHolderCreator<BannerViewHolder>() {
            @Override
            public BannerViewHolder createViewHolder() {
                return new BannerViewHolder();
            }
        });
        //初始化菜系
        ArrayList styleList = new ArrayList<>(Arrays.asList(
                R.drawable.min,
                R.drawable.hui,
                R.drawable.lu,
                R.drawable.yue,
                R.drawable.chuan,
                R.drawable.zhe,
                R.drawable.xiang,
                R.drawable.su));
        binding.gvCaixi.setAdapter(new GridViewAdapter(styleList));
    }
}