package Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEssentialQuestions {

	@BeforeClass
	public void beforeClass() {
		System.out.println("BEFORE CLASS before all methods/tests executed");
	}
	@AfterClass
	@BeforeClass
	public void afterClass() {
		System.out.println("AFTER CLASS before all methods/tests executed");
	}
	
	@BeforeMethod                    //Run this before every class/ testcase 
	public void RunThisBeforeEveryTest() {
		System.out.println("Run me every time before the test");
	}
	
	@AfterMethod                    //Run this after every class/ test case 
	public void RunThisAfterEveryTest() {
		System.out.println("Run me every time AFTER the test");
	}
	
	@AfterTest
	public void lastThingToDo() {
		System.out.println("Last Thing is Last");
	}
	
	@Test
	public void WhereAreYou(){
		
		System.out.println("Where are you");
	}
	
	@Test
	public void HowAreYou(){
		
		System.out.println("How are you");
	}
	
	
	@Test
	public void WhoAreYou(){
		
		System.out.println("Who are you");
	}
	
	@BeforeTest
	public void firstThingToDo() {
		System.out.println("First Thing is First");
	}
	
	
	@AfterSuite                       //Use this to clean cookies and other stuff
	public void DoThisAfterSuite() {
		System.out.println("DoThisAfterSuite");
	}
	
	@BeforeSuite                     //Use this to clean cookies and other stuff
	public void DoThisBeforeSuite() {
		System.out.println("DoThisBeforeSuite");
		
	}
	
}
