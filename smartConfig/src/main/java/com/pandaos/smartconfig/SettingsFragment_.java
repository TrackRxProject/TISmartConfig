//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.pandaos.smartconfig;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.pandaos.smartconfig.R.layout;
import com.pandaos.smartconfig.utils.SharedPreferencesInterface_;

public final class SettingsFragment_
    extends SettingsFragment
{

    private View contentView_;

    private void init_(Bundle savedInstanceState) {
        prefs = new SharedPreferencesInterface_(getActivity());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    private void afterSetContentView_() {
        settings_ap_mode_button = ((TextView) findViewById(com.pandaos.smartconfig.R.id.settings_ap_mode_button));
        settings_privacy_button = ((TextView) findViewById(com.pandaos.smartconfig.R.id.settings_privacy_button));
        settings_show_name_toggle = ((Switch) findViewById(com.pandaos.smartconfig.R.id.settings_show_name_toggle));
        settings_open_devices_tab_toggle = ((Switch) findViewById(com.pandaos.smartconfig.R.id.settings_open_devices_tab_toggle));
        settings_show_password_toggle = ((Switch) findViewById(com.pandaos.smartconfig.R.id.settings_show_password_toggle));
        {
            View view = findViewById(com.pandaos.smartconfig.R.id.settings_privacy_button);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingsFragment_.this.settings_privacy_button();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(com.pandaos.smartconfig.R.id.settings_ap_mode_button);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingsFragment_.this.settings_ap_mode_button();
                    }

                }
                );
            }
        }
        afterViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.tab_settings_view, container, false);
        }
        return contentView_;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        afterSetContentView_();
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    public static SettingsFragment_.FragmentBuilder_ builder() {
        return new SettingsFragment_.FragmentBuilder_();
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public SettingsFragment build() {
            SettingsFragment_ fragment_ = new SettingsFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}
