package com.example.user.internetconnectioncheckwithbroadcastreceiver;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class AppStatus {
    private static AppStatus instance = new AppStatus();
    private static Context context;

    public static AppStatus getInstance(Context ctx) {
        context = ctx.getApplicationContext();
        return instance;
    }

    public boolean isOnline() {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (NetworkInfo anInfo : info)
                    if (anInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
        }
        return false;
    }
}
