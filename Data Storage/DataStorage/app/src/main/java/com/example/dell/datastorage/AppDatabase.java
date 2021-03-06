package com.example.dell.datastorage;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


@Database(entities = {Contact.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ContactDAO getContactDAO();

}

