package com.BussinessFlow.File;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;

import com.CommonUtils.File.Base;
import com.CommonUtils.File.ExcelUtils;
import com.CommonUtils.File.ExcelWrite;
import com.PageObject.File.LendIn_SignInPL;

public class LandIn_SignInBL extends LendIn_SignInPL {

	String InputDataSheet = "Login";
	String SanitySheet = "TS_LandInCheck";

	public void loginBroker() throws IOException {

		try {
			if (txtUserName() != null && txtUserName().isDisplayed()) {
				txtUserName().sendKeys(ExcelUtils.ReadExcel(InputDataSheet, 1, 2));
				System.out.println("User is:" + ExcelUtils.ReadExcel(InputDataSheet, 1, 2));
			}

			else {
				System.out.println("txtUserName not entered");
			}
			if (Password().isDisplayed()) {
				Password().sendKeys(ExcelUtils.ReadExcel(InputDataSheet, 1, 3));
				System.out.println("Password entered");

			}

			else {

				System.out.println("Password not entered");
			}

			if (BtnSignIn().isDisplayed()) {
				Base.takeScreenShot("LoginScreen");
				BtnSignIn().click();
				Thread.sleep(2000);

			}

			if (driver.getTitle().contains("LendInCheck")) {

				System.out.println("Page Title verified. Login successfull");
				ExcelWrite.writeSanitySheet(SanitySheet, 2, 1, "Pass");

			}

		} catch (Exception ex) {

			System.out.println("Exception message:" + ex.getMessage());
			System.out.println("StackTrace error:" + ex.getStackTrace());
			System.out.println("ExceptionCause :" + ex.getCause());
		}

	}

}
