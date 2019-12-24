package com.PageObject.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.CommonUtils.File.Base;


public class LendIn_SignInPL extends Base{
	
	
	public WebElement txtUserName() {
		
		try {
			By userName=By.xpath("//input[@id='userName'][@type='text']");
			return driver.findElement(userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	
     public WebElement Password() {
    	 
    	 try {
			By password=By.xpath("//input[@id='userPassword'][@type='password']");
			 return driver.findElement(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	 
     }
     
     
     
     public WebElement BtnSignIn() {
    	 
    	 try {
			By btnSignIn = By.xpath("//button[@type='submit' and text()='Sign In']");
			 
			 return driver.findElement(btnSignIn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	 
     }
     

      
     
     

     
}
