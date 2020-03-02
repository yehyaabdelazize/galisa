package com.example.galisa.ui.fragment.OnOrderClick;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.galisa.R;
import com.example.galisa.databinding.OmclickItemOrderGalisaBindingImpl;
import com.example.galisa.pojo.response.Info_response;

import java.util.List;


public class Onclick extends Fragment {
    OnclickViewModel onclickViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final OmclickItemOrderGalisaBindingImpl bindingclick;
        bindingclick = DataBindingUtil.inflate(
                inflater, R.layout.omclick_item_order_galisa, container, false);
        View view = bindingclick.getRoot();


        onclickViewModel = ViewModelProviders.of(this).get(OnclickViewModel.class);
       onclickViewModel.orderinfo.observe(this, new Observer<List<Info_response.DataBean>>() {
           @Override
           public void onChanged(List<Info_response.DataBean> dataBeans) {
               //copying data in order click

           }
       });

        bindingclick.jobG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                View view = getLayoutInflater().inflate(R.layout.alert_thanking, null);
                builder.setView(view);
                builder.show();
                final AlertDialog dialog = builder.create();
                dialog.setCanceledOnTouchOutside(false);

            }
        });
        return view;
    }
}
