package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Format;

public class ProductsPage extends BasePage {
	/*** VARIABLES ***/
	// Locators
	@FindBy(className = "title")
	private WebElement products_txt;
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement add_btn;
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement remove_btn;
	@FindBy(css = "a[data-test='shopping-cart-link']")
	private WebElement cart_btn;
	@FindBy(className = "inventory_item_name")
	private WebElement product_name_txt;
	@FindBy(className = "inventory_item_desc")
	private WebElement product_description_txt;
	@FindBy(className = "inventory_item_price")
	private WebElement product_price_txt;

	// Variables
	private String product_name_text = null;
	private String product_description_text = null;
	private String product_price_text = null;
	private boolean isVisible = false;
	private boolean isClickable = false;
	private String products_text = null;
	private static final String add_btn_id = "Add Button";
	private static final String remove_btn_id = "Remove Button";
	private static final String cart_btn_id = "Cart Button";
	private static final String products_txt_id = "'PRODUCTS' Text";
	private static final String product_name_txt_id = "Product Name Text";
	private static final String product_description_txt_id = "Product Description Text";
	private static final String product_price_txt_id = "Product Price Text";
	
	// Constructor
	public ProductsPage() {
		super(driver);
		
	}

	/*** METHODS ***/
	// Add Products
	public void clickAddBtn() {
		click(add_btn, add_btn_id);
		
	}

	public void clickCartBtn() {
		actionClick(cart_btn, cart_btn_id);
	}

	// Visible / Clickable
	public boolean isProductsTxtVisible() {
		isVisible = elementVisible(products_txt, products_txt_id);

		return isVisible;
		
	}
	
	public boolean isAddBtnClickable() {
		isClickable = elementToBeClickable(add_btn, add_btn_id);

		return isClickable;
		
	}

	public boolean isRemoveBtnClickable() {
		isClickable = elementToBeClickable(remove_btn, remove_btn_id);

		return isClickable;
		
	}
	
	public boolean isCartBtnClickable() {
		isClickable = elementToBeClickable(cart_btn, cart_btn_id);

		return isClickable;
		
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
	
	// Getter and Setter
	public WebElement getProductsTxt() {
		return products_txt;
		
	}
	
	public void setProductsTxt(WebElement products_txt) {
		this.products_txt = products_txt;
		
	}
	
	public WebElement getAddBtn() {
		return add_btn;
		
	}

	public void setAddBtn(WebElement add_btn) {
		this.add_btn = add_btn;
		
	}
	
	public WebElement getRemoveBtn() {
		return remove_btn;
		
	}
	
	public void setRemoveBtn(WebElement remove_btn) {
		this.remove_btn = remove_btn;
		
	}
	
	public WebElement getCartBtn() {
		return cart_btn;
		
	}
	
	public void setCartBtn(WebElement cart_btn) {
		this.cart_btn = cart_btn;
		
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
	
	public String getProductsText() {
		return products_text;
		
	}

	public void setProductsText(String products_text) {
		this.products_text = products_text;
		
	}

	public static String getAddBtnId() {
		return add_btn_id;
		
	}

	public static String getRemoveBtnId() {
		return remove_btn_id;
		
	}

	public static String getProductsTxtId() {
		return products_txt_id;
		
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