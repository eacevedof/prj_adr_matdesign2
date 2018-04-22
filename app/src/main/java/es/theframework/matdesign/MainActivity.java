package es.theframework.matdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Curso Android desde cero #11 | Ejercicio práctico (Aplicación móvil)
//https://www.youtube.com/watch?v=Ml9hPWd2SCM&index=12&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y
public class MainActivity extends AppCompatActivity
{
    private EditText edtMate;
    private EditText edtFisica;
    private EditText edtQuimica;
    private TextView tvwEstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMate = (EditText)findViewById(R.id.edtMate);
        edtFisica = (EditText)findViewById(R.id.edtFisica);
        edtQuimica = (EditText)findViewById(R.id.edtQuimica);
        tvwEstatus = (TextView)(findViewById(R.id.tvwEstatus));

    }//onCreate

    public void get_status(View oView)
    {
        String sMat = edtMate.getText().toString();
        String sFis = edtFisica.getText().toString();
        String sQuim = edtQuimica.getText().toString();

        int iMat = Integer.parseInt(sMat);
        int iFis = Integer.parseInt(sFis);
        int iQuim = Integer.parseInt(sQuim);

        double fProm = (iMat+iFis+iQuim)/3.00;
        fProm = round(fProm,2);

        log(String.valueOf(fProm));
        tvwEstatus.setTextColor(Color.RED);
        tvwEstatus.setText("Reprobado: ".concat(String.valueOf(fProm)));
        if(fProm>4.5)
        {
            tvwEstatus.setTextColor(Color.GREEN);
            tvwEstatus.setText("Aprobado: ".concat(String.valueOf(fProm)));
        }

    }//evaluate

    protected void log(String sText)
    {
        String sMsg = "[ LOG ]".concat(sText);
        Toast.makeText(this,sText,Toast.LENGTH_LONG).show();
    }//log

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}//MainActivity
