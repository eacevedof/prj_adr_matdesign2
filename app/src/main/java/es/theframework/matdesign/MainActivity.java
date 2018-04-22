package es.theframework.matdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Curso Android desde cero #14 | Parte lógica de los controles RadioGroup y RadioButton
//https://www.youtube.com/watch?v=aI5FCr85fOc
public class MainActivity extends AppCompatActivity
{
    private EditText edtVal1,edtVal2;
    private TextView tvw1;
    private RadioButton rdb1,rdb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVal1 = (EditText)findViewById(R.id.edtVal1);
        edtVal2 = (EditText)findViewById(R.id.edtVal2);
        tvw1 = (TextView) findViewById(R.id.tvwResultado);
        rdb1 = (RadioButton)findViewById(R.id.rdb1);
        rdb2 = (RadioButton)findViewById(R.id.rdb2);
        alert("onCreate");
    }//onCreate

    public void get_result(View oView)
    {
        String sVal1 = edtVal1.getText().toString();
        String sVal2 = edtVal2.getText().toString();
        String sRdb1 = rdb1.getText().toString();
        String sRdb2 = rdb2.getText().toString();

        int iVal1 = Integer.parseInt(sVal1);
        int iVal2 = Integer.parseInt(sVal2);

        if(rdb1.isChecked()== true)
        {
            int iSuma = iVal1 + iVal2;
            String sR = String.valueOf(iSuma);
            tvw1.setText(sR);
        }
        else if(rdb2.isChecked()==true)
        {
            int iResta = iVal1 - iVal2;
            String sR = String.valueOf(iResta);
            tvw1.setText(sR);
        }
        else
        {
            alert("Debe seleccionar alguna acción!!");
        }

    }//get_result

    protected void alert(String sText)
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
