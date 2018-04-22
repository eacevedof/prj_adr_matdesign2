package es.theframework.matdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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
    private CheckBox chkSum,chkRest,chkMult,chkDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVal1 = (EditText)findViewById(R.id.edtVal1);
        edtVal2 = (EditText)findViewById(R.id.edtVal2);
        tvw1 = (TextView) findViewById(R.id.tvwResultado);
        chkSum = (CheckBox) findViewById(R.id.chkSumar);
        chkRest = (CheckBox)findViewById(R.id.chkRestar);
        //chkMult = (CheckBox)findViewById(R.id.rdb3);
        //chkDiv = (CheckBox)findViewById(R.id.rdb4);
        alert("onCreate");
    }//onCreate

    public void get_result(View oView)
    {
        int iVal1=0, iVal2=0;
        String sResult = "";
        String sVal1 = edtVal1.getText().toString();
        String sVal2 = edtVal2.getText().toString();
        String schkSum = chkSum.getText().toString();
        String schkRest = chkRest.getText().toString();

        if(is_numeric(sVal1)) iVal1 = Integer.parseInt(sVal1);
        if(is_numeric(sVal2)) iVal2 = Integer.parseInt(sVal2);

        if(chkSum.isChecked())
        {
            int iSuma = iVal1 + iVal2;
            sResult = sResult.concat("\nResultado de la suma:".concat(String.valueOf(iSuma)));
        }

        if(chkRest.isChecked())
        {
            int iResult = iVal1 - iVal2;
            sResult = sResult.concat("\nResultado de la resta:".concat(String.valueOf(iResult)));
        }

        if(!sResult.equals(""))
        {
            tvw1.setText(sResult);
        }
        else
        {
            alert("Debe seleccionar alguna opreación!!");
        }

    }//get_result

    protected boolean is_numeric(String sString) {
        return sString != null && sString.matches("[-+]?\\d*\\.?\\d+");
    }

    protected void alert(String sText)
    {
        String sMsg = "[ LOG ]".concat(sText);
        Toast.makeText(this,sMsg,Toast.LENGTH_LONG).show();
    }//log

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}//MainActivity
