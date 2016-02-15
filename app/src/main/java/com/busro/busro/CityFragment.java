package com.busro.busro;

import android.app.Activity;
import android.content.Intent;
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
public class CityFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout cur_layout=(LinearLayout)inflater.inflate(R.layout.fragment_city,container,false);
        final Button seoul=(Button)cur_layout.findViewById(R.id.seoul);
        seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.putExtra("depart",seoul.getText().toString());
                getActivity().setResult(Activity.RESULT_OK,intent);
                getActivity().finish();
             }
        });
        return cur_layout;
    }
}
