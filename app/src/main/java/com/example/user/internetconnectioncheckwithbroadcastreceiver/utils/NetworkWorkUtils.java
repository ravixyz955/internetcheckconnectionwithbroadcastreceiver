package com.example.user.internetconnectioncheckwithbroadcastreceiver.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;

import com.example.user.internetconnectioncheckwithbroadcastreceiver.ConnectivityReceiver;

public class NetworkWorkUtils {
    private static ConnectivityReceiver connectivityReceiver;

    public static void isConnected(Context mContext) {
        connectivityReceiver = new ConnectivityReceiver();

        IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        filter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
        filter.addAction(WifiManager.WIFI_STATE_CHANGED_ACTION);
        mContext.registerReceiver(connectivityReceiver, filter);
    }

    public static void unregisterReceiver(Context mContext) {
        mContext.unregisterReceiver(connectivityReceiver);
    }
}
