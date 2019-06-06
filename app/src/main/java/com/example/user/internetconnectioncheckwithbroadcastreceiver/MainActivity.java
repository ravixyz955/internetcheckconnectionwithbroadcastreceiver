package com.example.user.internetconnectioncheckwithbroadcastreceiver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.user.internetconnectioncheckwithbroadcastreceiver.utils.NetworkWorkUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        NetworkWorkUtils.isConnected(this);
    }

    public void getSample() {
        Toast.makeText(this, "online!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        NetworkWorkUtils.unregisterReceiver(this);
    }
}
