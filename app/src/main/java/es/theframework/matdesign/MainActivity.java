package es.theframework.matdesign;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

import theframework.android.components.ComponentUtils;
import theframework.android.components.ComponentDB;

//[Curso Android desde cero #30 | Base de datos - Altas (SQLite) en Android](https://youtu.be/TxkdWX3UaNk?t=706)
public class MainActivity extends AppCompatActivity
{
    private ComponentDB oDb;
    private ComponentUtils oUtils;

    private EditText edtPrecio,edtDescripcion,edtCodigo;
    private Button butBuscar, butInsertar, butModificar, butBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load_fromview();
    }//onCreate

    protected void load_fromview()
    {
        butBuscar = (Button)findViewById(R.id.butBuscar);
        butInsertar = (Button)findViewById(R.id.butInsertar);
        butModificar = (Button)findViewById(R.id.butModificar);
        butBorrar = (Button)findViewById(R.id.butBorrar);

        edtCodigo = (EditText)findViewById(R.id.edtCodigo);
        edtPrecio = (EditText)findViewById(R.id.edtPrecio);
        edtDescripcion = (EditText)findViewById(R.id.edtDescription);
    }//load_fromview

    public void registrar(View oView)
    {
        oDb = new ComponentDB(this,"db_framework",null,1);
        SQLiteDatabase oDbRW = oDb.getWritableDatabase();

        String sCodigo = edtCodigo.getText().toString();
        String sDescripcion = edtDescripcion.getText().toString();
        String sPrecio = edtPrecio.getText().toString();

        if(!sCodigo.isEmpty() && !sDescripcion.isEmpty() && !sPrecio.isEmpty()) {
            ContentValues oContVal = new ContentValues();
            oContVal.put("codigo",sCodigo);
            oContVal.put("precio",sPrecio);
            oContVal.put("descripcion",sDescripcion);

            oDbRW.insert("articulos",null,oContVal);
            oDbRW.close();
            edtCodigo.setText("");
            edtDescripcion.setText("");
            edtPrecio.setText("");
            Toast.makeText(this, "Registro insertado", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_LONG).show();
        }
    }//registrar

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
