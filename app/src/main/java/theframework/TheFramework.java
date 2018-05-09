package theframework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TheFramework
{
    public void TheFramework(){
        ;
    }//constructor

    public static String get_date(String sFormat)
    {
        DateFormat oDateF = new SimpleDateFormat(sFormat);
        String sDateTime = oDateF.format(new Date());
        return sDateTime;
    }//get_date(sFormat)

    public static String get_date()
    {
        String sFormat = "yyyyMMddHHmmss";
        String sDateTime = get_date(sFormat);
        return sDateTime;
    }//get_date(sFormat)


}//TheFramework
