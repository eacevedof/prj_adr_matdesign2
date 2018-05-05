package es.theframework.matdesign;

import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

//AppCompatActivity: Base class for activities that use the support library action bar features.
public class Pruebas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas);
        checkExternalMedia();
        //paths();
        mkdir_sdcard();
        //mkdir_sdcard2();
        //mkdir_sdcard3();
    }//onCreate

    private void mkdir_sdcard()
    {
        alert("mkdir_sdcard");
        //esta ha funcionado, creando en: /sdcard/Android/data/<app-folder>/files/<la-carpeta>
        //es equivalente a:/storage/emulated/0/Android/data/es.theframework.matdesign/files/agua123
        //String sPathFolder = this.getExternalFilesDir("ppe").toString();
        String sPathFolder = Environment.getExternalStorageDirectory().getAbsolutePath()+"/aguaxxx";
        //String sPathFolder = Environment.getExternalStorageDirectory()+"/aguaxxx";
        File oFolder = new File(sPathFolder);
        boolean isCreated = oFolder.mkdir();
        Log.d("mkdir_sdcard 1",String.valueOf(isCreated));
        if(oFolder.isDirectory())
            Log.d("mkdir_sdcard 2","dir created");
    }

    private void mkdir_sdcard3()
    {
        File oFile;
        Log.d("mkdir_sdcard3","calling getAlbumStorageDir");
        if(has_app_storage_perm()) {
            if (isExternalStorageReadable())
                Log.d("mkdir_sdcard3", "readable");
            if (isExternalStorageWritable())
                oFile = getAlbumStorageDir("mi-album");
            else
                Log.e("mkdir_sdcard3", "sdcard no writable");
        }
        else
            Log.e("mkdir_sdcard3","storage perm not enabled");
    }//mkdir_sdcard3

    public boolean has_app_storage_perm()
    {
        if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            Log.v("has_app_storage_perm","Permission is granted");
            //File write logic here
            return true;
        }
        return false;
    }
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        Log.d("isExternalStorageWritable.state",state);
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    public boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        Log.d("isExternalStorageReadable.state",state);
        if (Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return true;
        }
        return false;
    }

    public File getAlbumStorageDir(String albumName) {
        // Get the directory for the user's public pictures directory.
        File file = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES), albumName);
        if (!file.mkdirs()) {
            Log.e("getAlbumStorageDir", "Directory not created");
        }
        return file;
    }

    private void mkdir_sdcard2()
    {
        alert("mkdir_sdcard2");
        String sPathFolder = "/storage/emulated/0/vaya";
        sPathFolder = "/aaa_bbb";
        File oFolder = new File(sPathFolder);
        boolean isCreated = oFolder.mkdir();
        Log.d("mkdir_sdcard2 1",String.valueOf(isCreated));
        if(oFolder.isDirectory())
            Log.d("mkdir_sdcard2 2","dir created");

        Log.d("mkdir_sdcard2 3",sPathFolder);
    }


    private void mkdir_prv()
    {

    }

    protected void paths()
    {
        //Documents
        Log.d("Enviroment.DIRECTORY_DOCUMENTS",Environment.DIRECTORY_DOCUMENTS);
        ///storage/emulated/0
        Log.d("Enviroment.getExternalStorageDirectory",Environment.getExternalStorageDirectory().toString());

        Log.d("context.getExternalMediaDirs()",this.getExternalMediaDirs().toString());
        File oFileDir = this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        //storage/emulated/0/Android/data/es.theframework.matdesign/files/Documents
        Log.d("oFileDir.toString",oFileDir.toString());
        ///data/user/0/es.theframework.matdesign/files
        Log.d("internal.storage",this.getFilesDir().toString());
        ///storage/emulated/0/DCIM
        Log.d("Enviroment.getExternalStoragePublicDirectory.DIRECTORY_DCIM",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString());
        boolean isCreated = oFileDir.mkdirs();
        Log.d("APP","isCreated:"+isCreated);
        ///storage/emulated/0/Android/data/es.theframework.matdesign/files/Documents/aaaa
        File oFile = new File(oFileDir, "myData.txt");
        Log.d("oFile.mydata.txt",oFile.toString());
    }

    private void checkExternalMedia() {
        boolean mExternalStorageAvailable = false;
        boolean mExternalStorageWriteable = false;
        String state = Environment.getExternalStorageState();

        if (Environment.MEDIA_MOUNTED.equals(state)) {
            // Can read and write the media
            mExternalStorageAvailable = mExternalStorageWriteable = true;
        } else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            // Can only read the media
            mExternalStorageAvailable = true;
            mExternalStorageWriteable = false;
        } else {
            // Can't read or write
            mExternalStorageAvailable = mExternalStorageWriteable = false;
        }
        Log.d("checkExternalMedia","\n\nEXTERNAL MEDIA: readable="
                + mExternalStorageAvailable + " writable=" + mExternalStorageWriteable);
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
    }//log
}//Pruebas
