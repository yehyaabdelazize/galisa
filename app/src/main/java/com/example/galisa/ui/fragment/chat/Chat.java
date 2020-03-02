package com.example.galisa.ui.fragment.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.galisa.R;
import com.example.galisa.databinding.ChatBinding;

public class Chat extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ChatBinding binding;
        binding = DataBindingUtil.inflate(
                inflater, R.layout.chat, container, false);
        View view = binding.getRoot();


        return view;
    }
}
