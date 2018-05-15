package es.theframework.matdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MaterialDesign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go_index(View oView)
    {
        //.class
        /*
.class is used when there isn't an instance of the class available.
.getClass() is used when there is an instance of the class available.
object.getClass() returns the class of the given object
        */
        Intent oIntent = new Intent(this,Index.class);
        startActivity(oIntent);
    }
}//MaterialDesign
