package theapplication;

import android.content.Context;

import java.io.StringReader;
import java.util.ArrayList;

import theframework.android.components.ComponentFile;


public class TheApplication {

    ComponentFile oFile;
    Context oContext;
    private ArrayList<String> arErrors;
    private Boolean isError;

    public TheApplication(Context oContext)
    {
        this.oContext = oContext;
        this.oFile = new ComponentFile(oContext);
        //sPackageName = oContext.getApplicationContext().getPackageName();
    }

    private void mkdir_logs()
    {
        ArrayList<String> arFolders = new ArrayList<String>();
        arFolders.add("custom");
        arFolders.add("debug");
        arFolders.add("errors");
        arFolders.add("session");
        arFolders.add("queries");
        arFolders.add("shellscripts");
        arFolders.add("emails");

        String sPackageName = oContext.getApplicationContext()
                                .getPackageName()
                                .concat("/logs");
        ComponentFile oFile = new ComponentFile(oContext);

        String sPathFolder;
        Boolean isCreated;
        for (String sFolder : arFolders ){
            sPathFolder = sPackageName+"/"+sFolder;
            if(!oFile.is_dir(sPathFolder)) {
                isCreated = oFile.mkdir_sdcard(sPathFolder);
                if(!isCreated || oFile.is_error())
                    add_error("mkdir_logs:"+oFile.get_errors());
            }
        }

    }//mkdir_logs

    private void mkdir_backup()
    {
        String sPackageName = oContext.getApplicationContext().getPackageName();
        ComponentFile oFile = new ComponentFile(oContext);
        if(oFile.mkdir_sdcard())
    }

    public void bootstrap()
    {
        mkdir_logs();
        mkdir_backup();
    }

    private void add_error(String sMessage){arErrors.add(sMessage);isError=true;}
    private void add_error(String sMessage,String sTitle){arErrors.add(sTitle+": "+sMessage);isError=true;}
    private void set_error(String sMessage){arErrors = new ArrayList<String>(); arErrors.add(sMessage);isError=true;}

    public boolean is_error(){return isError;}
    public String get_errors(){return arErrors.toString();}
    public void clear_errors(){arErrors = new ArrayList<String>();isError=false;}

}//TheApplication
