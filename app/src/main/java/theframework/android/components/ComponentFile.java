package theframework.android.components;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * ComponentFile 1.0.0
 */
public class ComponentFile {

    private Context oContext;
    private String sType;
    private String sName;

    private ArrayList<String> arErrors;
    private Boolean isError;

    public ComponentFile(Context oContext){
        log("ComponentFile.constructor");
        isError = false;
        arErrors = new ArrayList<String>();
        this.oContext = oContext;
    }//ComponentFile

    //https://stackoverflow.com/questions/20369782/write-file-to-sdcard-in-android
    private void mkdir_generic(String sPathBase,String sFolder)
    {
        log("sPathBase:"+sPathBase+",sFolder:"+sFolder,"mkdir_generic");
        try{
            if(!sPathBase.isEmpty())
            {
                log("sPathBase:"+sPathBase, "ComponentFile.mkdir_generic");
                File oFile = new File(sPathBase, sFolder);
                //http://eagle.phys.utk.edu/guidry/android/writeSD.html
                if (!oFile.exists()) {
                    boolean isCreated = oFile.mkdir();
                    if (!isCreated) {
                        log("Folder "+sFolder+" not created","ComponentFile.mkdir_generic");
                        add_error("Folder " + sFolder + " not created", "ComponentFile.mkdir_generic");
                    }
                    else
                        log("Folder created " + sFolder, "ComponentFile.mkdir_generic");
                } else
                    log("Folder exists in:" + sPathBase + "/" + sFolder,"ComponentFile.mkdir_generic");
            }
            else
            {
                log("PathBase is empty","ComponentFile.mkdir_generic");
                add_error("Patbase is empty");
            }
        }
        catch (Exception oEx)
        {
            add_error(oEx.getMessage(),"ComponentFile.mkdir_generic");
            log(oEx.getMessage(),"ComponentFile.mkdir_generic.exeption");
        }
    }//mkdir_generic

    public void mkdir_sd(String sFolder)
    {
        //ej: /storage/emulated/0
        //sPathBase = Environment.getExternalStorageDirectory().getAbsolutePath();
        String sPathBase = Environment.getExternalStorageDirectory().toString();
        mkdir_generic(sPathBase,sFolder);
    }//mkdir0

    public boolean mkdir_sdcard(String sFolder)
    {
        if(is_extstore_permitted())
        {
            if(is_extstore_writable()) {
                String sPathFolder = Environment.getExternalStorageDirectory().getAbsolutePath()
                        +"/"+sFolder;
                File oFolder = new File(sPathFolder);
                if(oFolder.isDirectory())
                    add_error("Folder: "+sFolder+" already exists");
                else
                {
                    boolean isCreated = oFolder.mkdir();
                    if(!isCreated)
                        add_error("Folder: " + sFolder + " , not created!");
                    else
                        return true;
                }
            }
            else
                add_error("Check sdcard writable");
        }
        else
            add_error("Check sdcard app permission");
        return false;
    }//mkdir_sdcard

    public void mkdir_app(String sFolder,Context oContext)
    {
        //context.getDir("mydir", ...); This creates your.package/app_mydir/
        File oFile = oContext.getDir(sFolder, Context.MODE_PRIVATE);  //Don't do
        if(oFile.exists())
        {
            String sAppPath = "";
            try {
                sAppPath = get_app_path(oContext);
                log("sAppPath:"+sAppPath,"mkdir_app");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            log("folder "+ sFolder + " created in "+sAppPath,"mkdir_app");
        }
        //si no existe, es que no se ha podido crear
        else
            log("Folder "+sFolder+" exists","mkdir_app");
    }//mkdir_app

    public boolean is_extstore_permitted(Context oContext)
    {
        if(oContext.checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            //File write logic here
            return true;
        return false;
    }//is_extstore_permitted

    public boolean is_extstore_permitted()
    {
        if(oContext.checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            return true;
        return false;
    }//is_external_permitted

    public boolean is_extstore_writable()
    {
        String sState = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(sState))
            return true;
        return false;
    }//is_extstore_writable

    public boolean is_extstore_readable() {
        String state = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state))
            return true;
        return false;
    }//is_extstore_readable

    private String get_app_path(Context oContext) throws Exception
    {
        String sPath = "";
        PackageManager oPackMgr = oContext.getPackageManager();
        sPath = oPackMgr.getPackageInfo(oContext.getPackageName(),0)
                .applicationInfo.dataDir.toString();
        return sPath;
    }//get_app_path


    private void write(String sData,Context oContext) {
        try {
            OutputStreamWriter oStreamOut = new OutputStreamWriter(oContext.openFileOutput("config.txt", Context.MODE_PRIVATE));
            oStreamOut.write(sData);
            oStreamOut.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }//write
    
    private String read(Context oContext) {

        String sResult = "";

        try {
            InputStream oInStream = oContext.openFileInput("config.txt");

            if(oInStream != null){
                InputStreamReader oInStreamR = new InputStreamReader(oInStream);
                BufferedReader oBuffR = new BufferedReader(oInStreamR);
                String sLine = "";
                StringBuilder oStringBuild = new StringBuilder();

                while((sLine = oBuffR.readLine()) != null ){
                    oStringBuild.append(sLine);
                }

                oInStream.close();
                sResult = oStringBuild.toString();
            }
        }
        catch (FileNotFoundException oE) {
            sResult = "Error: file not found";
            Log.e("login activity", "File not found: " + oE.toString());
        } catch (IOException oE) {
            sResult = "Error: reading";
            Log.e("login activity", "Can not read file: " + oE.toString());
        }

        return sResult;
    }//read
    
    private void add_error(String sMessage){arErrors.add(sMessage);isError=true;}
    private void add_error(String sMessage,String sTitle){arErrors.add(sTitle+": "+sMessage);isError=true;}
    private void set_error(String sMessage){arErrors = new ArrayList<String>(); arErrors.add(sMessage);isError=true;}

    public boolean is_error(){return isError;}
    public String get_errors(){return arErrors.toString();}

    protected void log(String sValue){Log.d("[**APP**]:",sValue);}
    protected void log(String sValue,String sTitle){Log.d("[**APP**]:"+sTitle,sValue);}
    protected void log(Object oValue,String sTitle){Log.d("[**APP**]:"+sTitle,oValue.toString());}

}//ComponentFile


