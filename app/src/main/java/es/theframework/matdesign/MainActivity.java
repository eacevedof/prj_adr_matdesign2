package es.theframework.matdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;

import TheFramework.ComponentUtils;

//Curso Android desde cero #14 | Parte lógica de los controles RadioGroup y RadioButton
//https://www.youtube.com/watch?v=aI5FCr85fOc
public class MainActivity extends AppCompatActivity
{
    private ComponentUtils oUtils;
    private TextView tvwOne;
    private ListView lvwOne;

    private String arNombres[] = {"Samuel","Valentina","Santiago","Alejandro","Valeria","Benjamin",
                                    "Gerardo","Carlos","David","Sofia"};
    private String arEdades[] = {"18","25","32","17","24","20","27","15","19","23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert("onCreate");
        tvwOne = (TextView)findViewById(R.id.tvwOne);
        lvwOne = (ListView)findViewById(R.id.lvwOne);

        ArrayAdapter<String> oAdapter = new ArrayAdapter<String>(this,R.layout.list_item_geekpedia,arNombres);
        lvwOne.setAdapter(oAdapter);
        lvwOne.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tvwOne.setText("La edad de ".concat(lvwOne.getItemAtPosition(position).toString()).concat(" es ").concat(arEdades[position]).concat(" años"));
            }
        });
        //double g = ComponentUtils.get_round(3);
    }//onCreate


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
