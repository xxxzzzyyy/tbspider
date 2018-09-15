package com.megvii.dzh.spider.utils;

public class URLGeneratedUtil {

    public final static String PREFIX = "http://tieba.baidu.com";

    public final static String HTTP="http:";
    
    public static String generatePostURL(String url) {
        return PREFIX + url;
    }
    
    public static String generateHttpURL(String url) {
        return HTTP + url;
    }
}
