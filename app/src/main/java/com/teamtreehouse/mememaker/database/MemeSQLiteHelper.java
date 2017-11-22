package com.teamtreehouse.mememaker.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class MemeSQLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "memes.db";
    private static final int DB_VERSION = 1;

    //Meme Table functionality
    public static final String MEMES_TABLE = "MEMES";
    public static final String COLUMN_MEME_ASSET = "ASSET";
    public static final String COLUMN_MEME_NAME = "NAME";
    private static String CREATE_MEMES =
            "CREATE TABLE" + MEMES_TABLE + "("
            + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COLUMN_MEME_ASSET + " TEXT," +
            COLUMN_MEME_NAME + " TEXT)";

    //Meme Table Annotations functionality

    public MemeSQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_MEMES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
