package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TestRecruitment {

    WebDriver driver;
    private static ExtentTest extentTest;
    private final RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment() {
        driver = com.juaracoding.cucumber.step_definitons.Hooks.driver;
        extentTest = com.juaracoding.cucumber.step_definitons.Hooks.extentTest;
    }

    @When("User click menu Recruitment")
    public void user_click_menu_recruitment() {
//		Hooks.delay(1);
        recruitmentPage.toString();
        extentTest.log(LogStatus.PASS, "User click menu Recruitment");
    }

    @And("User on menu Recruitment")
    public void user_on_menu_recruitment() {
//		Hooks.delay(1);
        recruitmentPage.toString();
        extentTest.log(LogStatus.PASS, "User on menu Recruitment");
    }

    @And("User enter name by hiring manager")
    public void User_enter_name_by_hiring_manager() {
//		Hooks.delay(1);
        recruitmentPage.toString();
        extentTest.log(LogStatus.PASS, "User enter name by hiring manager");
    }

    @Then("User click button search")
    public void user_click_button_search() {
        Assert.assertEquals(recruitmentPage.toString(), "Record Found");
        extentTest.log(LogStatus.PASS, "User click button search");
    }

}