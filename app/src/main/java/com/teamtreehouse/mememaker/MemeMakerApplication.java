package com.teamtreehouse.mememaker;

import android.preference.Preference;
import android.preference.PreferenceManager;
import com.teamtreehouse.mememaker.utils.FileUtilities;

public class MemeMakerApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FileUtilities.saveAssetImage(this, "dogmess.jpg");
        FileUtilities.saveAssetImage(this, "excitedcat.jpg");
        FileUtilities.saveAssetImage(this, "guiltypup.jpg");

        // must be false to not override settings chosen by user
        // set to true to allow user to reset all app settings to default
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    }
}
