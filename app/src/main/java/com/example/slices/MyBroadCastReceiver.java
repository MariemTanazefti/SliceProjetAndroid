package com.example.slices;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import static com.example.slices.MainActivity.clickCount;
import static com.example.slices.MainActivity.updateClickCount;

public class MyBroadCastReceiver extends BroadcastReceiver {
    public static String ACTION_CHANGE_COUNT = "com.jessicathornsby.slicetesting.ACTION_CHANGE_COUNT";
    public static String EXTRA_COUNT_VALUE = "com.jessicathornsby.slicetesting.EXTRA_COUNT_VALUE";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (ACTION_CHANGE_COUNT.equals(action) && intent.getExtras() != null) {
            int newValue = intent.getExtras().getInt(EXTRA_COUNT_VALUE, clickCount);
            updateClickCount(context, newValue);
        }
    }
}
