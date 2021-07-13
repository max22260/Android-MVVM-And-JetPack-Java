package com.example.roomdatabaseexample.db.entity;

public class Contact {


    public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_ID = "contacts";
    public static final String COLUMN_NAME = "contacts";
    public static final String COLUMN_EMAIL = "contacts";

    private String name;
    private String email;
    private String id;

    public Contact() {
    }

    public Contact(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static final String  CREATE_TABLE =
            "CREATE TABLE" + TABLE_NAME + "("
                    + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + "TEXT,"
                    + COLUMN_EMAIL + "DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ") " ;

}
