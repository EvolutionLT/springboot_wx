package com.lt.springboot_wx;

import com.lt.springboot_wx.util.MenuUtil;
import com.lt.springboot_wx.util.UploadUtil;
import com.lt.springboot_wx.util.WeiXinUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

@SpringBootApplication
public class SpringbootWxApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootWxApplication.class, args);


		String access_token = WeiXinUtil.getAccess_Token();
		System.out.println("调用成功access_token:"+access_token);
		String menu = MenuUtil.initMenu();		System.out.println(menu);
		int result = MenuUtil.createMenu(access_token,menu);
		if(result==0){
			System.out.println("菜单创建成功");
		}else{
			System.out.println("错误码"+result);
		}











	/*	String path="f:/1.png";
		try {
			String mediaId=UploadUtil.upload(path,access_token,"image");
			System.out.println(mediaId);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}*/

	}
}
