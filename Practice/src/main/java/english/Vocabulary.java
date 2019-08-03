package english;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import english.Dictionary;

public class Vocabulary extends Dictionary {
	
    public Vocabulary(HashMap<String, String> words) 
	{ 
		super(words); 		
	} 
	
	static Scanner in = new Scanner(System.in);
	
	private static WebDriver openBrowser()  {		
    	
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//   	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
	

		String baseUrl = "https://sentence.yourdictionary.com/subtle";
		driver.get(baseUrl);
		
		return driver ;
	
	}
	
	private static void searchWord(WebDriver driver, String word)  {		
		

		WebElement searchbar = driver.findElement(By.id("yd_search_bar")) ;
    	
		searchbar.clear();
		searchbar.sendKeys(word);
		searchbar.sendKeys(Keys.RETURN);
			
	}
			
	
    public static void main(String[] args) throws InterruptedException {
    	
    	Dictionary.addwords();
    	
		String ch = "" ;
		int choice = 0 ;
		String word = "" ;
		
		System.out.println("What you want to do: ");
		System.out.println("1.Only words");
		System.out.println("2.Words with sentences");
		choice = in.nextInt();
		
		Object[] wordKeys = words.keySet().toArray();
		
		switch(choice)
		{
			case 1 : while(ch.equals(""))
					{
		
						Random generator = new Random() ;
						Object key = wordKeys[generator.nextInt(wordKeys.length)];
						System.out.println(key + " : " + words.get(key));
						
						ch = in.nextLine();
							
					} 
					break ;
					
			
			case 2 : WebDriver driver = openBrowser() ;
					
					while(ch.equals(""))
					{					
							Random generator = new Random() ;
							Object key = wordKeys[generator.nextInt(wordKeys.length)];
							
							System.out.println("Word: "+ key);
								
							Thread.sleep(2000);
							
							searchWord(driver,key.toString());
																						
		//					System.out.println("Enter choice: ");
							ch = in.nextLine();
					}
										
					break;
				
		}
		
    }	

 }
