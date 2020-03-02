package com.example.galisa.ui.fragment.home_galisa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.galisa.R;
import com.example.galisa.pojo.response.Orders_response;
import com.example.galisa.ui.fragment.OnOrderClick.Onclick;

import java.util.List;

public class Home_galisaAapter extends RecyclerView.Adapter<Home_galisaAapter.ViewHolder>{

    private Context context;
    private List<Orders_response.DataBean> list;
    public Home_galisaAapter (Context context, List<Orders_response.DataBean>galisaModelList) {
        this.context = context;
        this.list = galisaModelList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView age , date,time,sum;
        TextView accept;
        public ViewHolder(final View itemView) {
            super(itemView);
            age=itemView.findViewById(R.id.age_galisa);
            date=itemView.findViewById(R.id.date_galisa);
            time=itemView.findViewById(R.id.time_galisa);
            sum=itemView.findViewById(R.id.sum_galisa);
            accept=itemView.findViewById(R.id.accept_order);


        }

    }

    @NonNull
    @Override
    public Home_galisaAapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.item_home_galisa,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final Home_galisaAapter.ViewHolder holder, int position) {

        holder.age.setText(list.get(position).getAge());
        holder.date.setText(list.get(position).getDate());
        holder.time.setText(list.get(position).getTime());
        holder.sum.setText(list.get(position).getTotal_price());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = ((FragmentActivity) holder.itemView.getContext())
                        .getSupportFragmentManager();
                assert fm != null;
                FragmentTransaction ft = fm.beginTransaction();
                Onclick llf = new Onclick();
                ft.replace(R.id.fragment_container_galisa, llf);
                ft.commit();
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public void setList(List<Orders_response.DataBean> dataBeans) {
        this.list = dataBeans;
        notifyDataSetChanged();
    }
}
