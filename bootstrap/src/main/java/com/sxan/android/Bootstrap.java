package com.sxan.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-6-14
 * Time: 下午12:06
 * To change this template use File | Settings | File Templates.
 */
public class Bootstrap extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent startIntent = new Intent(context, Main.class);
        startIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(startIntent);
    }
}
