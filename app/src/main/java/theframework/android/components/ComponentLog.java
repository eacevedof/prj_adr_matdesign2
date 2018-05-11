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

/**
 * ComponentLog 1.0.0
 */
public class ComponentLog {

    private String sType;
    private String sPathDir;
    private String sName;
    private Context oContext;

    private ArrayList<String> arWarnings;
    private ArrayList<String> arErrors;
    private Boolean isError;

    public void ComponentLog(Context oContext){
        //video28 - 0:31
        sPathDir = "";
        //this.sType = sType;
        isError = false;
        arErrors = new ArrayList<String>();
        this.oContext = oContext;
    }//ComponentLog
    
    public void ComponentLog(Context oContext,String sPathDir)
    {
        isError = false;
        arErrors = new ArrayList<String>();
        this.sPathDir = sPathDir;
        this.oContext = oContext;
    }//ComponentLog 2

    

    public void set_type(String sValue){this.sType = sValue;}
    public void set_path(String sValue){this.sType = sValue;}

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


