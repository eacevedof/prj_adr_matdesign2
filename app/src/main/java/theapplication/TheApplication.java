package theapplication;

import android.content.Context;

import theframework.android.components.ComponentFile;


public class TheApplication {

    ComponentFile oFile;
    Context oContext;

    public TheApplication(Context oContext)
    {
        this.oContext = oContext;
        this.oFile = new ComponentFile(oContext);
        //sPackageName = oContext.getApplicationContext().getPackageName();
    }

    private void mkdir_logs()
    {
        String sPackageName = oContext.getApplicationContext().getPackageName();
        ComponentFile oFile = new ComponentFile(oContext);
        if(oFile.mkdir_sdcard(sPackageName))
        {

        }
    }

    public void bootstrap()
    {
        mkdir_logs();
    }
}//TheApplication
