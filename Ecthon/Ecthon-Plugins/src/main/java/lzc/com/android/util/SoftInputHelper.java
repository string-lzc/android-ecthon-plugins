package lzc.com.android.util;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by lzc on 2018/2/8.
 */

public class SoftInputHelper {
    /**
     * 关闭软键盘
     * @param context
     */
    public static void closeSoftInput(Context context){
        InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT,InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    /**
     * 开启软键盘
     * @param context
     */
    public static void openSoftInput(Context context){
        InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (!imm.isActive()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT,InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
