package com.gh0stcr4ck3r.advancedandroid.mvvm.databases;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.gh0stcr4ck3r.advancedandroid.mvvm.daos.IpDao;
import com.gh0stcr4ck3r.advancedandroid.mvvm.models.IPModel;

import java.lang.invoke.VolatileCallSite;

/**
 * Created by cr4ck3r
 * Date: 3/17/19
 * Owner: Raisul Islam
 * Copyright (c) 2019 . All rights reserved.
 */

@Database(entities = {IPModel.class}, version = 1)
public abstract class IPDatabase extends RoomDatabase {

    public abstract IpDao ipDao();
    private static volatile IPDatabase INSTANCE;

    public static IPDatabase getDatabase(final Context context){
        if (INSTANCE == null) {
            synchronized (IPDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            IPDatabase.class, "my_ip_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
