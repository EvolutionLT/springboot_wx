package com.lt.springboot_wx.controller;

import com.lt.springboot_wx.util.CheckUtil;
import com.lt.springboot_wx.util.MessageUtil;
import com.lt.springboot_wx.util.TextMessageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
public class LoginController {
      @RequestMapping(value = "wx",method= RequestMethod.GET)
      public void login(HttpServletRequest request, HttpServletResponse response){
            String signature = request.getParameter("signature");
            String timestamp = request.getParameter("timestamp");
            String nonce = request.getParameter("nonce");
            String echostr = request.getParameter("echostr");
            PrintWriter out = null;
            try {
                  System.out.println("11111111111111111111111111111");
                  out = response.getWriter();
                  if(CheckUtil.checkSignature(signature, timestamp, nonce)){
                        out.write(echostr);
                  }
            } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
            }finally{
                  out.close();
            }

      }


      @RequestMapping(value = "wxdemo",method=RequestMethod.POST)
      public void dopost(HttpServletRequest request,HttpServletResponse response){
            response.setCharacterEncoding("utf-8");
            PrintWriter out = null;
            //将微信请求xml转为map格式，获取所需的参数
            Map<String,String> map = MessageUtil.xmlToMap(request);
            String ToUserName = map.get("ToUserName");
            String FromUserName = map.get("FromUserName");
            String MsgType = map.get("MsgType");
            String Content = map.get("Content");

            String message = null;
            //处理文本类型，实现输入1，回复相应的封装的内容
            if("text".equals(MsgType)){
                  if("1".equals(Content)){
                        TextMessageUtil textMessage = new TextMessageUtil();
                        message = textMessage.initMessage(FromUserName, ToUserName);
                  }
            }
            try {
                  out = response.getWriter();
                  out.write(message);
            } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
            }
            out.close();
      }


}
