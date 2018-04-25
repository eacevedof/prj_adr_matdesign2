package es.theframework.matdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.math.RoundingMode;

import TheFramework.ComponentUtils;

//Curso Android desde cero #14 | Parte lógica de los controles RadioGroup y RadioButton
//https://www.youtube.com/watch?v=aI5FCr85fOc
public class MainActivity extends AppCompatActivity
{
    private ComponentUtils oUtils;
    private EditText edtVal1,edtVal2;
    private TextView tvwResult;
    private Spinner spnAccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //oUtils = new ComponentUtils(this);
        edtVal1 = (EditText)findViewById(R.id.edtVal1);
        edtVal2 = (EditText)findViewById(R.id.edtVal2);
        tvwResult = (TextView) findViewById(R.id.tvwResultado);
        spnAccion = (Spinner) findViewById(R.id.spnAccion);

        load_spinner();
        alert("onCreate");

        //double g = ComponentUtils.get_round(3);
    }//onCreate

    private void load_spinner()
    {
        String [] arOpciones = {"sumar","restar","multiplicar","dividir"};
        //ArrayAdapter <String> oAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,arOpciones);
        ArrayAdapter <String> oAdapter = new ArrayAdapter<String>(this,R.layout.spinner_item_geekpedia,arOpciones);

        spnAccion.setAdapter(oAdapter);
    }//load_spinner

    public void get_result(View oView)
    {
        int iVal1=0, iVal2=0;
        String sResult = "";
        int iResult = 0;
        String sVal1 = edtVal1.getText().toString();
        String sVal2 = edtVal2.getText().toString();

        if(is_numeric(sVal1)) iVal1 = Integer.parseInt(sVal1);
        if(is_numeric(sVal2)) iVal2 = Integer.parseInt(sVal2);

        String sSelected = spnAccion.getSelectedItem().toString();
        if(sSelected.equals("sumar"))
        {
            iResult = iVal1+iVal2;
            sResult = "Resultado de la suma: ".concat(String.valueOf(iResult));

        }
        else if(sSelected.equals("restar"))
        {
            iResult = iVal1-iVal2;
            sResult = "Resultado de la resta: ".concat(String.valueOf(iResult));

        }
        else if(sSelected.equals("multiplicar"))
        {
            iResult = iVal1*iVal2;
            sResult = "Resultado de la multiplicación: ".concat(String.valueOf(iResult));

        }
        else if(sSelected.equals("dividir"))
        {
            if(iVal2!=0) iResult = iVal1/iVal2;
            else alert("Divisor igual a 0!");
            sResult = "Resultado de la división: ".concat(String.valueOf(iResult));
        }
        else
            alert("Debe seleccionar una operación");


        tvwResult.setText(sResult);
    }//get_result

    protected boolean is_numeric(String sString)
    {
        return sString != null && sString.matches("[-+]?\\d*\\.?\\d+");
    }//is_numeric

    protected void alert(String sText)
    {
        String sMsg = "[ TOAST ]".concat(sText);
        Toast.makeText(this,sMsg,Toast.LENGTH_LONG).show();
    }//log

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }//round
}//MainActivity
