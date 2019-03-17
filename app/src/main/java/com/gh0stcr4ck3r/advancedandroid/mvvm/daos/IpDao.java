package com.gh0stcr4ck3r.advancedandroid.mvvm.daos;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.gh0stcr4ck3r.advancedandroid.mvvm.models.IPModel;

import java.util.List;

/**
 * Created by cr4ck3r
 * Date: 3/17/19
 * Owner: Raisul Islam
 * Copyright (c) 2019 . All rights reserved.
 */

@Dao
public interface IpDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void Insert(IPModel ipModel);

    @Delete
    void Delete(IPModel ipModel);

    @Update
    void Update(IPModel ipModel);

    @Query("DELETE FROM ip_table")
    void deleteAll();

    @Query("SELECT * from ip_table ORDER BY id ASC")
    LiveData<List<IPModel>> getAllIP();
}
