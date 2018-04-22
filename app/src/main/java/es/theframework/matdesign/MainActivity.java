package es.theframework.matdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

//Curso Android desde cero #11 | Ejercicio práctico (Aplicación móvil)
//https://www.youtube.com/watch?v=Ml9hPWd2SCM&index=12&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y
public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//onCreate

    protected void log(String sText)
    {
        Toast.makeText(this,sText,Toast.LENGTH_LONG).show();
    }//log
}//MainActivity

