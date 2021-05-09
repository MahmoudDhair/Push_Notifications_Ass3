package com.mahmoud.ass3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.snackbar.Snackbar;
import com.kaopiz.kprogresshud.KProgressHUD;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//import LoginActivity;

/**
 * Created by Dev. Ahmed Idhair on 9/4/2017.
 */

public class GlobalData {

    static ProgressDialog progressDialog;
    static KProgressHUD hud;

    public static void progressDialogKH(Activity activity, boolean status) {
        try {
            if (activity != null && !activity.isFinishing()) {
                if (status) {
                    if (hud != null) {
                        if (!hud.isShowing()) {
                            hud = KProgressHUD.create(activity)
                                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
//                        .setBackgroundColor(activity.getResources().getColor(R.color.colorAccent))
                                    .setCancellable(true)
                                    .setAnimationSpeed(2)
                                    .setDimAmount(0.5f)
                                    .show();
                        }
                    } else {
                        hud = KProgressHUD.create(activity)
                                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
//                        .setBackgroundColor(activity.getResources().getColor(R.color.colorAccent))
                                .setCancellable(true)
                                .setAnimationSpeed(2)
                                .setDimAmount(0.5f)
                                .show();
                    }

                } else {
                    if (hud != null && hud.isShowing()) {
                        hud.dismiss();
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void Toast(Activity c, String msg) {
        if (c != null) {
            Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
        }
    }
}


