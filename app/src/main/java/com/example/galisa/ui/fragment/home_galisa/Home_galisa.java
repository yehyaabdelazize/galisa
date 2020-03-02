package com.example.galisa.ui.fragment.home_galisa;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.galisa.R;
import com.example.galisa.databinding.HomeGalisaBinding;
import com.example.galisa.pojo.request.Filter_request;
import com.example.galisa.pojo.response.Filter_response;
import com.example.galisa.pojo.response.Orders_response;

import java.util.ArrayList;
import java.util.List;

public class Home_galisa extends Fragment {
    List<Orders_response.DataBean> orders=new ArrayList<>();
    Home_galisaViewModel orderViewModel;
    FilterViewModel filterViewModel;
    HomeGalisaBinding bindinghome;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        bindinghome = DataBindingUtil.inflate(
                inflater, R.layout.home_galisa,container, false);
        View view = bindinghome.getRoot();

        filterViewModel = ViewModelProviders.of(this).get(FilterViewModel.class);


        /* filtering orders in alert dialog */
        //////////////////////////////////////
        bindinghome.filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
                View view=getLayoutInflater().inflate(R.layout.alert_job,null);
                builder.setView(view);
                builder.show();
                final AlertDialog dialog=builder.create();
                dialog.setCanceledOnTouchOutside(false);


                Filter_request request=new Filter_request();
                filterViewModel.filteranswer(request);

                //Done textview\
                final TextView Done=view.findViewById(R.id.send_filter);
                Done.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        filterViewModel.filter.observe(Home_galisa.this, new Observer<Filter_response>() {
                            @Override
                            public void onChanged(Filter_response filter_response) {
                                filter_response.getData();
                            }
                        });
                    }
                });
            }
        });


        //providers and observers of orders
        orderViewModel = ViewModelProviders.of(this).get(Home_galisaViewModel.class);
        orderViewModel.getOrders();
        //Adapter and set manger
        final Home_galisaAapter adapterh = new Home_galisaAapter(getContext(), orders);
        bindinghome.orderGalisaHome.setLayoutManager(new LinearLayoutManager(getContext()));
        bindinghome.orderGalisaHome.setAdapter(adapterh);

        orderViewModel.orderlivedata.observe(this, new Observer<List<Orders_response.DataBean>>() {
            @Override
            public void onChanged(List<Orders_response.DataBean> dataBeans) {
                    adapterh.setList(dataBeans);
            }
        });

        return view;
    }



}
