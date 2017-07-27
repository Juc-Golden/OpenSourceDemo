package com.example.mylibrary;

/**
 * * 吐司工具类
 * Created by Golden_Sky on 2017/7/27.
 */
import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    /**
     * 显示吐司
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
