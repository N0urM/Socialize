package com.example.nourm.socialize;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openApp(Context context, String packageName, String url) {
        PackageManager manager = context.getPackageManager();
        if (!url.startsWith("https://"))
            url = "https://" + url;
        Intent i = manager.getLaunchIntentForPackage(packageName);
        if (i == null) {

            Toast toast = Toast.makeText(context, "App isn't installed", Toast.LENGTH_SHORT);
            toast.show();
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        } else {
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);
        }

    }

    public void launchTwitter(View view) {
        openApp(this, "com.twitter.android", "www.twitter.com");
    }

    public void launchFaceook(View view) {
        openApp(this, "com.facebook.katana", "www.facebook.com");
    }

    public void launchinsta(View view) {
        openApp(this, "com.instagram.android", "www.instagram.com");
    }

    public void launchMessenger(View view) {
        openApp(this, "com.facebook.orca", "www.messenger.com");
    }

    public void launchWhatsapp(View view) {
        openApp(this, "com.whatsapp", "www.whatsapp.com");
    }

    public void launchask(View view) {
        openApp(this, "com.askfm", "www.ask.fm");
    }

    public void launchLinkedin(View view) {
        openApp(this, "com.linkedin.android", "www.Linkedin.com");
    }
    public void launchtumblr(View view) {
        openApp(this, "com.tumblr", "www.tumblr.com");
    }
    public void launchflicker(View view) {
        openApp(this, "com.yahoo.mobile.client.android.flickr", "www.flickr.com");
    }

}
