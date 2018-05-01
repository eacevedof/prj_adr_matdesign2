package theframework.android.components;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.*;

//Curso Android desde cero #30 | Base de datos - Altas (SQLite) en Android
//https://youtu.be/TxkdWX3UaNk?t=272
public class ComponentDB extends SQLiteOpenHelper{

    public ComponentDB(Context oContext, String sName, SQLiteDatabase.CursorFactory oFactory, int iVersion) {
        super(oContext, sName, oFactory, iVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase oSQLiteDb) {

        Log.d("ComponentDB","oncreate");
        oSQLiteDb.execSQL("CREATE TABLE articulos(codigo int primary key,descripcion text, precio real )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase oDb, int oldVersion, int newVersion) {

    }

    protected void alert(String sText)
    {
        String sMsg = "[ TOAST ]".concat(sText);

    }//log
}//ComponentDB
