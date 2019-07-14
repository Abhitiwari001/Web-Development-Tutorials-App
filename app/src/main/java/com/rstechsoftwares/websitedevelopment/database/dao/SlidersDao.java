package com.rstechsoftwares.websitedevelopment.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.rstechsoftwares.websitedevelopment.database.entity.Slider;

import java.util.List;

@Dao
public interface SlidersDao {

    @Query("SELECT * FROM sliders_table")
    LiveData<List<Slider>> getAllSliders();

    @Insert
    void insertAll(List<Slider> sliders);

    @Query("DELETE FROM sliders_table")
    void nukeSliders();

}
