package com.example.user.internetconnectioncheckwithbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.user.internetconnectioncheckwithbroadcastreceiver.utils.NetworkWorkUtils;

public class ConnectivityReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (AppStatus.getInstance(context).isOnline()) {
//            Toast.makeText(context, "Online", Toast.LENGTH_SHORT).show();
            if (context instanceof MainActivity)
                ((MainActivity) context).getSample();
        } else {
            Toast.makeText(context, "Please !! Make your network ON", Toast.LENGTH_SHORT).show();
        }
    }
}