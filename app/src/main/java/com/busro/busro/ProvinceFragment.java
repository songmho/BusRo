package com.busro.busro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by songmho on 2016-01-29.
 */
public class ProvinceFragment extends Fragment implements View.OnClickListener {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout cur_layout=(LinearLayout)inflater.inflate(R.layout.fragment_province,container,false);

        Button seoul=(Button)cur_layout.findViewById(R.id.seoul);
        Button busan=(Button)cur_layout.findViewById(R.id.busan);
        Button incheon=(Button)cur_layout.findViewById(R.id.incheon);
        Button gwangju=(Button)cur_layout.findViewById(R.id.gwangju);
        Button daejeon=(Button)cur_layout.findViewById(R.id.daejeon);
        Button daegu=(Button)cur_layout.findViewById(R.id.daegu);
        Button ulsan=(Button)cur_layout.findViewById(R.id.ulsan);

        Button gyeonggi=(Button)cur_layout.findViewById(R.id.gyeonggi);
        Button gangwon=(Button)cur_layout.findViewById(R.id.gangwon);
        Button gyeongbuk=(Button)cur_layout.findViewById(R.id.gyeongbuk);
        Button gyeongnam=(Button)cur_layout.findViewById(R.id.gyeongnam);
        Button chungbuk=(Button)cur_layout.findViewById(R.id.chungbuk);
        Button chungnam=(Button)cur_layout.findViewById(R.id.chungnam);
        Button jeonbuk=(Button)cur_layout.findViewById(R.id.jeonbuk);
        Button jeonnam=(Button)cur_layout.findViewById(R.id.jeonnam);


        seoul.setOnClickListener(this);
        busan.setOnClickListener(this);
        incheon.setOnClickListener(this);
        gwangju.setOnClickListener(this);
        daejeon.setOnClickListener(this);
        daegu.setOnClickListener(this);
        ulsan.setOnClickListener(this);
        gyeonggi.setOnClickListener(this);
        gangwon.setOnClickListener(this);
        gyeongbuk.setOnClickListener(this);
        gyeongnam.setOnClickListener(this);
        chungbuk.setOnClickListener(this);
        chungnam.setOnClickListener(this);
        jeonbuk.setOnClickListener(this);
        jeonnam.setOnClickListener(this);

        return cur_layout;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment=new CityFragment();
        switch (v.getId()){
            case R.id.seoul:
                ((ChooseActivity)getActivity()).province.setText("서울");
                break;
            case R.id.busan:
                ((ChooseActivity)getActivity()).province.setText("부산");
                break;
            case R.id.daegu:
                ((ChooseActivity)getActivity()).province.setText("대구");
                break;
            case R.id.incheon:
                ((ChooseActivity)getActivity()).province.setText("인천");
                break;
            case R.id.gwangju:
                ((ChooseActivity)getActivity()).province.setText("광주");
                break;
            case R.id.daejeon:
                ((ChooseActivity)getActivity()).province.setText("대전");
                break;
            case R.id.ulsan:
                ((ChooseActivity)getActivity()).province.setText("울산");
                break;
            case R.id.gyeonggi:
                ((ChooseActivity)getActivity()).province.setText("경기");
                break;
            case R.id.gangwon:
                ((ChooseActivity)getActivity()).province.setText("강원");
                break;
            case R.id.gyeongbuk:
                ((ChooseActivity)getActivity()).province.setText("경북");
                break;
            case R.id.gyeongnam:
                ((ChooseActivity)getActivity()).province.setText("경남");
                break;
            case R.id.chungbuk:
                ((ChooseActivity)getActivity()).province.setText("충북");
                break;
            case R.id.chungnam:
                ((ChooseActivity)getActivity()).province.setText("충남");
                break;
            case R.id.jeonbuk:
                ((ChooseActivity)getActivity()).province.setText("전북");
                break;
            case R.id.jeonnam:
                ((ChooseActivity)getActivity()).province.setText("전남");
                break;

        }

        ((ChooseActivity)getActivity()).city.setVisibility(View.VISIBLE);
        ((ChooseActivity)getActivity()).fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();
        ((ChooseActivity)getActivity()).fragmentTransaction.replace(R.id.container,fragment);
        ((ChooseActivity)getActivity()).fragmentTransaction.commit();

    }
}
