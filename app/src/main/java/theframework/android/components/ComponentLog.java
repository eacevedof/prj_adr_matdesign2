package theframework.android.components;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComponentLog {

    private String sType;
    private String sFathFolder;
    private String sName;

    public void ComponentLog(){
        //video28 - 0:31
        set_type(sType);
        set_path("/data/data/<nombre-paquete>/files");
    }//ComponentLog

    public void write() {
        try {
            InputStreamReader oStreamR = new InputStreamReader(openFileInput("bitacora.txt"));
            BufferedReader oBuffR = new BufferedReader(oStreamR);
            String sLinea = oBuffR.readLine();
        }
        catch (IOException oEx)
        {

        }
    }

    public void set_type(String sValue){this.sType = sValue;}
    public void set_path(String sValue){this.sType = sValue;}

}//ComponentLog


