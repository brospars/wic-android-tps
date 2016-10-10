package fr.uga.wic.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int count = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus1 = (Button) findViewById(R.id.plus1);
        Button plus10 = (Button) findViewById(R.id.plus10);

        updateText();

        plus1.setOnClickListener(this);
        plus10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plus1 : this.count++;break;
            case R.id.plus10 : this.count = this.count+10;break;
        }
        updateText();
    }

    private void updateText(){
        TextView text = (TextView) findViewById(R.id.count);
        text.setText("Il y a "+this.count+" schtroumpfs dans le village");
    }
}
