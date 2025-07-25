package pages;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	/*** VARIABLES ***/
	// Locators
	@FindBy(id = "user-name")
	private WebElement usr_fld;
	@FindBy(id = "password")
	private WebElement pass_fld;
	@FindBy(id = "login-button")
	private WebElement login_btn;

	// Attributes
	private static final String value = "value";

	// Variables
	private boolean isVisible = false;
	private boolean isClickable = false;
	private String usr_content = null;
	private String pass_content = null;
	private static final String login_btn_id = "Login Button";
	private static final String usr_fld_id = "User Field";
	private static final String pass_fld_id = "Password Field";

	// Constructor
	public LoginPage() {
		super(driver);
		
	}

	/*** METHODS ***/
	// Login
	public void clickLoginBtn() {
		click(login_btn, login_btn_id);
		
	}

	public void typeUsr(String usr) {
		type(usr, usr_fld, usr_fld_id);
		
	}

	public void typePass(String pass) {
		type(pass, pass_fld, pass_fld_id);
		
	}

	// Visible / Clickable
	public boolean isLoginBtnClickable() {
		isClickable = elementToBeClickable(login_btn, login_btn_id);
		
		return isClickable;
		
	}

	public boolean isUsrFldVisible() {
		isVisible = elementVisible(usr_fld, usr_fld_id);
		
		return isVisible;
		
	}

	public boolean isPassFldVisible() {
		isVisible = elementVisible(pass_fld, pass_fld_id);
	
		return isVisible;
		
	}
	
	// Getter and Setter
	public WebElement getLoginBtn() {
		return login_btn;
		
	}

	public void setLoginBtn(WebElement login_btn) {
		this.login_btn = login_btn;
		
	}
	
	public WebElement getUsrFld() {
		return usr_fld;
		
	}
	
	public String getUsrFldContent() {
		usr_content = getAttribute(usr_fld, usr_fld_id, value);
		
		return usr_content;
		
	}
	
	public void setUsrFld(WebElement usr_fld) {
		this.usr_fld = usr_fld;
		
	}
	
	public WebElement getPassFld() {
		return pass_fld;
		
	}
	
	public String getPassFldContent() {
		pass_content = getAttribute(pass_fld, pass_fld_id, value);
		
		return pass_content;
	}
	
	public void setPassFld(WebElement pass_fld) {
		this.pass_fld = pass_fld;
		
	}

	public boolean isVisible() {
		return isVisible;
		
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
		
	}

	public static String getLoginBtnId() {
		return login_btn_id;
		
	}

	public static String getUsrFldId() {
		return usr_fld_id;
		
	}

	public static String getPassFldId() {
		return pass_fld_id;
		
	}
	
}