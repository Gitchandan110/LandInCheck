package com.PageObject.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.CommonUtils.File.Base;

public class LendIn_MerchantApplicationListPL extends Base {

	public WebElement txtSearchMerchant() {

		try {
			By Merchant = By.xpath("//input[@id='merchant'][@type='text']");

			return driver.findElement(Merchant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement ddIndustry() {

		try {
			By Industry = By.xpath("//select[@id='industry']");

			return driver.findElement(Industry);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	

	public WebElement ddAutomobilesIndustry() {

		try {
			By Construction = By.xpath("//select//option[contains(text(),'Automobiles')]");

			return driver.findElement(Construction);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement ddConstructionIndustry() {

		try {
			By Construction = By.xpath("//select//option[contains(text(),'Construction')]");

			return driver.findElement(Construction);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement ddPublishingIndustry() {

		try {
			By Publishing = By.xpath("//select//option[contains(text(),'Publishing')]");

			return driver.findElement(Publishing);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement BtnSearch() {

		try {
			By search = By.xpath("//button[@type='submit' and text()='Search']");

			return driver.findElement(search);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public WebElement pageSize() {

		try {
			By pageSize = By.xpath("//select[@name='pageSize']");

			return driver.findElement(pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
