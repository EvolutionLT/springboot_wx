package com.lt.springboot_wx.controller;

import com.lt.springboot_wx.util.CheckUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginController {
      @RequestMapping(value = "wx",method= RequestMethod.GET)
      public void login(HttpServletRequest request, HttpServletResponse response){
            System.out.println("success");
            String signature = request.getParameter("signature");
            String timestamp = request.getParameter("timestamp");
            String nonce = request.getParameter("nonce");
            String echostr = request.getParameter("echostr");
            PrintWriter out = null;
            try {
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

}
