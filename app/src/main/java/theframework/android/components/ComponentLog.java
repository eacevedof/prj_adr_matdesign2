package theframework.android.components;
import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ComponentLog 1.0.0
 */
public class ComponentLog {

    private String sType;
    private String sFathFolder;
    private String sName;

    public void ComponentLog(){
        //video28 - 0:31
        set_type(sType);
        set_path("/sData/sData/<nombre-paquete>/files");
    }//ComponentLog

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
    
    private String readFromFile(Context oContext) {

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
    }//readFromFile
    
    public void set_type(String sValue){this.sType = sValue;}
    public void set_path(String sValue){this.sType = sValue;}

}//ComponentLog


