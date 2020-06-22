package com.example.android.tourguide.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            //return "Hello world from section: " + input;
            String text = "";

            if (input == 1) {
                text = "Visit";
            } else if (input == 2) {
                text = "Rest";
            } else if (input == 3) {
                text = "Eat";
            } else {
                text = "Enjoy";
            }

            return text;
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}