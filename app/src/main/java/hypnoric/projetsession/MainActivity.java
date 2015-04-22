package hypnoric.projetsession;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Eric on 2015-04-20.
 */
public class MainActivity extends Activity {

    private static SharedPreferences prefs;
    boolean firstTime;
    static final int PREF_FINISHED = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefs = getPreferences(Context.MODE_PRIVATE);

        firstTime = prefs.getBoolean("firstTime", true);
        nextStep();
    }

    public void nextStep(){
        if(firstTime) {
            Intent intent = new Intent(this, PreferenceActivity.class);
            startActivity(intent);
        }
    }

    public void buttonQuitterOnClick(View v){
        finish();
        System.exit(0);
    }

    public void preferenceBtnOnClick(View v){
        Intent intent = new Intent(this, PreferenceActivity.class);
        startActivity(intent);
    }

    public static void setFirstTimeFalse(){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstTime", false);
        editor.commit();
    }
}