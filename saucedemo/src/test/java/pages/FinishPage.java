package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends BasePage {
	/*** VARIABLES ***/
	// Locators
	@FindBy(className = "complete-header")
	private WebElement purchase_msg_txt;
	
	// Variables
	private String purchase_msg_text = null;
	private Boolean isVisible = null;
	private static final String purchase_msg_txt_id = "Texto Operación Finalizada";
	
	// Constructor
	public FinishPage() {
		super(driver);
	}

	/*** METHODS ***/
	// Visible / Clickable
	public boolean isFinishMsgTxtVisible() {
		isVisible = elementVisible(purchase_msg_txt, purchase_msg_txt_id);

		return isVisible;

	}

	// Getter and Setter
	public WebElement getPurchaseMsgTxt() {
		return purchase_msg_txt;
	}
	
	public String getPurchaseMsgText() {
		purchase_msg_text = purchase_msg_txt.getText();
		
		return purchase_msg_text;
	}

	public void setPurchaseMsgTxt(WebElement finish_msg_txt) {
		this.purchase_msg_txt = finish_msg_txt;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	public static String getPurchaseMsgTxtId() {
		return purchase_msg_txt_id;
	}

}