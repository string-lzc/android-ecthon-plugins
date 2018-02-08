package lzc.com.android.util;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by lzc on 2018/2/8.
 */

public class ShowMsgHelper {
    public static void showShortToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
    public static void showLongToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
    public static void showShortSnackbar(View view, String msg){
        Snackbar.make(view,msg,Snackbar.LENGTH_SHORT).show();
    }
    public static void showLongSnackbar(View view, String msg){
        Snackbar.make(view,msg,Snackbar.LENGTH_LONG).show();
    }
    public static void showIndefiniteSnackbar(View view, String msg){
        Snackbar.make(view,msg,Snackbar.LENGTH_INDEFINITE).show();
    }
}
