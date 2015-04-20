package hypnoric.projetsession;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Eric on 2015-04-20.
 */
public class StartActivity {

    private SharedPreferences prefs;
    boolean firstTime;

 /*   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        prefs = getPreferences(Context.MODE_PRIVATE);

        firstTime = prefs.getBoolean("firstTime", true);

        nextStep();
    }

    public void nextStep(){
        if(firstTime) {
            Intent intent = new Intent(this, PreferenceActivity.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
*/
}
