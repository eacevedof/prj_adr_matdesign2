package theframework.android.components;

import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.app.Application;
import android.widget.Spinner;
import java.math.BigDecimal;
import java.math.RoundingMode;

//ComponentUtils 0.0.1
public class ComponentUtils
{
    public Application oAdrapp;

    public ComponentUtils() {
    }

    public ComponentUtils(Application oAdrapp)
    {
        this.oAdrapp = oAdrapp;
    }

    public void load_spinner(String [] arOpciones,Spinner oSpinner)
    {
        ArrayAdapter<String> oAdapter = new ArrayAdapter<String>(this.oAdrapp,android.R.layout.simple_spinner_dropdown_item,arOpciones);
        oSpinner.setAdapter(oAdapter);
    }//load_spinner()
    
    public boolean is_numeric(String sString)
    {
        return sString != null && sString.matches("[-+]?\\d*\\.?\\d+");
    }//is_numeric

    public void alert(String sText,Application oApp)
    {
        String sMsg = "[ TOAST ]".concat(sText);
        Toast.makeText(oApp,sMsg,Toast.LENGTH_LONG).show();
    }//alert0

    public void alert(String sText)
    {
        String sMsg = "[ TOAST ]".concat(sText);
        Toast.makeText(this.oAdrapp,sMsg,Toast.LENGTH_LONG).show();
    }//alert1

    public static double get_round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal oBigD = new BigDecimal(value);
        oBigD = oBigD.setScale(places, RoundingMode.HALF_UP);
        return oBigD.doubleValue();
    }//round
    
}//ComponentUtils
