package theframework.android.components;
import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import theframework.TheFramework;

/**
 * ComponentLog 1.0.0
 */
public class ComponentLog {

    private String sPublicPath;
    private String sType;
    private String sPathDir;
    private String sName;
    private Context oContext;

    private ArrayList<String> arWarnings;
    private ArrayList<String> arErrors;
    private Boolean isError;

    //public static properties {}

    public void ComponentLog(Context oContext){
        //video28 - 0:31
        sPathDir = "";
        //this.sType = sType;
        isError = false;
        arErrors = new ArrayList<String>();
        this.oContext = oContext;
        sPublicPath = oContext.getApplicationContext().getPackageName();
    }//ComponentLog
    
    public void ComponentLog(Context oContext,String sPathDir)
    {
        isError = false;
        arErrors = new ArrayList<String>();
        this.sPathDir = sPathDir;
        this.oContext = oContext;
    }//ComponentLog 2

    public void write(String sValue)
    {
        ComponentFile oFile = new ComponentFile(oContext);
        String sPathDir = sPublicPath +"/"+sType;
        String sFileName = sType + "_"+ TheFramework.get_date8()+".log";
        String sTimeUsr = "["+TheFramework.get_timeu()+"] ";
        if(oFile.is_dir(sPathDir))
            oFile.write_file(sPathDir,sFileName,sTimeUsr+sValue);
    }//write(string)


    public void write(Object oValue)
    {
        String sValue = oValue.toString();
        ComponentFile oFile = new ComponentFile(oContext);
        String sPathDir = sPublicPath +"/"+sType;
        String sFileName = sType + "_"+ TheFramework.get_date8()+".log";
        String sTimeUsr = "["+TheFramework.get_timeu()+"] ";
        
        if(oFile.is_dir(sPathDir))
            oFile.write_file(sPathDir,sFileName,sTimeUsr+sValue);
    }//write(object)

    public void write(String sValue,String sType)
    {
        ComponentFile oFile = new ComponentFile(oContext);
        String sPathDir = sPublicPath +"/"+sType;
        String sFileName = sType + "_"+ TheFramework.get_date8()+".log";
        String sTimeUsr = "["+TheFramework.get_timeu()+"] ";

        if(oFile.is_dir(sPathDir))
            oFile.write_file(sPathDir,sFileName,sTimeUsr+sValue);
    }//write(sValue,sType)

    public void custom(String sValue){write(sValue,"custom");}
    public void debug(String sValue){write(sValue,"debug");}
    public void emails(String sValue){write(sValue,"emails");}
    public void errors(String sValue){write(sValue,"errors");}
    public void queries(String sValue){write(sValue,"queries");}
    public void session(String sValue){write(sValue,"session");}
    public void shellscripts(String sValue){write(sValue,"shellscripts");}

    public void set_type(String sValue){this.sType = sValue;}

    private void add_error(String sMessage){arErrors.add(sMessage);isError=true;}
    private void add_error(String sMessage,String sTitle){arErrors.add(sTitle+": "+sMessage);isError=true;}
    private void set_error(String sMessage){arErrors = new ArrayList<String>(); arErrors.add(sMessage);isError=true;}

    public boolean is_error(){return isError;}
    public String get_errors(){return arErrors.toString();}
    public void clear_errors(){arErrors = new ArrayList<String>();isError=false;}

    protected void log(String sValue){Log.d("[ComponentLog]:",sValue);}
    protected void log(String sValue,String sTitle){Log.d("[ComponentLog]:"+sTitle,sValue);}
    protected void log(Object oValue,String sTitle){Log.d("[ComponentLog]:"+sTitle,oValue.toString());}

}//ComponentLog


