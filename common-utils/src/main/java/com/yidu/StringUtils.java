package com.yidu;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/13.
 */
public class StringUtils {

    public  static java.util.List<String> splitString2List(String str){
        return Arrays.asList(str.split(","));
    }
}
