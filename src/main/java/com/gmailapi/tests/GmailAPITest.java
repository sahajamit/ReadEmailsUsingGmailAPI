package com.gmailapi.tests;

import java.util.List;
import java.util.Map;

public class GmailAPITest {

	public static void main(String[] args) {
        try{
//            System.out.println("Hello World");
            GmailAPI obj = new GmailAPI();
            String base_dir = System.getProperty("user.dir");
            System.setProperty("GmailAPI.ClientSecretJson.Path",base_dir + "/tools/client_secret.json");
            System.setProperty("webdriver.chrome.driver",base_dir + "/tools/ChromeDriver/chromedriver");
            obj.Authenticate("sftestautomation01@gmail.com","password");
            List<Map<String,String>> EmailList = obj.ReadEmail(5);
        }catch(Exception e){
            e.printStackTrace();
        }
	}

}
