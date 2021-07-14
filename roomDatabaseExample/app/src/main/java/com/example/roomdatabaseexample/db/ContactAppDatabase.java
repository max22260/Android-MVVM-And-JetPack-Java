package com.example.roomdatabaseexample.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomdatabaseexample.db.entity.Contact;

@Database(entities = {Contact.class} , version = 1)
public  abstract  class ContactAppDatabase extends RoomDatabase {

    public abstract ContactDAO getContactDAO();
}
