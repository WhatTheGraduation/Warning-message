package com.example.cnu_graduation_project.Service;


import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.cnu_graduation_project.Lock.LockActivity;
import com.example.cnu_graduation_project.R;

/**
 *  어플리케이션의 지속적인 동작을 위한 서비스
 *  상단바 알림을 이용하여 서비스 유지
 */
public class BackgroundService extends Service {

    private static final int NOTIFI_ID = 1;
    private static final String NOTIFI_CHANNEL_ID = "background-service";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        startForeground();

        return super.onStartCommand(intent, flags, startId);
    }

   private void startForeground(){
        Intent notificationIntent = new Intent(this, LockActivity.class);

       PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
               notificationIntent, 0);

       startForeground(NOTIFI_ID, new NotificationCompat.Builder(this,
               NOTIFI_CHANNEL_ID)
               .setOngoing(true)
               .setSmallIcon(R.drawable.ic_launcher_foreground)
               .setContentTitle(getString(R.string.app_name))
               .setContentText("Service running background")
               .setContentIntent(pendingIntent)
               .build());
   }
}
