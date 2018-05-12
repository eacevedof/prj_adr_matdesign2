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

    public static String get_date14()
    {
        String sFormat = "yyyyMMddHHmmss";
        String sDateTime = get_date(sFormat);
        return sDateTime;
    }//get_date14(sFormat)

    public static String get_date8()
    {
        String sFormat = "yyyyMMdd";
        String sDateTime = get_date(sFormat);
        return sDateTime;
    }//get_date8(sFormat)

    public static String get_time()
    {
        String sFormat = "HHmmss";
        String sDateTime = get_date(sFormat);
        return sDateTime;
    }//get_time(sFormat)

    public static String get_timeu()
    {
        String sFormat = "HH:mm:ss";
        String sDateTime = get_date(sFormat);
        return sDateTime;
    }

}//TheFramework
