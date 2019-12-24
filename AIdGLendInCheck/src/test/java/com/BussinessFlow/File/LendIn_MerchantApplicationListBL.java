package com.BussinessFlow.File;

import java.io.IOException;

import com.CommonUtils.File.Base;
import com.CommonUtils.File.ExcelUtils;
import com.PageObject.File.LendIn_MerchantApplicationListPL;

public class LendIn_MerchantApplicationListBL extends LendIn_MerchantApplicationListPL {

	String InputDataSheet = "TestData";

	public void verifySearchMerchantByName() throws InterruptedException {

		try {
			if (txtSearchMerchant() != null && txtSearchMerchant().isDisplayed()) {
				txtSearchMerchant().clear();
				txtSearchMerchant().sendKeys(ExcelUtils.ReadExcel(InputDataSheet, 1, 0));
				Base.highLightElement(driver, BtnSearch());
				BtnSearch().click();
				Thread.sleep(5000);
				Base.takeScreenShot("SearchMerchantByName");
				Base.scrolltoElement(driver,  pageSize());
				Base.takeScreenShot("SearchMerchantByName");
				Thread.sleep(5000);
				txtSearchMerchant().clear();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void verifySearchMerchantByIndustry() throws InterruptedException {

		try {
			if (ddIndustry() != null && ddIndustry().isDisplayed()) {
				ddIndustry().click();
				ddConstructionIndustry().click();
				Thread.sleep(5000);
				BtnSearch().click();
				Base.scrolltoElement(driver,  pageSize());
				Base.takeScreenShot("SearchMerchantByIndustry");
				Base.scrolltoElement(driver,  ddIndustry());
				ddIndustry().click();
				ddAutomobilesIndustry().click();
				Thread.sleep(5000);
				BtnSearch().click();
				Base.scrolltoElement(driver,  pageSize());
				Base.takeScreenShot("SearchMerchantByIndustry");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
