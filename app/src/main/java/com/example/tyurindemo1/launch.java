package com.example.tyurindemo1;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;

public class launch extends AppCompatActivity {
    public final String[] resIs = {""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch);

//        Thread thread = new Thread() {
//            public void run() {
//                Thread.currentThread().setName("Check connection");
//                int loadingState = 0;
//                while (loadingState != 3) {
//                    while (loadingState == 0) {
//                        if (!isOnline(launch.this)) {
//                            loadingState = 1;
//                            makeMessageOnScreen("Ошибка подключения к интернету");
//                        } else {
//                            try {
//                                if (tryGetVersion()) {
//                                    loadingState = 3;
//
//                                    Intent intent = new Intent(launch.this, MainActivity.class);
//                                    startActivity(intent);
//                                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//                                    finish();
//                                }
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                    while (loadingState == 1) {
//                        if (isOnline(launch.this)) {
//                            loadingState = 3;
//                        }
//                    }
//                }
//            }
//        };
//        thread.start();
//    }
//
//    public boolean tryGetVersion() throws JSONException {
//
//        String url = "https://food.madskill.ru/dishes/version";
//
//        RequestQueue requestQueue = Volley.newRequestQueue(launch.this);
//
//        StringRequest request = new StringRequest(Request.Method.GET, url,
//                result -> resIs[0] = result,
//                error -> error.getMessage()
//        );
//        requestQueue.add(request);
//
//        for (int i = 0; i < 5; i++) {
//            if (!resIs[0].equals("") && resIs[0].charAt(0) != 'j') {
//                return true;
//            } else {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        makeMessageOnScreen("Ошибка подключения к серверу");
//        return false;
//    }
//
//    private void makeMessageOnScreen(String msg) {
//        new Handler(Looper.getMainLooper()).post(new Runnable() {
//            @Override
//            public void run() {
//                Toast toast = Toast.makeText(launch.this, msg, Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//    }
//
//    public static boolean isOnline(Context context) {
//        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo netInfo = cm.getActiveNetworkInfo();
//
//        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
//            return true;
//        }
//        return false;
//    }
//}
        new Handler().postDelayed(()->{
            Intent intent = new Intent(launch.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }, 3000);
    }
}
