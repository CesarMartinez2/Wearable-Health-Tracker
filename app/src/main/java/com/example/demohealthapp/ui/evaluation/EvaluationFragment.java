package com.example.demohealthapp.ui.evaluation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.demohealthapp.QuestionsActivity;
import com.example.demohealthapp.R;
import com.example.demohealthapp.databinding.FragmentEvaluationBinding;
import com.google.android.material.button.MaterialButton;

public class EvaluationFragment extends Fragment {

    private EvaluationViewModel evaluationViewModel;
    private FragmentEvaluationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        evaluationViewModel =
                new ViewModelProvider(this).get(EvaluationViewModel.class);

        binding = FragmentEvaluationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEvaluation;
        evaluationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }

//Switch from evaluation start to evaluation questions
   public void onStart(){
        super.onStart();
        MaterialButton startevalbtn = (MaterialButton) getView().findViewById(R.id.startevalbtn);
        startevalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QuestionsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}