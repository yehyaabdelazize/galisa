package com.example.galisa.ui.fragment.messages;

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
import com.example.galisa.databinding.FragmentHomeBinding;
import com.example.galisa.databinding.FragmentMessageBinding;
import com.example.galisa.pojo.model.MessageModel;

import java.util.ArrayList;
import java.util.List;

public class MessageFragment extends Fragment {
    List<MessageModel> messageModels;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentMessageBinding binding;
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_message, container, false);
        View view = binding.getRoot();
        messageModels=new ArrayList<>();
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال  ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال  ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال  ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال  ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال  ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال  ","5 :13"));
        messageModels.add(new MessageModel(R.drawable.woman," اسماء احمد "," رعاية الاطفال  ","5 :13"));
        MessageAdapter adapter=new MessageAdapter(getContext(),messageModels);
        binding.recMessage.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recMessage.setAdapter(adapter);
        return view;
    }
}
