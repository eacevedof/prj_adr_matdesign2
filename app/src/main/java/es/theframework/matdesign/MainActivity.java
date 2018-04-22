package es.theframework.matdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

//Curso Curso Android desde cero #10 | Mi primer Aplicación en Android - Diseño lógico
//https://www.youtube.com/watch?v=v1zbFY4Kmtk&index=11&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//onCreate

    protected void log(String Text)
    {
        Toast.makeText(this,Text,Toast.LENGTH_LONG).show();
    }//log
}//MainActivity

