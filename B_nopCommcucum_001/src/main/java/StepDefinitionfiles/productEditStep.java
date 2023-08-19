package StepDefinitionfiles;

import java.io.IOException;

import org.testng.Assert;

import baseClasses.basefile;
import driverUtilities.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomPageFiles.editProdpage;
import pomPageFiles.homePage;
import pomPageFiles.loginPage;
import pomPageFiles.prodPage;

public class productEditStep {
	private loginPage lp;
	private basefile bf;
	private homePage hp;
	private prodPage pp;
	private utils u;
	private editProdpage ep;
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	bf= new basefile();
	Assert.assertEquals(bf.title(), "Your store. Login");
	System.out.println("successfully reached login page");
	}

	@When("user enters email {string} and pass as {string}")
	public void user_enters_email_and_pass_as(String string, String string2) {
		lp= new loginPage();
		lp.email.clear();
		lp.email(string);
		lp.pass.clear();
		lp.pass(string2);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		lp= new loginPage();
		lp.login();
	}

	@Then("user should in homepage")
	public void user_should_in_homepage() {
		bf= new basefile();
		Assert.assertEquals(bf.title(), "Dashboard / nopCommerce administration");
		System.out.println("successfully reached homepage");
	}

	@Then("user click on catalog dropdown")
	public void user_click_on_catalog_dropdown() {
	    hp= new homePage();
	    hp.catalog();
	
	}

	@Then("user select on products option")
	public void user_select_on_products_option() {
		hp= new homePage();
		hp.produc();
	}

	@Then("product page should be displayed")
	public void product_page_should_be_displayed() {
		bf= new basefile();
		Assert.assertEquals(bf.title(), "Products / nopCommerce administration");
		System.out.println("successfully reached product page");
	}

	@Then("enter product name as {string}")
	public void enter_product_name_as(String string) {
	    pp= new prodPage();
		pp.prod(string);
	  
	}

	@Then("click on search button")
	public void click_on_search_button() {
		pp= new prodPage();
		  pp.search();
	}

	@When("scroll down till end")
	public void scroll_down_till_end() {
	    u= new utils();
		u.scrolldown();
	}

	@When("click on edit button")
	public void click_on_edit_button() {
		pp= new prodPage();
		  pp.edit();
	}

	@When("edit the product as {string} in product name")
	public void edit_the_product_as_in_product_name(String string) {
		ep= new editProdpage();
		ep.edit.clear();
	    ep.edit(string);
	}

	@When("user save the product")
	public void user_save_the_product() {
		ep= new editProdpage();
		ep.save();
	}

	@Then("user received the message {string}")
	public void user_received_the_message(String string) {
		bf= new basefile();
		Assert.assertTrue(bf.text().contains("The product has been updated successfully."), string);
		System.out.println("successfully got the message");
	    
	}

	@Then("see the same name {string} is appeared and take the screenshot")
	public void see_the_same_name_is_appeared_and_take_the_screenshot(String string) throws IOException {
	    u=new utils();
	    bf= new basefile();
		Assert.assertTrue(bf.text().contains("NIKON_V0001"), string);
		System.out.println("successfully changed the product name");
	    u.screenshot();
	}

}
