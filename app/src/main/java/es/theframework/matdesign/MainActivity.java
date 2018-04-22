package es.theframework.matdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

//Curso Curso Android desde cero #10 | Mi primer Aplicación en Android - Diseño lógico
//https://www.youtube.com/watch?v=v1zbFY4Kmtk&index=11&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y
public class MainActivity extends AppCompatActivity {

    //variables para trabajar con los componentes en la interface
    private EditText etNum1;
    private EditText etNum2;
    private TextView tvwResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hay que hacer un cast de un TextView -> EditText
        etNum1 = (EditText)findViewById(R.id.numUno);
        etNum2 = (EditText)findViewById(R.id.numDos);
        tvwResult = (TextView)findViewById(R.id.tvwResultado);
    }//onCreate


    public void sum(View oView)
    {
        String sVal1 = etNum1.getText().toString();
        String sVal2 = etNum2.getText().toString();
        String sR = "";

        int iNum1 = Integer.parseInt(sVal1);
        int iNum2 = Integer.parseInt(sVal2);

        int iSuma = iNum1 + iNum2;
        sR = String.valueOf(iSuma);
        tvwResult.setText(sR);

    }//sum

    protected void log(String sText)
    {
        Toast.makeText(this,sText,Toast.LENGTH_LONG).show();
    }//log
}//MainActivity

