package com.inetBanking.testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends Baseclass {
	@Test
  public void LoginTest() throws IOException {
		
		logger.info("url opened");
		LoginPage lp =new LoginPage(driver);
		lp.setUsername(username);
		logger.info("entered username");
		lp.setPassword(password);
		logger.info("entered password");
	    lp.clickButton();
	    if(driver.getTitle().equals(driver.getTitle())) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
	    }
	    
  }
}
