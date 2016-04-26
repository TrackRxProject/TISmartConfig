//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.pandaos.smartconfig;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.googlecode.androidannotations.api.BackgroundExecutor;
import com.googlecode.androidannotations.api.SdkVersionHelper;
import com.pandaos.smartconfig.R.layout;

public final class SplashScreen_
    extends SplashScreen
{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_splash_screen);
    }

    private void init_(Bundle savedInstanceState) {
    }

    private void afterSetContentView_() {
        afterViews();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    public static SplashScreen_.IntentBuilder_ intent(Context context) {
        return new SplashScreen_.IntentBuilder_(context);
    }

    @Override
    public void splash() {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    SplashScreen_.super.splash();
                } catch (RuntimeException e) {
                    Log.e("SplashScreen_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, SplashScreen_.class);
        }

        public Intent get() {
            return intent_;
        }

        public SplashScreen_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

    }

}
