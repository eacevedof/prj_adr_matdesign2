package theframework.android.components;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//Curso Android desde cero #30 | Base de datos - Altas (SQLite) en Android
//https://youtu.be/TxkdWX3UaNk?t=272
public class ComponentDB extends SQLiteOpenHelper{

    public ComponentDB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase oSQLiteDb) {
        oSQLiteDb.execSQL("CREATE TABLE articulos(codigo int primary key )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase oDb, int oldVersion, int newVersion) {

    }
}//ComponentDB
