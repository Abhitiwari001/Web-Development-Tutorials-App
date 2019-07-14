package com.rstechsoftwares.websitedevelopment.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sliders_table")
public class Slider {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "slider_url")
    public String sliderUrl;

}
