package es.theframework.matdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

//Curso Android desde cero #9 | Mi primer Aplicación en Android - Diseño gráfico
//https://youtu.be/gH7aV28H1Os?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y
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

