package com.example.galisa.ui.fragment.messages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.galisa.R;
import com.example.galisa.pojo.model.MessageModel;
import com.example.galisa.pojo.model.NotificationModel;
import com.example.galisa.ui.fragment.notification.NotificationAdapter;

import java.util.List;

public class MessageAdapter extends  RecyclerView.Adapter<MessageAdapter.ViewHolder> {

    private Context context;
    private List<MessageModel> list;
    public MessageAdapter (Context context, List<MessageModel>messageModels) {
        this.context = context;
        this.list = messageModels;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView text , time,content;

        public ViewHolder( View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.profile_image_mess);
            text=itemView.findViewById(R.id.name_mess);
            time=itemView.findViewById(R.id.time_mess);
            content=itemView.findViewById(R.id.text_mess);

        }
    }

    @NonNull
    @Override
    public MessageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.item_notseen,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getIm());
        holder.text.setText(list.get(position).getName());
        holder.time.setText(list.get(position).getMess_time());
        holder.content.setText(list.get(position).getMess_text());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
