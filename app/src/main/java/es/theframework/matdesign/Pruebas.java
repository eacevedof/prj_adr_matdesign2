package es.theframework.matdesign;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.icu.util.Calendar;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.util.Date;

import theapplication.TheApplication;
import theframework.TheFramework;
import theframework.android.components.ComponentFile;
import theframework.android.components.ComponentLog;

//AppCompatActivity: Base class for activities that use the support library action bar features.
public class Pruebas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas);
//        mkdir();
        //writefile();
        //show_content();
        //info();
        //bootstrap();
        logs_test();
    }//onCreate

    protected void logs_test(){
        log("logs_test()");
        ComponentLog oLog = new ComponentLog(this);
        oLog.custom("un valor para custom");
        oLog.debug("un valor para debug");
        oLog.emails("un valor para emails");
        oLog.errors("un valor para errors");
        oLog.queries("una consulta");
        oLog.session("valor para session");
        oLog.shellscripts("valor para shell");
    }

    public void go_index(View oView)
    {
        //.class
        /*
.class is used when there isn't an instance of the class available.
.getClass() is used when there is an instance of the class available.
object.getClass() returns the class of the given object
        */
        Intent oIntent = new Intent(this,Index.class);
        startActivity(oIntent);
    }


    protected void bootstrap()
    {
        TheApplication oApp = new TheApplication(this);
        oApp.bootstrap();
    }

    protected void mkdir()
    {
        ComponentFile oCFile = new ComponentFile(this);
        boolean i = oCFile.mkdir_app("carpeta-interna");
        if(!i) log(oCFile.get_errors());
        i = oCFile.mkdir_sdcard("carpeta-externa");
        if(!i) log(oCFile.get_errors());
    }

    public void info()
    {
        log("Packagename:"+getApplicationContext().getPackageName());
        ApplicationInfo applicationInfo = getApplicationInfo();
        int stringId = applicationInfo.labelRes;
        if(stringId == 0)
            log("nonlocallizedlabel:"+applicationInfo.nonLocalizedLabel.toString());
        else
            log("getString(stringid):"+getString(stringId));
    }

    protected void show_content()
    {
        ComponentFile oFile = new ComponentFile(this);
        String sPathSD = Environment.getExternalStorageDirectory().getAbsolutePath().toString();
        sPathSD = sPathSD.concat("/tfw_logs");
        log("sPathsd:"+sPathSD);
        String sContent = oFile.get_content(sPathSD,"esto-es-un.log");
        if(!oFile.is_error()) {
            log("sContent"+sContent);
            log("oFile.errors:"+oFile.get_errors());
        }
        else
            Log.e("error","ERROR EN oFile.getContent");
    }



    protected void writefile()
    {
        ComponentFile oFile = new ComponentFile(this);
        Date currentTime = Calendar.getInstance().getTime();
        oFile.mkdir_sdcard("tfw_logs");
        String sPathSD = Environment.getExternalStorageDirectory().getAbsolutePath().toString();
        sPathSD = sPathSD.concat("/tfw_logs");
        log("sPathSD:"+sPathSD);
        boolean isCreated = oFile.write_file(sPathSD,"esto-es-un.log","some text "+ TheFramework.get_date14());
        log("is_created:"+String.valueOf(isCreated)+",timenow:"+currentTime.toString());
        alert(oFile.get_errors());
        log(oFile.get_errors());
    }

    protected void print()
    {
        File root0 = android.os.Environment.getExternalStorageDirectory();
        Log.d("root0",root0.toString());
        File root = this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        Log.d("root",root.toString());
    }

    protected void alert(String sText)
    {
        String sMsg = "[PRUEBAS] :".concat(sText);
        Toast.makeText(this,sMsg,Toast.LENGTH_LONG).show();
    }//alert

    protected void log(String sText)
    {
        Log.d("[PRUEBAS]",sText);
    }

}//Pruebas
