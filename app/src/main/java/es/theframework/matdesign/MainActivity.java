package es.theframework.matdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

//VIDEO 8 TOAST
//https://www.youtube.com/watch?v=ZeBlrtQAmN0&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&index=9
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int iMat = 5;
        int iQuim = 5;
        int iFis = 5;
        int iProm = 0;

        iProm = (iMat + iQuim + iFis)/3;

        if(iProm >= 6)
        {
            this.log("Aprobado");
        }
        else
            this.log("Reprobado");

    }//onCreate

    protected void log(String Text)
    {
        Toast.makeText(this,Text,Toast.LENGTH_LONG).show();
    }//log
}//MainActivity

