package energy.comparethemarket.com.ctmsdet.bdd.energycompare;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import energy.comparethemarket.com.ctmsdet.bdd.drivers.WebDriverManager;
import energy.comparethemarket.com.ctmsdet.bdd.page.CompareTheMarketYourEnergyPage;
import energy.comparethemarket.com.ctmsdet.bdd.page.CompareTheMarketYourPreferencesPage;
import energy.comparethemarket.com.ctmsdet.bdd.page.CompareTheMarketYourResultsPage;
import energy.comparethemarket.com.ctmsdet.bdd.page.CompareTheMarketYourSupplierPage;
import energy.comparethemarket.com.ctmsdet.bdd.util.CompareTheMarketUtility;
import energy.comparethemarket.com.ctmsdet.bdd.util.SeleniumUtitlityClass;

public class CompareTheMarket {

	WebDriver driver = WebDriverManager.getDriver();
	
	@When("^User launches comparethemarket website \"([^\"]*)\"$")
    public void user_launches_comparethemarket_website_something(String url) throws Throwable {
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
    }

    @And("^Provides postcode \"([^\"]*)\"$")
    public void provides_postcode_something(String postcode) throws Throwable {
    	CompareTheMarketYourSupplierPage.customerPostcode(driver).sendKeys(postcode);
    	//Thread.sleep(1000);
    }
    
    @And("^User clicks on Find Postcode$")
    public void user_clicks_on_find_postcode() throws Throwable {
        //throw new PendingException();
    	CompareTheMarketYourSupplierPage.findPostcode(driver).click();
    	CompareTheMarketYourSupplierPage.validPostcode(driver);
    	//Thread.sleep(1000);
    }
    
    @And("^User chooses no bill option$")
    public void user_chooses_no_bill_option() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourSupplierPage.noBill(driver);
        element.click();
        //CompareTheMarketYourSupplierPage.validBillOption(driver);
        new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    }
    @Then("^User selects electricity only to compare$")
    public void user_selects_electricity_only_to_compare() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourSupplierPage.compareElectricity(driver);
    	element.click();
    	//CompareTheMarketYourSupplierPage.validCompareWhatOption(driver);
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    }
    @Then("^User selects the current supplier as \"([^\"]*)\"$")
    public void user_selects_the_current_supplier_as_something(String currentElectricitySupplier) throws Throwable {
        //throw new PendingException();
    	CompareTheMarketUtility.selectYourCurrentElectricitySupplier(currentElectricitySupplier);
    }
    @And("^Clicks on Next$")
    public void clicks_on_next() throws Throwable {
        //throw new PendingException();
    	CompareTheMarketUtility.nextButton(driver).click();
    }
    
    @Then("^User selects no prepayment meter option$")
    public void user_selects_no_prepayment_meter_option() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourEnergyPage.prePaymentMeterNo(driver);
    	if(element.findElement(By.xpath("..")).getAttribute("class")!="checked") element.click();
    	 
    }
    
    @And("^User selects no economy meter option$")
    public void user_selects_no_economy_meter_option() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourEnergyPage.economyMeterNo(driver);
    	if(element.findElement(By.xpath("..")).getAttribute("class")!="checked") element.click();
    }
    
    @And("^User selects that current spend on electricity is not known$")
    public void user_selects_that_current_spend_on_electricity_is_not_known() throws Throwable {
        //throw new PendingException();
    	CompareTheMarketYourEnergyPage.spendOnElectricityNotKnown(driver).click();
    }
    
    @Then("^User answers the energy questionnaire$")
    public void user_answers_the_energy_questionnaire() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourEnergyPage.oneBedroom(driver);
    	element.click();
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    	
    	element = CompareTheMarketYourEnergyPage.oneOccupant(driver);
    	element.click();
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    	
    	element = CompareTheMarketYourEnergyPage.sourceOfHeatingElectricity(driver);
    	element.click();
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    	
    	element = CompareTheMarketYourEnergyPage.heatingUsageTemperate(driver);
    	element.click();
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    	
    	element= CompareTheMarketYourEnergyPage.houseInsulationLevelWellWrapped(driver);
    	element.click();
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    	
    	element = CompareTheMarketYourEnergyPage.cookingSourceElectricity(driver);
    	element.click();
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    	
    	element = CompareTheMarketYourEnergyPage.houseOccupancyWeekends(driver);
    	element.click();
    	new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
    	
    }
    
    @Then("^User selects \"([^\"]*)\" preference$")
    public void user_selects_something_preference(String tariffPreference) throws Throwable {
        //throw new PendingException();
    	CompareTheMarketUtility.selectYourTariffPreference(tariffPreference);
    }
    
    @And("^User selects Payment Type As \"([^\"]*)\"$")
    public void user_selects_payment_type_as_something(String paymentType) throws Throwable {
        //throw new PendingException();
    	CompareTheMarketUtility.selectYourPaymentPreference(paymentType);
    }
    
    @Then("^User chooses YES to see only the switch to now options$")
    public void user_chooses_yes_to_see_only_the_switch_to_now_options() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourPreferencesPage.refineResultYes(driver);
    	if(element != null){
    		if (!element.isSelected()) element.click();
    	}
    	
    }

    @And("^User shares email \"([^\"]*)\"$")
    public void user_shares_email_something(String email) throws Throwable {
        //throw new PendingException();
    	CompareTheMarketYourPreferencesPage.email(driver).sendKeys(email);
    }

    @And("^chooses not to stay updated with latest products$")
    public void chooses_not_to_stay_updated_with_latest_products() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourPreferencesPage.uptodate(driver);
    	if(element.findElement(By.xpath("..")).getAttribute("class").contains("checked")) element.click();
    }

    @And("^agrees to the terms and conditions$")
    public void agrees_to_the_terms_and_conditions() throws Throwable {
        //throw new PendingException();
    	WebElement element = CompareTheMarketYourPreferencesPage.termsandconditions(driver);
    	if(!element.findElement(By.xpath("..")).getAttribute("class").contains("checked")) element.click();
    }

    @And("^Clicks on Go to prices$")
    public void clicks_on_go_to_prices() throws Throwable {
        //throw new PendingException();
    	CompareTheMarketYourPreferencesPage.gotopricesButton(driver).click();
    }
    
    @Then("^User should be able to see the tariff options of Electricity Suppliers$")
    public void user_should_be_able_to_see_the_tariff_options_of_electricity_suppliers() throws Throwable {
    	WebElement webtable = CompareTheMarketYourResultsPage.priceTable(driver);
    	for (int second = 0;; second++) {
            if (second >= 200) fail("timeout");
            try { 
                if (SeleniumUtitlityClass.getRowCount(webtable)>2) 
                    break; 
                } catch (Exception e) {}
            Thread.sleep(1000);
        }
    	
    	
    }

}
