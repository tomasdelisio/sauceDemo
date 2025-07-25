package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Format;

public class CartPage extends BasePage {
	/*** VARIABLES ***/
	// Locators
	@FindBy(className = "title")
	private WebElement your_cart_txt;
	@FindBy(className = "cart_quantity")
	private WebElement total_items_txt;
	@FindBy(className = "inventory_item_name")
	private WebElement product_name_txt;
	@FindBy(className = "inventory_item_desc")
	private WebElement product_description_txt;
	@FindBy(className = "inventory_item_price")
	private WebElement product_price_txt;
	@FindBy(id = "checkout")
	private WebElement checkout_btn;

	// Variables
	private String your_cart_text = null;
	private String total_items_text = null;
	private String product_name_text = null;
	private String product_description_text = null;
	private String product_price_text = null;
	private boolean isVisible = false;
	private boolean isClickable = false;
	private static final String checkout_btn_id = "Checkout Button";
	private static final String your_cart_txt_id = "'Your Cart' Text";
	private static final String total_items_txt_id = "Total Items Text";
	private static final String product_name_txt_id = "Product Name Text";
	private static final String product_description_txt_id = "Product Description Text";
	private static final String product_price_txt_id = "Product Price Text";
	
	// Constructor
	public CartPage() {
		super(driver);
		
	}

	/*** METHODS ***/
	// Checkout
	public void clickCheckoutBtn() {
		click(checkout_btn, checkout_btn_id);
		
	}

	// Visible / Clickable
	public boolean isYourCartTxtVisible() {
		isVisible = elementVisible(your_cart_txt, your_cart_txt_id);

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
	
	public boolean isCheckoutBtnClickable() {
		isClickable = elementToBeClickable(checkout_btn, checkout_btn_id);

		return isClickable;
		
	}
	
	// Getter and Setter
	public WebElement getYourCartTxt() {
		return your_cart_txt;
		
	}
	
	public String getYourCartText() {
		your_cart_text = your_cart_txt.getText();
		
		return your_cart_text;
	}
	
	public void setYourCartTxt(WebElement your_cart_txt) {
		this.your_cart_txt = your_cart_txt;
		
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
	
	public WebElement getCheckoutBtn() {
		return checkout_btn;
		
	}
	
	public void setCheckoutBtn(WebElement checkout_btn) {
		this.checkout_btn = checkout_btn;
		
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

	public void isClickable(boolean isClickable) {
		this.isClickable = isClickable;
		
	}

	public static String getCheckoutBtnId() {
		return checkout_btn_id;
		
	}

	public static String getYourCartTxtId() {
		return your_cart_txt_id;
		
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
	
}