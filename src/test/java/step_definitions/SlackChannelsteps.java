package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SlackChannelpage;

public class SlackChannelsteps {
	
	SlackChannelpage Spage = new SlackChannelpage();
	
	@When("I click on Slackchannel tab")
	public void i_click_on_slackchannel_tab() {
		Assert.assertTrue(Spage.slacktab.isDisplayed());
		Spage.slacktab.click();
	    
	}

	@Then("I should be directed to Slack channel homepage {string}")
	public void i_should_be_directed_to_slack_channel_homepage(String slackurl) {
	    
	}
	
	
	   
}