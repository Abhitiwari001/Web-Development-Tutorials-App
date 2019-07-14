package com.rstechsoftwares.websitedevelopment.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.rstechsoftwares.websitedevelopment.database.entity.User;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user_table")
    User getUser();

    @Insert
    void insertUser(User user);

}
