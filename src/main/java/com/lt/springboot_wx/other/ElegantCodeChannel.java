package com.lt.springboot_wx.other;

import java.math.BigDecimal;

public class ElegantCodeChannel {
      private Integer payChannelId;
      private String name;
      private BigDecimal discount;
      private Integer position;
      private Integer correct;
      private String code;
      private String status;

      public ElegantCodeChannel() {
      }


      @Override
      public String toString() {
            return "ElegantCodeChannel{" +
                    "payChannelId=" + payChannelId +
                    ", name='" + name + '\'' +
                    ", discount=" + discount +
                    ", position=" + position +
                    ", correct=" + correct +
                    ", code='" + code + '\'' +
                    ", status='" + status + '\'' +
                    '}';
      }

      public Integer getPayChannelId() {
            return payChannelId;
      }

      public void setPayChannelId(Integer payChannelId) {
            this.payChannelId = payChannelId;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public BigDecimal getDiscount() {
            return discount;
      }

      public void setDiscount(BigDecimal discount) {
            this.discount = discount;
      }

      public Integer getPosition() {
            return position;
      }

      public void setPosition(Integer position) {
            this.position = position;
      }

      public Integer getCorrect() {
            return correct;
      }

      public void setCorrect(Integer correct) {
            this.correct = correct;
      }

      public String getCode() {
            return code;
      }

      public void setCode(String code) {
            this.code = code;
      }

      public String getStatus() {
            return status;
      }

      public void setStatus(String status) {
            this.status = status;
      }
}
