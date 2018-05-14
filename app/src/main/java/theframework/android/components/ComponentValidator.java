package theframework.android.components;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

public class ComponentValidator {

    private Context oContext;

    private ArrayList<String> arWarnings;
    private ArrayList<String> arErrors;
    private Boolean isError;


    public ComponentValidator(){
        arErrors = new ArrayList<String>();
    }
    public ComponentValidator(Context oContext){
        arErrors = new ArrayList<String>();
        this.oContext = oContext;
    }

    

    private void add_error(String sMessage){arErrors.add(sMessage);isError=true;}
    private void add_error(String sMessage,String sTitle){arErrors.add(sTitle+": "+sMessage);isError=true;}
    private void set_error(String sMessage){arErrors = new ArrayList<String>(); arErrors.add(sMessage);isError=true;}

    public boolean is_error(){return isError;}
    public String get_errors(){return arErrors.toString();}
    public void clear_errors(){arErrors = new ArrayList<String>();isError=false;}

    protected void log(String sValue){
        Log.d("[ComponentValidator]:",sValue);}
    protected void log(String sValue,String sTitle){Log.d("[ComponentValidator]:"+sTitle,sValue);}
    protected void log(Object oValue,String sTitle){Log.d("[ComponentValidator]:"+sTitle,oValue.toString());}    
}//ComponentValidator
