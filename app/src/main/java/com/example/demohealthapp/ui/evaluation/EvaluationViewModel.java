package com.example.demohealthapp.ui.evaluation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EvaluationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EvaluationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Start evaluation");
    }

    public LiveData<String> getText() {
        return mText;
    }
}