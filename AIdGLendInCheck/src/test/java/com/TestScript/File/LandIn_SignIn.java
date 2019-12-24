package com.TestScript.File;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.File.LandIn_SignInBL;
import com.CommonUtils.File.Base;

public class LandIn_SignIn extends Base {

	LandIn_SignInBL signInBl = PageFactory.initElements(driver, LandIn_SignInBL.class);

	@BeforeMethod

	public void LaunchLandInCheckApp() throws InterruptedException, IOException {

		openLandInCheckApp();

	}

	@Test

	public void SignInLandInCheck() throws IOException {

		signInBl.loginBroker();

	}

	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}
}
