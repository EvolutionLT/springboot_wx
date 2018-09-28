package com.lt.springboot_wx.other;

import java.math.BigDecimal;
@Pay(1)
public class ICBCPay  implements  Strategy{
      @Override
      public BigDecimal CalRecharge(Integer channelId, Integer goodsId) {
            BigDecimal   b1   =   new   BigDecimal(Double.toString(0.98));
            ElegantCodeChannel elegantCodeChannel=new ElegantCodeChannel();
            elegantCodeChannel.setName("工商银行");
            elegantCodeChannel.setCorrect(1);
            elegantCodeChannel.setDiscount(b1);
            if(elegantCodeChannel!=null ){
                  return elegantCodeChannel.getDiscount().multiply(BigDecimal.valueOf(elegantCodeChannel.getCorrect()));
            }

            return null;
      }
}
