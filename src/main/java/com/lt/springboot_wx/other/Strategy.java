package com.lt.springboot_wx.other;

import java.math.BigDecimal;

public interface Strategy {
      /**
       * 计算支付金额 通过渠道ID和商品ID 调用各自银行的报文进行封装
       * @param channelId
       * @param goodsId
       * @return
       */
      BigDecimal CalRecharge(Integer channelId,Integer goodsId);



}
