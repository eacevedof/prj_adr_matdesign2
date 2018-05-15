package es.theframework.matdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }//onCreate

    public void go_main(View oView)
    {
        Intent oIntent = new Intent(this,MainActivity.class);
        startActivity(oIntent);
    }//go_main

    public void go_pruebas(View oView)
    {
        Intent oIntent = new Intent(this,Pruebas.class);
        startActivity(oIntent);
    }//go_pruebas

    public void go_edittext(View oView)
    {
        Intent oIntent = new Intent(this,EditTextValidation.class);
        startActivity(oIntent);
    }//go_edittext

}//Index
