package test_e2e;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import data.Data;
import driver.Driver;
import pages.BasePage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductsPage;
import pages.LoginPage;
import pages.FinishPage;
import report.Report;
import utils.Messages;

public class TestE2E {
	/*** VARIABLES ***/
	// Driver
	private WebDriver driver = null;

	// Pages
	private BasePage basePage = null;
	private LoginPage loginPage = null;
	private ProductsPage productsPage = null;
	private CartPage cartPage = null;
	private CheckoutPage checkoutPage = null;
	private FinishPage finishPage = null;

	// URL
	private static final String URL = "https://www.saucedemo.com/";
	
	// Messages Test
	private final String TEST_START = Messages.TEST_START.getMessage();
	private final String TEST_OK = Messages.TEST_OK.getMessage();
	private final String TEST_ERROR = Messages.TEST_ERROR.getMessage();
	private final String TEST_FINISH = Messages.TEST_FINISH.getMessage();
	private final String VALIDATE_TEST = Messages.VALIDATE_TEST.getMessage();
	
	// Messages Login
	private final String LOGIN_OK = Messages.LOGIN_OK.getMessage();
	private final String LOGIN = Messages.LOGIN.getMessage(); 
	private final String LOGIN_COMPLETED = Messages.LOGIN_COMPLETED.getMessage();
	private final String VALIDATE_LOGIN = Messages.VALIDATE_LOGIN.getMessage();
	
	// Messages Home
	private final String PRODUCT_ADDED = Messages.PRODUCT_ADDED.getMessage();
	
	// Messages Cart
	private final String CART = Messages.CART.getMessage(); 
	private final String CART_OK = Messages.CART_OK.getMessage();
	private final String CART_COMPLETED = Messages.CART_COMPLETED.getMessage();
	private final String VALIDATE_CART = Messages.VALIDATE_CART.getMessage();
	
	// Messages Checkout
	private final String CHECKOUT = Messages.CHECKOUT.getMessage();
	private final String CHECKOUT_OK = Messages.CHECKOUT_OK.getMessage();	
	private final String VALIDATE_CHECKOUT = Messages.VALIDATE_CHECKOUT.getMessage();
	
	// Messages Data
	private final String USR_MISMATCH = Messages.USR_MISMATCH.getMessage();
	private final String PASS_MISMATCH = Messages.PASS_MISMATCH.getMessage();
	private final String PRODUCT_NAME_MISMATCH = Messages.PRODUCT_NAME_MISMATCH.getMessage();
	private final String PRODUCT_DESCRIPTION_MISMATCH = Messages.PRODUCT_DESCRIPTION_MISMATCH.getMessage();
	private final String PRODUCT_PRICE_MISMATCH = Messages.PRODUCT_PRICE_MISMATCH.getMessage();
	private final String NAME_MISMATCH = Messages.PRODUCT_NAME_MISMATCH.getMessage();
	private final String LASTNAME_MISMATCH = Messages.PRODUCT_DESCRIPTION_MISMATCH.getMessage();
	private final String POSTAL_CODE_MISMATCH = Messages.PRODUCT_PRICE_MISMATCH.getMessage();
	private final String CHECKOUT_COMPLETED = Messages.CHECKOUT_COMPLETED.getMessage();
	private final String TOTAL_PRICE_ERROR = Messages.TOTAL_PRICE_ERROR.getMessage();
	private final String TOTAL_PRICE_OK = Messages.TOTAL_PRICE_OK.getMessage();
	private final String PURCHASE_MSG_OK = Messages.PURCHASE_MSG_OK.getMessage();
	private final String PURCHASE = Messages.PURCHASE.getMessage();
	private final String PURCHASE_MSG_ERROR = Messages.PURCHASE_MSG_ERROR.getMessage();
	private final String USER_DATA_COMPLETED = Messages.USER_DATA_COMPLETED.getMessage();
	private final String PERSON_DATA_COMPLETED = Messages.PERSON_DATA_COMPLETED.getMessage();
	private final String USER_DATA_OK = Messages.USER_DATA_OK.getMessage();
	private final String PERSON_DATA_OK = Messages.PERSON_DATA_OK.getMessage();
	private final String PRODUCT_DATA_OK = Messages.PRODUCT_DATA_OK.getMessage();
	
	// Messages Assertion
	private final String HANDLE_ASSERTION_ERROR = Messages.HANDLE_ASSERTION_ERROR.getMessage();
	
	// Data
	private String usr_actual = null;
	private String pass_actual = null;
	private String name_actual = null;
	private String lastname_actual = null;
	private String postal_code_actual = null;
	private String product_name_home_actual = null;
	private String product_name_cart_actual = null;
	private String product_description_home_actual = null;
	private String product_description_cart_actual = null;
	private String product_price_home_actual = null;
	private String product_price_cart_actual = null;
	private String product_name_checkout_actual = null;
	private String product_description_checkout_actual = null;
	private String product_price_checkout_actual = null;
	private Boolean is_remove_btn_clickable = false;
	private Boolean is_products_txt_visible = false;
	private Boolean is_your_cart_txt_visible = false;
	private String tax_actual = null;
	private String total_price_actual = null;
	private Boolean is_checkout_your_information_txt_visible = false;
	private Boolean is_checkout_overview_txt_visible = false;
	private String purchase_msg = null;

	// Reports
	private ExtentReports report = null;

	/*** METHODS ***/
	// Test Pre-Config
	@BeforeMethod
	public void configurateTest() {
		driver = Driver.configurate();

		report = Report.configurate();

		basePage = new BasePage(driver);
		basePage.navigateTo(URL);

		loginPage = new LoginPage();
		productsPage = new ProductsPage();
		cartPage = new CartPage();
		checkoutPage = new CheckoutPage();
		finishPage = new FinishPage();
		
	}
	
	// Testing Methods
	private void startTest(ExtentTest test) {
		test.log(Status.INFO, TEST_START);
		System.out.println(TEST_START + "\n");
		
	}
	
	private void finishTest(ExtentTest test, String usr) {
		test.log(Status.INFO, TEST_FINISH + "\nUsuario: " + usr);
		System.out.println(TEST_FINISH + "\nUsuario: " + usr + "\n");
		
	}
	
	private void login(ExtentTest test, String usr, String pass) {
		test.log(Status.INFO, LOGIN);
				
		loginPage.typeUsr(usr);
		usr_actual = loginPage.getUsrFldContent();
		
		loginPage.typePass(pass);
		pass_actual = loginPage.getPassFldContent();
		test.log(Status.INFO, USER_DATA_COMPLETED);
		
		loginPage.clickLoginBtn();
				
		is_products_txt_visible = productsPage.isProductsTxtVisible();
		
		test.log(Status.INFO, LOGIN_COMPLETED);
		
	}
	
	private void cart(ExtentTest test) {
		test.log(Status.INFO, CART);
		
		productsPage.clickAddBtn();
		product_name_home_actual = productsPage.getProductNameText();
		test.log(Status.INFO, PRODUCT_ADDED);
		
		product_description_home_actual = productsPage.getProductDescriptionText();
		product_price_home_actual = productsPage.getProductPriceText();
		is_remove_btn_clickable = productsPage.isRemoveBtnClickable();
		
		productsPage.clickCartBtn();
		
		is_your_cart_txt_visible = cartPage.isYourCartTxtVisible();
		product_name_cart_actual = cartPage.getProductNameText();
		product_description_cart_actual = cartPage.getProductDescriptionText();
		product_price_cart_actual = cartPage.getProductPriceText();
		
		cartPage.clickCheckoutBtn();
		
		is_checkout_your_information_txt_visible = checkoutPage.isCheckoutYourInformationTxtVisible();
		
		test.log(Status.INFO, CART_COMPLETED);
	}
	
	private void checkout(ExtentTest test, String name, String lastname, String postal_code) {
		test.log(Status.INFO, CHECKOUT);
		
		checkoutPage.typeName(name);
		name_actual = checkoutPage.getNameFldContent();
		
		checkoutPage.typeLastname(lastname);
		lastname_actual = checkoutPage.getLastnameFldContent();
		
		checkoutPage.typePostalCode(postal_code);
		postal_code_actual = checkoutPage.getPostalCodeFldContent();
		test.log(Status.INFO, PERSON_DATA_COMPLETED);
		
		checkoutPage.clickCheckoutBtn();
		
		is_checkout_overview_txt_visible = checkoutPage.isCheckoutOverviewTxtVisible();
		product_name_checkout_actual = checkoutPage.getProductNameText();
		product_description_checkout_actual = checkoutPage.getProductDescriptionText();
		product_price_checkout_actual = checkoutPage.getProductPriceText();
		tax_actual = checkoutPage.getTaxText();
		total_price_actual = checkoutPage.getTotalText();
		
		checkoutPage.clickFinishBtn();
		
		purchase_msg = finishPage.getPurchaseMsgText();
		
		test.log(Status.INFO, CHECKOUT_COMPLETED);
	}
	
	private void validateLogin(ExtentTest test, String usr, String pass) {
		test.log(Status.INFO, VALIDATE_LOGIN);
		
		assertEquals(usr_actual, usr, USR_MISMATCH);
		assertEquals(pass_actual, pass, PASS_MISMATCH);
		test.pass(USER_DATA_OK);
		
		assertTrue(is_products_txt_visible);
				
		test.pass(LOGIN_OK);
		System.out.println(LOGIN_OK + "\nUsuario: " + usr + "\n");
		
	}
	
	private void validateCart(ExtentTest test, String product_name) {
		test.log(Status.INFO, VALIDATE_CART);
		
		assertTrue(is_remove_btn_clickable);
		assertTrue(is_your_cart_txt_visible);
		
		assert product_name_home_actual.equals(product_name_cart_actual) && product_name_cart_actual.equals(product_name) : PRODUCT_NAME_MISMATCH;
		assertEquals(product_description_home_actual, product_description_cart_actual, PRODUCT_DESCRIPTION_MISMATCH);		
		assertEquals(product_price_home_actual, product_price_cart_actual, PRODUCT_PRICE_MISMATCH);
		test.pass(PRODUCT_DATA_OK);
						
		test.pass(CART_OK);
		System.out.println(CART_OK + "\nProducto: " + product_name + "\n");
		
	}
	
	private void validateCheckout(ExtentTest test, String name, String lastname, String postal_code, String product_name) {
		test.log(Status.INFO, VALIDATE_CHECKOUT);
		
		assertTrue(is_checkout_your_information_txt_visible);
		
		assertEquals(name_actual, name, NAME_MISMATCH);		
		assertEquals(lastname_actual, lastname, LASTNAME_MISMATCH);		
		assertEquals(postal_code_actual, postal_code, POSTAL_CODE_MISMATCH);
		test.pass(PERSON_DATA_OK);
		
		assertTrue(is_checkout_overview_txt_visible);
		
		assert product_name_cart_actual.equals(product_name_checkout_actual) && product_name_checkout_actual.equals(product_name) : PRODUCT_NAME_MISMATCH;		
		assertEquals(product_description_cart_actual, product_description_checkout_actual, PRODUCT_DESCRIPTION_MISMATCH);		
		assertEquals(product_price_cart_actual, product_price_checkout_actual, PRODUCT_PRICE_MISMATCH);	
		test.pass(PRODUCT_DATA_OK);
		
		assertEquals(Double.parseDouble(product_price_checkout_actual) + Double.parseDouble(tax_actual), Double.parseDouble(total_price_actual), TOTAL_PRICE_ERROR);
		test.pass(TOTAL_PRICE_OK);
		
		assertEquals(purchase_msg, PURCHASE, PURCHASE_MSG_ERROR);
		test.pass(PURCHASE_MSG_OK);
				
		test.pass(CHECKOUT_OK);
		System.out.println(CHECKOUT_OK + "\nNombre: " + name + " " + lastname + "\n");
		
	}
	
	private void validateTest(ExtentTest test, String usr, String pass, String name, String lastname, String postal_code, String product_name) {
		test.log(Status.INFO, VALIDATE_TEST);
		
		validateLogin(test, usr, pass);
		validateCart(test, product_name);
		validateCheckout(test, name, lastname, postal_code, product_name);
				
		test.pass(TEST_OK);
		System.out.println(TEST_OK + "\n");
		
	}
	
	private void handleAssertionError(ExtentTest test, AssertionError e) {
		test.log(Status.INFO, HANDLE_ASSERTION_ERROR);
		
		test.addScreenCaptureFromPath("screenshot.png");
		
		test.fail(TEST_ERROR + " \nERROR: " + e.getMessage());
		System.out.println(TEST_ERROR + " \nERROR: " + e.getMessage() + "\n");
		
	}

	// Tests
	@Test(dataProvider = "Purchase", dataProviderClass = Data.class, priority = 1)
	public void purchase(String usr, String pass, String name, String lastname, String postal_code, String product_name) {
		ExtentTest test = report.createTest("E2E Checkout Test");
		
		startTest(test);
		login(test, usr, pass);
		cart(test);
		checkout(test, name, lastname, postal_code);
		
		try {
			validateTest(test, usr, pass, name, lastname, postal_code, product_name);
			
		} catch (AssertionError e) {
			handleAssertionError(test, e);
			
		} finally {
			finishTest(test, usr);
			
		}
		
	}

	
	// Test Post-Config
	@AfterMethod
	public void finishTest() {
		report.flush();

		Driver.finish();
		
	}
}