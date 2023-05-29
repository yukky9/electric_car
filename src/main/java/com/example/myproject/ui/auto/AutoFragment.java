package com.example.myproject.ui.auto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myproject.databinding.FragmentAutoBinding;

public class AutoFragment extends Fragment {

    private FragmentAutoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AutoViewModel autoViewModel =
                new ViewModelProvider(this).get(AutoViewModel.class);

        binding = FragmentAutoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}