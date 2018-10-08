package com.lt.springboot_wx.other;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
    Contexts contexts =new Contexts();
    BigDecimal bigDecimal=contexts.calRecharge(1,1);
        System.out.println(bigDecimal);
    }

}
