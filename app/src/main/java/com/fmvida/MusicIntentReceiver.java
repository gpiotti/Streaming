package com.fmvida;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


/**
 * Created by kingsun on 22/10/2015.
 */

public class MusicIntentReceiver extends android.content.BroadcastReceiver {
    private static final String ACTION_STOP = "com.fmvida.ACTION_STOP";
    @Override
    public void onReceive(Context ctx, Intent intent) {
        if (intent.getAction().equals(
                android.media.AudioManager.ACTION_AUDIO_BECOMING_NOISY)) {
            // signal your service to stop playback
            // (via an Intent, for instance)
            Log.i("Broadcast", "Noisy");
            ctx.startService(new Intent(ctx, Music_service.class).setAction(ACTION_STOP));
        }
    }
}