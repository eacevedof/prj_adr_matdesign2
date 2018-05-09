package theframework.android.components;

import android.content.Context;

public class  Android {

    public static String sPackageName;

    public Android(Context oContext)
    {
        sPackageName = oContext.getApplicationContext().getPackageName();
    }


}
