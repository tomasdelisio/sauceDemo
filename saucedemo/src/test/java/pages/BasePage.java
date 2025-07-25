package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
	/*** VARIABLES ***/
	// Driver
	public static WebDriver driver;

	// Constructor
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	/*** METHODS ***/
	// Actions
	public void navigateTo(String URL) {
		driver.get(URL);
		
	}

	public void click(WebElement element, String id) {
		if (elementToBeClickable(element, id)) {
			element.click();
			
		}
	}
	
	public void actionClick(WebElement element, String id) {
		do {
			try {
				Thread.sleep(0000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(!elementToBeClickable(element, id));
		
		Actions actions = new Actions(driver);
	    actions.moveToElement(element).click().build().perform();
	}

	public void type(String text, WebElement element, String id) {
		if (elementVisible(element, id)) {
			element.sendKeys(text);
			
		}
	}

	// Validations
	public static Boolean elementToBeClickable(WebElement element, String id) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	        	wait.until(ExpectedConditions.visibilityOf(element));
	            wait.until(ExpectedConditions.elementToBeClickable(element));
	            
	            if (element.isDisplayed() && element.isEnabled()) {
	                return true;
	            } else {
	                System.err.println("Advertencia: El elemento '" + id + "' no está completamente interactivo.");
	                return false;
	            }
	        
	    } catch (org.openqa.selenium.TimeoutException e) {
	    	
	        System.err.println("Error: El tiempo de espera para el elemento '" + id + "' ha expirado.");
	        
	        return false;
	        
	    } catch (org.openqa.selenium.NoSuchElementException e) {

	    	System.err.println("Error: El elemento '" + id + "' no fue encontrado.");
	        
	    	return false;
	        
	    } catch (Exception e) {

	    	System.err.println("Error inesperado: El elemento '" + id + "' " + e.getMessage());
	        
	    	return false;
	        
	    }
	}

	public static Boolean elementVisible(WebElement element, String id) {
		try {

			new WebDriverWait(driver, java.time.Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));

			return true;
			
		} catch (org.openqa.selenium.TimeoutException e) {
	    	
	        System.err.println("Error: El tiempo de espera para el elemento '" + id + "' ha expirado.");
	        
	        return false;
	        
	    } catch (org.openqa.selenium.NoSuchElementException e) {

	    	System.err.println("Error: El elemento '" + id + "' no fue encontrado.");
	        
	    	return false;
	        
	    } catch (Exception e) {

	    	System.err.println("Error inesperado: El elemento '" + id + "' " + e.getMessage());
	        
	    	return false;
	        
	    }
	}

	// Getter
	public WebElement getElement(WebElement element, String id) {
		if (elementVisible(element, id)) {
			return element;
			
		} else {
			return null;
			
		}
	}
	
	public String getText(WebElement element, String id) {
		String text = null;
		
		if (elementVisible(element, id)) {
			text = element.getText();
			
		}
		
		return text;
		
	}	
	
	public String getAttribute(WebElement element, String id, String attribute) {
		String element_attribute = null;
		
		if (elementVisible(element, id)) {
			element_attribute = element.getAttribute(attribute);
			
		}
		
		return element_attribute;
		
	}
}