package com.lt.springboot_wx.other;

public class StrageryFactory {
      private  static  StrageryFactory factory=new StrageryFactory();

      public  StrageryFactory () {
                   }

                   public Strategy creator(){

                   }


public  StrageryFactory getInstance(){
                         return  factory;
}

}
