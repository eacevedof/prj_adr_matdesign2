package theframework.android.components;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

/**
 * ComponentFile 1.1.0
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
    }//mkdir_sdcard1

    //internal storage
    public boolean mkdir_app(String sFolder)
    {
        File oFile = new File(oContext.getFilesDir(),sFolder);
        if(oFile.isDirectory())
            add_error("Folder: "+sFolder+" already exists");
        else
        {
            boolean isCreated = oFile.mkdir();
            if(isCreated)
                return true;
            else
                add_error("Folder: "+sFolder+" not created");
        }
        return false;
    }//mkdir_app1

    //internal storage
    public boolean mkdir_app(String sFolder,Context oContext)
    {
        File oFile = new File(oContext.getFilesDir(),sFolder);
        if(oFile.isDirectory())
            add_error("Folder: "+sFolder+" already exists");
        else
        {
            boolean isCreated = oFile.mkdir();
            if(isCreated)
                return true;
            else
                add_error("Folder: "+sFolder+" not created");
        }
        return false;
    }//mkdir_app2

    protected boolean is_extstore_permitted(Context oContext)
    {
        if(oContext.checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            //File write logic here
            return true;
        return false;
    }//is_extstore_permitted

    protected boolean is_extstore_permitted()
    {
        if(oContext.checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            return true;
        return false;
    }//is_external_permitted

    protected boolean is_extstore_writable()
    {
        String sState = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(sState))
            return true;
        return false;
    }//is_extstore_writable

    protected boolean is_extstore_readable() {
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
            OutputStreamWriter oStreamOut = new OutputStreamWriter(oContext.openFileOutput("config.txt", MODE_PRIVATE));
            oStreamOut.write(sData);
            oStreamOut.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }//write

    public void write_file(String sData)
    {
        //https://stackoverflow.com/questions/1239026/how-to-create-a-file-in-android
        try {
            // catches IOException below
            final String TESTSTRING = new String("Hello Android");

            /* We have to use the openFileOutput()-method
             * the ActivityContext provides, to
             * protect your file from others and
             * This is done for security-reasons.
             * We chose MODE_WORLD_READABLE, because
             *  we have nothing to hide in our file */
            FileOutputStream fOut = oContext.openFileOutput("samplefile.txt",
                    MODE_PRIVATE);
            OutputStreamWriter osw = new OutputStreamWriter(fOut);

            // Write the string to the file
            osw.write(TESTSTRING);

            /* ensure that everything is
             * really written out and close */
            osw.flush();
            osw.close();

            //Reading the file back...

            /* We have to use the openFileInput()-method
             * the ActivityContext provides.
             * Again for security reasons with
             * openFileInput(...) */

            FileInputStream fIn = oContext.openFileInput("samplefile.txt");
            InputStreamReader isr = new InputStreamReader(fIn);

            /* Prepare a char-Array that will
             * hold the chars we read back in. */
            char[] inputBuffer = new char[TESTSTRING.length()];
            // Fill the Buffer with sString from the file
            isr.read(inputBuffer);
            // Transform the chars to a String
            String readString = new String(inputBuffer);

            // Check if we read back the same chars that we had written out
            boolean isTheSame = TESTSTRING.equals(readString);
            Log.i("File Reading stuff", "success = " + isTheSame);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }//write_file

    public boolean writeToFile(String sPathDir, String sFileName, String sString )
    {
        //https://stackoverflow.com/questions/14872429/append-text-to-the-end-of-the-file
        File oFile;
        OutputStreamWriter oStreamW = null;
        FileOutputStream oStreamOut = null;

        try{
            oFile = new File(new File(sPathDir), sFileName);
            if(!oFile.exists()) {
                boolean isCreated = oFile.createNewFile();
                if(!isCreated) {
                    add_error("File " + sFileName + " not created");
                    return false;
                }
            }
            oStreamOut = new FileOutputStream(oFile, true);
            oStreamW = new OutputStreamWriter(oStreamOut);
            oStreamW.append(sString);
            oStreamW.flush();
            return true;
        }
        catch (IOException oEx)
        {
            oEx.printStackTrace();
        }
        return false;
    }//writeFile

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


