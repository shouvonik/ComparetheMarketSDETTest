package energy.comparethemarket.com.ctmsdet.bdd.constants;

public class CTMConstants {

	//Your Supplier section web elements
	public static final String POSTCODECSS = "input#your-postcode";
	public static final String FINDPOSTCODECSS = "button#find-postcode";
	public static final String NOBILLXPATH = "//div[@class='answer radio-buttons']/label[@id='no-bill-label']/span";
	public static final String ELECTRICITYONLYOPTIONXPATH = "//div[@class='answer radio-buttons compare-what']/label[@id='compare-electricity-label']/span";
	public static final String CURRENTELECTRICITYPROVIDERBRITISHGAS = "";
	public static final String CURRENTELECTRICITYPROVIDEREDF = "";
	public static final String CURRENTELECTRICITYPROVIDEREON = "";
	public static final String CURRENTELECTRICITYPROVIDERNPOWERXPATH = "//div[@class='answer radio-buttons']/div[1]/label[@for='electricity-top-six-npower']/span";
	public static final String CURRENTELECTRICITYPROVIDERSCOTTISHPOWER = "";
	public static final String CURRENTELECTRICITYPROVIDERSSE = "";
	public static final String NEXTBUTTONCSS = "//button[contains(text(), 'Next')]";
	
	public static final String VALIDPOSTCODEXPATH = "//div[@class='answer']/span[@class='tick-area']";
	
	//Your Energy section web elements
	public static final String PREPAYMENTMETERRADIOGROUPXPATH = "//fieldset[@id='prepay-yes-no']//div[@class='answer radio-ticks']//label/span";
	public static final String ECONOMYMETERRADIOGROUPXPATH = "//fieldset[@id='economy-7-question']//div[@class='answer radio-ticks']//label/span";
	public static final String CURRENTSPENDONELECTRICITYNOTKNOWNRADIOCSS = "span#electricity-dont-know-check";
	
	public static final String ONEBEDROOMCSS = "fieldset#how-big-is-your-home label:nth-child(1) > span";
	public static final String ONEOCCUPANTCSS = "fieldset#number-of-occupants label:nth-child(1) > span";
	public static final String SOURCEOFHEATINGCSS = "fieldset#main-heating-source label:nth-child(2) > span";
	public static final String HEATINGUSAGECSS = "fieldset#heating-usage label:nth-child(2) > span";
	public static final String HOUSEINSULATIONLEVELCSS = "fieldset#house-insulation label:nth-child(2) > span";
	public static final String COOKINGSOURCECSS = "fieldset#main-cooking-source label:nth-child(2) > span";
	public static final String HOUSEOCCUPANCYCSS = "fieldset#house-occupied label:nth-child(2) > span";
	
	//Your Details section web elements
	public static final String ALLTARIFFPREFERENCEXPATH = "//div[@class='answer radio-buttons what-tariff']/label[@for='pre-select-all']/span";
	public static final String ALLPAYMENTTYPEXPATH = "//div[@class='answer radio-buttons what-payment-type']/label[@for='pre-select-payment-all']/span";
	public static final String REFINERESULTRADIOGROUPXPATH = "//fieldset[@id='same-supplier-question']//div[@class=' radio-ticks']/label/span";
	public static final String EMAILCSS = "input#Email";
	public static final String UPTODATEXPATH = "//fieldset[@id='marketingT']//div[@class='answer radio-ticks']/label[@for='marketingPreference']/span[2]";
	public static final String TERMSANDCONDITIONXPATH = "//fieldset[@id='TnC']//div[@class='answer radio-ticks']/label[@id='terms-label']/span[2]";
	
	public static final String GOTOPRICESBUTTONCSS = "button#email-submit";
	
	//Your Results section web elements
	public static final String PRICESTABLEXPATH = "//table[@class='price-table']";
}