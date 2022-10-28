package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRecruitment {
    public static WebDriver driver;

    private static ExtentTest extentTest;
    private LoginPage login;
    private RecruitmentPage recruitment;

    public TestRecruitment() {
        driver = com.juaracoding.cucumber.step_definitons.Hooks.driver;
        extentTest = com.juaracoding.cucumber.step_definitons.Hooks.extentTest;
    }

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject() {
        login = new LoginPage();
        recruitment = new RecruitmentPage();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @When("User enter username password valid")
    public void user_enter_username_password_valid() {
        delay(Constants.DETIK);
        // PreCondition
        login.login("Admin", "admin123");
        delay(Constants.DETIK);
        // Step
        //noinspection ResultOfMethodCallIgnored
        recruitment.toString();
        Assert.assertEquals(recruitment.toString(), "Recruitment");
        System.out.println("Test Case Recruitment Page");
    }

    @Then("User click button search")
    public void User_click_button_search() {
        delay(Constants.DETIK);
        // Step
        //noinspection ResultOfMethodCallIgnored
        recruitment.toString();
        Assert.assertTrue(recruitment.toString().contains("Linda"));
        System.out.println("Test Case Search By Hiring Manager");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(5000L * detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


