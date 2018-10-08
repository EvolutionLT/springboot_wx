package com.lt.springboot_wx.other;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Set;

public class StrageryFactory {
      private  static  StrageryFactory factory=new StrageryFactory();

      public static HashMap<Integer,String> source_map = new HashMap<>();

      static {
            //根据注解解析出来  存放至Map中 key 就是注解的值  value 就是  com.lt.springboot_wx.other.pay.ICBCPay
          Reflections reflections = new Reflections("com.lt.springboot_wx.other.pay");
          Set<Class<?>> classList=reflections.getTypesAnnotatedWith(Pay.class);
          for(Class clazz : classList){
              Pay t=(Pay)clazz.getAnnotation(Pay.class);
              source_map.put(t.value(),clazz.getCanonicalName());

          }
      }

      public  StrageryFactory () {
                   }

       public Strategy create(int channelId) throws IllegalAccessException, InstantiationException {
           String clazz=source_map.get(channelId);
           Class clazz_= null;
           try {
               clazz_ = Class.forName(clazz);
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
           return (Strategy) clazz_.newInstance();
                   }
                   public static  StrageryFactory getInstance(){
                         return  factory;
}

}
