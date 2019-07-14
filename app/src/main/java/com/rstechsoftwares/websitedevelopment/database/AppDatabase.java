package com.rstechsoftwares.websitedevelopment.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.rstechsoftwares.websitedevelopment.database.dao.SlidersDao;
import com.rstechsoftwares.websitedevelopment.database.dao.UserDao;
import com.rstechsoftwares.websitedevelopment.database.entity.Slider;
import com.rstechsoftwares.websitedevelopment.database.entity.User;

@Database(entities = {Slider.class, User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract SlidersDao slidersDao();

    public abstract UserDao userDao();

    public static synchronized AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "app_database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

}
