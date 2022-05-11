package com.text.mining.allergyapi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtils {

    public static String logExecutionTime(){
        return (new SimpleDateFormat("HH:mm:ss:SSS")).format(new Date(System.currentTimeMillis()));
    }

}
