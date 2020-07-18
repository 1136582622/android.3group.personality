package com.threegroup.android3grouppersonality.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class utils {
    public static boolean isPhone(String inputText) {
        Pattern p = Pattern.compile("^((14[0-9])|(13[0-9])|(15[0-9])|(18[0-9])|(17[0-9]))\\d{8}$");
        Matcher m = p.matcher(inputText);
        return m.matches();
    }
    /**
     * 32位MD5加密
     * @param str 待加密字符串
     * @return 32位MD5加密字符串
     * @throws NoSuchAlgorithmException
     */
    public static String UseMD5(String str) throws NoSuchAlgorithmException {
        MessageDigest md=MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        BigInteger bigInteger=new BigInteger(1, md.digest());
        return bigInteger.toString(16);
    }

}
