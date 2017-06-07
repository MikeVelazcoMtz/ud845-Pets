package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Pets database helper
 *
 * Created by Miguel Angel Velazco on 02/06/2017.
 */
public class PetDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "Pets.db";

    private static final String CREATE_ENTRY = "CREATE TABLE pets (" + PetEntry._ID + " INTEGER, "
            + PetEntry.COLUMN_NAME_NAME + " TEXT, " + PetEntry.COLUMN_NAME_BREED + " TEXT, "
            + PetEntry.COLUMN_NAME_GENDER+ " INTEGER, " + PetEntry.COLUMN_NAME_WEIGHT + " INTEGER);";


    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO: create tables
        db.execSQL(CREATE_ENTRY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // TODO: update database when upgrading
    }
}
