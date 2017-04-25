package com.lvshun.util;

import java.util.UUID;

/**
 * Created by Matthew on 2017/2/17 0017.
 */
public class UUIDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }
}
