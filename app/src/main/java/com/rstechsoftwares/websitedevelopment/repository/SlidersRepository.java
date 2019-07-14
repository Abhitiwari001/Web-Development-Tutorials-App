package com.rstechsoftwares.websitedevelopment.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.rstechsoftwares.websitedevelopment.database.AppDatabase;
import com.rstechsoftwares.websitedevelopment.database.dao.SlidersDao;
import com.rstechsoftwares.websitedevelopment.database.entity.Slider;

import java.util.List;

public class SlidersRepository {

    private SlidersDao slidersDao;
    private LiveData<List<Slider>> sliders;

    public SlidersRepository(Application application){
        AppDatabase database = AppDatabase.getInstance(application);
        slidersDao = database.slidersDao();
        sliders = slidersDao.getAllSliders();
    }

    public LiveData<List<Slider>> getSliders() {
        return sliders;
    }

    public void insertAllSliders(List<Slider> sliders){
        slidersDao.insertAll(sliders);
    }

    public void removeAllSliders(){
        slidersDao.nukeSliders();
    }
}
