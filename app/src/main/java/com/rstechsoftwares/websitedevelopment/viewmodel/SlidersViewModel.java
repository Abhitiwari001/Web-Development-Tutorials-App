package com.rstechsoftwares.websitedevelopment.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.rstechsoftwares.websitedevelopment.database.entity.Slider;
import com.rstechsoftwares.websitedevelopment.repository.SlidersRepository;

import java.util.List;

public class SlidersViewModel extends AndroidViewModel {

    private SlidersRepository repository;
    private LiveData<List<Slider>> sliders;

    public SlidersViewModel(Application application) {
        super(application);
        repository = new SlidersRepository(application);
        sliders = repository.getSliders();
    }

    public void insertAllSliders(List<Slider> sliders) {
        repository.insertAllSliders(sliders);
    }

    public void removeAllSliders() {
        repository.removeAllSliders();
    }

    public LiveData<List<Slider>> getSliders() {
        return sliders;
    }
}
