package com.kt.toster;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {
    public static void generateToast(Context context, String string) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
    }
}
