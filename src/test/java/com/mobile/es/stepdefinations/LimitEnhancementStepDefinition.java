package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.LimitEnhancementPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LimitEnhancementStepDefinition {
LimitEnhancementPage lp;
	public LimitEnhancementStepDefinition() throws MalformedURLException {
		lp = new LimitEnhancementPage();
	}
	
    @And("^User is on limit enhancement Dashboard$")
    public void user_is_on_limit_enhancement_dashboard() {
    	lp.swipeFibecard();
    	lp.taponDashboardCTA();
    	lp.checkthroughsidemenu();
    }
    
    @Then("^user has to then upload the  (.+) and click on submit button$")
    public void user_has_to_then_upload_the_and_click_on_submit_button(String bankstatementpdf) {
    	
    	gu.ElementToClick(lm.uploadofferletterdialoguebox, wait);
		gu.scrollToElement(offerletter);
		gu.ElementToClick(lm.uploadofferCTA, wait);
    	
    }
}
