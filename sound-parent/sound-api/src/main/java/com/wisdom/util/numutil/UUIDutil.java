package com.wisdom.util.numutil;


import sun.security.provider.MD5;

import java.util.UUID;

/**
 * @program: sound
 * @package: com.wisdom.weixinapp.sound.utils.numberUtil
 * @description: www.wisdom.com
 * @author: liuwisdom
 * @create: 2022-01-24 10:51
 * @company: PJ chain
 **/
public class UUIDutil {

    /**
     * 功能描述 :获取32位的UUID
     * 参数 :[] :
     * @return java.lang.String
     * @date  2022/1/24
     * @author  liuwisdom
     */
    public  static String  getUUID(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(UUIDutil.getUUID());
    }

}
