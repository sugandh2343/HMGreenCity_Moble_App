package com.hmgreencity.common;

import android.util.Log;

import com.google.gson.Gson;
import com.hmgreencity.BuildConfig;

public class LoggerUtil {
    private static final String TAG = "OUTPUT";

    public static void logItem(Object src) {
        Gson gson = new Gson();
        if (BuildConfig.DEBUG)
            Log.e(TAG, "====:> " + gson.toJson(src));
    }
}
