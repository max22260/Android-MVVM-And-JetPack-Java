package com.nagy.countermvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private static final MutableLiveData<Integer> counter = new MutableLiveData<>();
    private int count  = 0 ;

    public void initCounter() {
        counter.setValue(count);
    }

    public void increaseCounter(){

        count+=1 ;
        counter.setValue(count);
    }

    public MutableLiveData<Integer> getCounter() {
        return counter;
    }
}
