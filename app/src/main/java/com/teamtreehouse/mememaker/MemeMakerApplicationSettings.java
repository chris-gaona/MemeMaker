package com.teamtreehouse.mememaker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.teamtreehouse.mememaker.utils.StorageType;

public class MemeMakerApplicationSettings {
    SharedPreferences mSharedPreferences;

    // single location to deal with shared preferences
    // constructor
    public MemeMakerApplicationSettings(Context context) {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String getStoragePreference() {
        return mSharedPreferences.getString("Storage", StorageType.INTERNAL);
    }

    public void setSharedPreferences(String storageType) {
        mSharedPreferences
                .edit()
                .putString("Storage", storageType)
                .apply();

        // could use apply instead of commit
        // commit is synchronous whereas apply is asynchronous
    }
}
