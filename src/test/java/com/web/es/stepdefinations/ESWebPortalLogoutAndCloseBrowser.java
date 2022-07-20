package com.web.es.stepdefinations;

import com.web.es.pages.ESWebPortalLoginPage;

import io.cucumber.java.en.Given;

public class ESWebPortalLogoutAndCloseBrowser {
	
	ESWebPortalLoginPage loginpage = new ESWebPortalLoginPage();
	
    @Given("^user should close browser$")
    public void user_should_close_browser() throws Throwable {
    	loginpage.closeBrowser();
    }

}
