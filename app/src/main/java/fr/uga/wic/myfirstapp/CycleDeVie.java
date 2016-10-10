package fr.uga.wic.myfirstapp;

import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CycleDeVie extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","OnStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","OnDestroy called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","OnResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","OnPause called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","OnRestart called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_de_vie);
        Log.d("LifeCycle","OnCreate called");

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);

        Button bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.dialog_message)
                .setTitle(R.string.dialog_title);*/
        DialogFragment dialog = new DialogFragmentTest();
        dialog.show(this.getFragmentManager(), "dialog");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.help:
                //appel à un Intent pour utiliser le telephone
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0646481603"));
                startActivity(intent);
                return true;
            case R.id.new_game:
                Toast.makeText(this,"ezmlhgoefzihz",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}