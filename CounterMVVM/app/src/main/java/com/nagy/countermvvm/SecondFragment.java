package com.nagy.countermvvm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.nagy.countermvvm.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private CounterViewModel counterViewModel;
    LiveData<Integer> liveData ;


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        counterViewModel = new ViewModelProvider(this).get(CounterViewModel.class);

        binding = FragmentSecondBinding.inflate(inflater, container, false);

        liveData = counterViewModel.getCounter();

        liveData.observe(getViewLifecycleOwner(),integer -> binding.textviewSecond.setText("counter is " + integer));

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        liveData.observe(getViewLifecycleOwner(),integer -> binding.textviewSecond.setText("counter is " + integer));

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}