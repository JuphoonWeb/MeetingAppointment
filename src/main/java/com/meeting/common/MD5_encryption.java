package com.meeting.common;

import java.security.MessageDigest;

/**
 * Created by Administrator on 2017/8/10.
 */
public class MD5_encryption {

    public final static String MD5(String oldStr) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            // 参数oldStr表示要加密的字符串
            // 转换成字节流
            byte[] oldBytes = oldStr.getBytes();

            // 得到对象
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 初始化
            md.update(oldBytes);

            // 运行加密算法
            byte[] newBytes = md.digest();

            // 构造长度为2倍的字符串
            char newStr[] = new char[32];

            // 循环进行处理
            for (int i = 0; i < 16; i++) {
                byte tmp = newBytes[i];
                newStr[2 * i] = hexDigits[tmp >>> 4 & 0xf];
                newStr[2 * i + 1] = hexDigits[tmp & 0xf];
            }
            return new String(newStr);
        } catch (Exception e) {
            return null;
        }
    }
}