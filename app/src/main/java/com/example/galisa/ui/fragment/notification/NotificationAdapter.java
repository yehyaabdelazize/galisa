package com.example.galisa.ui.fragment.notification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.galisa.R;
import com.example.galisa.pojo.model.NotificationModel;

import java.util.List;

public class NotificationAdapter extends  RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    private Context context;
    private List<NotificationModel> list;
    public NotificationAdapter (Context context, List<NotificationModel>notificationModels) {
        this.context = context;
        this.list = notificationModels;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView text , time;

        public ViewHolder( View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.profile_image_noti);
            text=itemView.findViewById(R.id.notification_txt);
            time=itemView.findViewById(R.id.notification_time);

        }
    }

    @NonNull
    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.item_noti_seen,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getIm());
        holder.text.setText(list.get(position).getNoti_text());
        holder.time.setText(list.get(position).getNoti_time());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
