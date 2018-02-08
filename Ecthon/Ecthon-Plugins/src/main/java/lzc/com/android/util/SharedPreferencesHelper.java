package lzc.com.android.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

/**
 * Created by lzc on 2018/2/8.
 */

public class SharedPreferencesHelper {
    private Context context;
    private SharedPreferences sp;
    private String FILE_NAME = "com.app.config";

    protected SharedPreferencesHelper(Context context) {
        this.context = context;
        sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }

    protected void setString(String key, String value) {
        sp.edit().putString(key, value).apply();
    }

    protected String getString(String key) {
        return sp.getString(key, null);
    }

    protected void setBoolean(String key, boolean value) {
        sp.edit().putBoolean(key, value).apply();
    }

    protected void setFloat(String key, float value){
        sp.edit().putFloat(key,value).apply();
    }

    protected float getFloat(String key){
        return sp.getFloat(key,0);
    }

    protected void setLong(String key, long value){
        sp.edit().putLong(key,value).apply();
    }

    protected long getLong(String key){
        return sp.getLong(key,0);
    }

    protected void setStringSet(String key, Set<String> set){
        sp.edit().putStringSet(key,set).apply();
    }

    protected Set<String> getStringSet(String key){
        return sp.getStringSet(key,null);
    }

    protected boolean getBoolean(String key) {
        return sp.getBoolean(key, false);
    }

    protected void setInt(String key, int value) {
        sp.edit().putInt(key, value).apply();
    }

    protected int getInt(String key) {
        return sp.getInt(key, 0);
    }
}
