package com.lt.springboot_wx.other;

import java.math.BigDecimal;

/**
 *
 * 上下文 根据传入的支付类获取具体的实体类
 */
public class Context {
      private  Strategy strategy;

      public BigDecimal calRecharge(Integer channelId,Integer goodsId){
            return  strategy.CalRecharge(channelId,goodsId);
      }
}
