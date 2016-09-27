package com.zhenghaiqiang.subproject1;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhq on 2016/9/27.
 */
public class Util1 {
    public static void toast(Context context ,String text) {
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }
}
