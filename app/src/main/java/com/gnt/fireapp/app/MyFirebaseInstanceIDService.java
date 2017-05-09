package com.gnt.fireapp.app;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by PC-05 on 5/9/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseInsIDService";

    @Override
    public void onTokenRefresh() {
        //get token
        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"new Token:"+refreshToken);
    }
}
