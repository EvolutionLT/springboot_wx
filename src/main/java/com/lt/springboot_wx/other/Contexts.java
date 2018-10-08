package com.lt.springboot_wx.other;

import java.math.BigDecimal;

/**
 *
 * 上下文 根据传入的支付类获取具体的实体类
 */
public class Contexts {
      private  Strategy strategy;
      public BigDecimal calRecharge(Integer channelId,Integer goodsId)  {
            //根据传入的类型去生成对应的类
            StrageryFactory  strageryFactory=StrageryFactory.getInstance();
            try {
                  strategy =strageryFactory.create(channelId);
            } catch (IllegalAccessException e) {
                  e.printStackTrace();
            } catch (InstantiationException e) {
                  e.printStackTrace();
            }
            return  strategy.CalRecharge(channelId,goodsId);
      }


}