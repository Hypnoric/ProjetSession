package hypnoric.projetsession;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Eric on 2015-04-18.
 */
public class PreferenceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        AlertDialog diaBox = AskOption();
        diaBox.show();
    }

    private AlertDialog AskOption()
    {
        AlertDialog myQuittingDialogBox =new AlertDialog.Builder(this)
                .setTitle("Quitter")
                .setMessage("Voulez vous quitter sans sauvegarder les changements ?")

                .setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                })
                .setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        return myQuittingDialogBox;
    }

    public void saveBtnOnClick(View v){
        MainActivity.setFirstTimeFalse();
        BackToMenu(MainActivity.PREF_FINISHED);
    }

    private void BackToMenu(int activityResult) {
        Intent returnIntent = new Intent();

        // SAVE INFO AND SHIT

        /* returnIntent.putExtra("nomJoueur1",player1Name);
         returnIntent.putExtra("scoreJoueur1",ptsP1);
         if(!isOnePlayer){
             returnIntent.putExtra("nomJoueur2",player2Name);
             returnIntent.putExtra("scoreJoueur2",ptsP2);
         }*/
        setResult(activityResult, returnIntent);

        finish();
    }
}
