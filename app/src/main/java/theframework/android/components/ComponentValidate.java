package theframework.android.components;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

public class ComponentValidate {

    private Context oContext;

    private ArrayList<String> arWarnings;
    private ArrayList<String> arErrors;
    private Boolean isError;


    public ComponentValidate(){
        arErrors = new ArrayList<String>();
    }
    public ComponentValidate(Context oContext){
        arErrors = new ArrayList<String>();
        this.oContext = oContext;
    }

    public boolean is_date(String sValue){
        boolean isReturn = false;
        //eliminar separadores, espacio, -, / :
        //comprobar que tenga o 14 o 8 de long
        //que sean numeros

        return isReturn;
    }

    public boolean is_datetime(String sValue)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_len(String sValue)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_lenmin(String sValue,int iMin)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_lenmax(String sValue,int iMax)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_string(String sValue)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_integer(String sValue)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_float(String sValue)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_float(String sValue,char cDec)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_pattern(String sPattern,String sValue)
    {
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_boolean(String sValue)
    {
        //trata: yes/no, true,false, 0,1, Y/N, T/F
        boolean isReturn = false;
        return  isReturn;
    }

    public boolean is_empty(String sValue)
    {
        boolean isReturn = false;
        return  isReturn;
    }



    /*
    validaciones:
        tipo
        long minima
        long max
        long fija
        obligatorio
        patron x
        similar
        contiene
        coincide may y minus
        otros:
            email
            telefono
            dni
            pais

    */

    private void add_error(String sMessage){arErrors.add(sMessage);isError=true;}
    private void add_error(String sMessage,String sTitle){arErrors.add(sTitle+": "+sMessage);isError=true;}
    private void set_error(String sMessage){arErrors = new ArrayList<String>(); arErrors.add(sMessage);isError=true;}

    public boolean is_error(){return isError;}
    public String get_errors(){return arErrors.toString();}
    public void clear_errors(){arErrors = new ArrayList<String>();isError=false;}

    protected void log(String sValue){
        Log.d("[ComponentValidate]:",sValue);}
    protected void log(String sValue,String sTitle){Log.d("[ComponentValidate]:"+sTitle,sValue);}
    protected void log(Object oValue,String sTitle){Log.d("[ComponentValidate]:"+sTitle,oValue.toString());}    
}//ComponentValidate
