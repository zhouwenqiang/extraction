package com.example.common.encrypt;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class KEYGeneration {
    /**
     * 随机生成秘钥
     */
    public static void getKey(){
        try {

            KeyGenerator kg = KeyGenerator.getInstance("AES");
            kg.init(128);//要生成多少位，只需要修改这里即可128, 192或256

            SecretKey sk = kg.generateKey();
            byte[] b = sk.getEncoded();
            String s = byteToHexString(b);
            System.out.println(s);
            System.out.println("十六进制密钥长度为"+s.length());
            System.out.println("二进制密钥的长度为"+s.length()*4);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("没有此算法。");
        }
    }

    /**
     * 使用指定的字符串生成秘钥
     */
    public static void getKeyByPass(String key){
        //生成秘钥

        try {
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(key.getBytes());
            KeyGenerator kg = KeyGenerator.getInstance("AES");
            // kg.init(128);//要生成多少位，只需要修改这里即可128, 192或256
            //SecureRandom是生成安全随机数序列，password.getBytes()是种子，只要种子相同，序列就一样，所以生成的秘钥就一样。
            kg.init(256, random);
            SecretKey sk = kg.generateKey();
            byte[] b = sk.getEncoded();
            String s = byteToHexString(b);
            System.out.println(s);
            System.out.println("十六进制密钥长度为"+s.length());
            System.out.println("二进制密钥的长度为"+s.length()*4);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("没有此算法。");
        }
    }

    /**
     * byte数组转化为16进制字符串
     * @param bytes
     * @return
     */
    public static String byteToHexString(byte[] bytes){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            String strHex=Integer.toHexString(bytes[i]);
            if(strHex.length() > 3){
                sb.append(strHex.substring(6));
            } else {
                if(strHex.length() < 2){
                    sb.append("0" + strHex);
                } else {
                    sb.append(strHex);
                }
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        getKey();
        System.out.println("---------------------");

        getKeyByPass("schzh@rs");

        String p="{\"name\":\"测试名称\",\"pad\":\"zhsc@admin\"}";
        String a= AESUtil.getInstance().encode("{\"name\":\"测试名称\",\"pad\":\"zhsc@admin\"}","19446d5c3669eb10482d44b88e3da07c6a98625b60aac5ead40831e929fa44ab");
        System.out.println("-----加密------"+a);
        String b=AESUtil.getInstance().decode(a,"19446d5c3669eb10482d44b88e3da07c6a98625b60aac5ead40831e929fa44ab");
        System.out.println("-----解密------"+b);
        System.out.println("-----加密的字符串------"+p);
    }
}
