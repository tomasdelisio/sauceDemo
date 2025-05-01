package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Format;

public class CheckoutPage extends BasePage {
	/*** VARIABLES ***/
	// Locators
	@FindBy(className = "subheader")
	private WebElement checkout_your_information_txt;
	@FindBy(id = "first-name")
	private WebElement name_fld;
	@FindBy(id = "last-name")
	private WebElement lastname_fld;
	@FindBy(id = "postal-code")
	private WebElement postal_code_fld;
	@FindBy(className = "cart_button")
	private WebElement checkout_btn;
	@FindBy(className = "subheader")
	private WebElement checkout_overview_txt;
	@FindBy(className = "summary_quantity")
	private WebElement total_items_txt;
	@FindBy(className = "inventory_item_name")
	private WebElement product_name_txt;
	@FindBy(className = "inventory_item_desc")
	private WebElement product_description_txt;
	@FindBy(className = "inventory_item_price")
	private WebElement product_price_txt;
	@FindBy(className = "summary_subtotal_label")
	private WebElement item_price_txt;
	@FindBy(xpath = "//div[@class='summary_tax_label']")
	private WebElement tax_txt;
	@FindBy(className = "summary_total_label")
	private WebElement total_txt;
	@FindBy(className = "cart_button")
	private WebElement finish_btn;

	// Attributes
	private static final String value = "value";
	
	// Variables
	private String checkout_your_information_text = null;
	private String name_content = null;
	private String lastname_content = null;
	private String postal_code_content = null;
	private String checkout_overview_text = null;
	private String total_items_text = null;
	private String product_name_text = null;
	private String product_description_text = null;
	private String product_price_text = null;
	private String item_price_text = null;
	private String tax_text = null;
	private String total_text = null;
	private boolean isVisible = false;
	private boolean isClickable = false;
	private static final String name_fld_id = "Campo Nombre";
	private static final String lastname_fld_id = "Campo Apellido";
	private static final String postal_code_fld_id = "Campo Código Postal";
	private static final String checkout_btn_id = "Checkout Button";
	private static final String total_items_txt_id = "Total Items Text";
	private static final String product_name_txt_id = "Product Name Text";
	private static final String product_description_txt_id = "Product Description Text";
	private static final String product_price_txt_id = "Product Price Text";
	private static final String checkout_your_information_txt_id = "'Checkout, Your Information' Text";
	private static final String checkout_overview_txt_id = "'Checkout, Overview' Text";
	private static final String item_price_txt_id = "Item Price Text";
	private static final String tax_txt_id = "Tax Text";
	private static final String total_txt_id = "Total Text";
	private static final String finish_btn_id = "Finish Button";
	
	// Constructor
	public CheckoutPage() {
		super(driver);
	}

	/*** METHODS ***/
	public void clickCheckoutBtn() {
		click(checkout_btn, checkout_btn_id);
	}
	
	public void typeName(String name) {
		type(name, name_fld, name_fld_id);
		
	}

	public void typeLastname(String lastname) {
		type(lastname, lastname_fld, lastname_fld_id);
		
	}
	
	public void typePostalCode(String postal_code) {
		type(postal_code, postal_code_fld, postal_code_fld_id);
		
	}

	public void clickFinishBtn() {
		click(finish_btn, finish_btn_id);
	}

	// Visible / Clickable
	public boolean isCheckoutYourInformationTxtVisible() {
		isVisible = elementVisible(checkout_your_information_txt, checkout_your_information_txt_id);

		return isVisible;

	}

	public boolean isCheckoutOverviewTxtVisible() {
		isVisible = elementVisible(checkout_overview_txt, checkout_overview_txt_id);

		return isVisible;

	}

	public boolean isTotalItemsTxtVisible() {
		isVisible = elementVisible(total_items_txt, total_items_txt_id);

		return isVisible;

	}

	public boolean isProductNameTxtVisible() {
		isVisible = elementVisible(product_name_txt, product_name_txt_id);

		return isVisible;

	}

	public boolean isProductDescriptionTxtVisible() {
		isVisible = elementVisible(product_description_txt, product_description_txt_id);

		return isVisible;

	}

	public boolean isProductPriceTxtVisible() {
		isVisible = elementVisible(product_price_txt, product_price_txt_id);

		return isVisible;

	}

	public boolean isFinishBtnClickable() {
		isClickable = elementToBeClickable(finish_btn, finish_btn_id);

		return isClickable;

	}

	// Getter and Setter
	public WebElement getCheckoutYourInformationTxt() {
		return checkout_your_information_txt;
	}
	
	public String getCheckoutYourInformationText() {
		checkout_your_information_text = checkout_your_information_txt.getText();
		
		return checkout_your_information_text;
	}

	public void setCheckoutYourInformationTxt(WebElement checkout_your_information_txt) {
		this.checkout_your_information_txt = checkout_your_information_txt;
	}

	public WebElement getNameFld() {
		return name_fld;
	}
	
	public String getNameFldContent() {
		name_content = getAttribute(name_fld, name_fld_id, value);
		
		return name_content;
		
	}

	public void setNameFld(WebElement name_fld) {
		this.name_fld = name_fld;
	}

	public WebElement getLastnameFld() {
		return lastname_fld;
	}
	
	public String getLastnameFldContent() {
		lastname_content = getAttribute(lastname_fld, lastname_fld_id, value);
		
		return lastname_content;
		
	}

	public void setLastnameFld(WebElement lastname_fld) {
		this.lastname_fld = lastname_fld;
	}

	public WebElement getPostalCodeFld() {
		return postal_code_fld;
	}
	
	public String getPostalCodeFldContent() {
		postal_code_content = getAttribute(postal_code_fld, postal_code_fld_id, value);
		
		return postal_code_content;
		
	}

	public void setPostalCodeFld(WebElement postal_code_fld) {
		this.postal_code_fld = postal_code_fld;
	}

	public WebElement getCheckoutBtn() {
		return checkout_btn;
	}

	public void setCheckoutBtn(WebElement checkout_btn) {
		this.checkout_btn = checkout_btn;
	}

	public WebElement getCheckoutOverviewTxt() {
		return checkout_overview_txt;
	}
	
	public String getCheckoutOverviewText() {
		checkout_overview_text = checkout_overview_txt.getText();
		
		return checkout_overview_text;
	}


	public void setCheckoutOverviewTxt(WebElement checkout_overview_txt) {
		this.checkout_overview_txt = checkout_overview_txt;
	}

	public WebElement getTotalItemsTxt() {
		return total_items_txt;
	}
	
	public String getTotalItemsText() {
		total_items_text = total_items_txt.getText();
		
		return total_items_text;
	}

	public void setTotalItemsTxt(WebElement total_items_txt) {
		this.total_items_txt = total_items_txt;
	}

	public WebElement getProductNameTxt() {
		return product_name_txt;
	}
	
	public String getProductNameText() {
		product_name_text = product_name_txt.getText();
		
		return product_name_text;
	}

	public void setProductNameTxt(WebElement product_name_txt) {
		this.product_name_txt = product_name_txt;
	}

	public WebElement getProductDescriptionTxt() {
		return product_description_txt;
	}
	
	public String getProductDescriptionText() {
		product_description_text = product_description_txt.getText();
		
		return product_description_text;
	}

	public void setProductDescriptionTxt(WebElement product_description_txt) {
		this.product_description_txt = product_description_txt;
	}

	public WebElement getProductPriceTxt() {
		return product_price_txt;
	}
	
	public String getProductPriceText() {
		product_price_text = Format.format(product_price_txt.getText(), 1);
		
		return product_price_text;
	}

	public void setProductPriceTxt(WebElement product_price_txt) {
		this.product_price_txt = product_price_txt;
	}

	public WebElement getItemPriceTxt() {
		return item_price_txt;
	}
	
	public String getItemPriceText() {
		item_price_text = Format.format(item_price_txt.getText(), 1);
		
		return item_price_text;
	}

	public void setItemPriceTxt(WebElement item_price_txt) {
		this.item_price_txt = item_price_txt;
	}

	public WebElement getTaxTxt() {
		return tax_txt;
	}
	
	public String getTaxText() {
		tax_text = Format.format(tax_txt.getText(), 6);
		
		return tax_text;
	}

	public void setTaxTxt(WebElement tax_txt) {
		this.tax_txt = tax_txt;
	}

	public WebElement getTotalTxt() {
		return total_txt;
	}
	
	public String getTotalText() {
		total_text = Format.format(total_txt.getText(), 8);
		
		return total_text;
	}

	public void setTotalTxt(WebElement total_txt) {
		this.total_txt = total_txt;
	}

	public WebElement getFinishBtn() {
		return finish_btn;
	}

	public void setFinishBtn(WebElement finish_btn) {
		this.finish_btn = finish_btn;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public boolean isClickable() {
		return isClickable;
	}

	public void setClickable(boolean isClickable) {
		this.isClickable = isClickable;
	}

	public static String getCheckoutBtnId() {
		return checkout_btn_id;
	}

	public static String getTotalItemsTxtId() {
		return total_items_txt_id;
	}

	public static String getProductNameTxtId() {
		return product_name_txt_id;
	}

	public static String getProductDescriptionTxtId() {
		return product_description_txt_id;
	}

	public static String getProductPriceTxtId() {
		return product_price_txt_id;
	}

	public static String getCheckoutYourInformationTxtId() {
		return checkout_your_information_txt_id;
	}

	public static String getCheckoutOverviewTxtId() {
		return checkout_overview_txt_id;
	}

	public static String getItemPriceTxtId() {
		return item_price_txt_id;
	}

	public static String getTaxTxtId() {
		return tax_txt_id;
	}

	public static String getTotalTxtId() {
		return total_txt_id;
	}

	public static String getFinishBtnId() {
		return finish_btn_id;
	}	
}