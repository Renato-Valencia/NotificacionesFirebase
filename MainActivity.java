package com.example.firbasenotificacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String token= FirebaseInstanceId.getInstance().getToken();
        Log.d("FCM","Token: "+token);

        //fhFpl0Yt99g:APA91bEDvbqR6Ss2kpdOKMzkahBcLoabbcL6S_FdWVPNnojvfaDL0gSJpvRFWDM8xZn2G-CyTz6H4mXMS3XE2YzCviYlPKuMJauw1PkuyOmSIw5brsw9QcF0Cvz4CEyMuG-MDb9_OfKW
    }
}
