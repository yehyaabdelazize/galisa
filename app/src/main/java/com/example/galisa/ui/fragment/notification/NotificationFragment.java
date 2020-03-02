package com.example.galisa.ui.fragment.notification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.galisa.R;
import com.example.galisa.databinding.FragmntNotificationBinding;
import com.example.galisa.pojo.model.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {
    List<NotificationModel> notificationModels;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmntNotificationBinding notificationBinding;
        notificationBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragmnt_notification, container, false);
        View view = notificationBinding.getRoot();

        notificationModels=new ArrayList<>();
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء باموافقه ع طلبك","8 : 45"));
        notificationModels.add(new NotificationModel(R.drawable.woman," قامت اسماء بإرسال رسالة ","8 : 45"));


        NotificationAdapter recycle_adapter = new NotificationAdapter(getContext(), notificationModels);
        notificationBinding.recNoti.setLayoutManager(new LinearLayoutManager(getContext()));
        notificationBinding.recNoti.setAdapter(recycle_adapter);


        return view;
    }
}
