package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
       loginPage.email.sendKeys(ConfigurationReader.getProperty("librarian.email"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian.password"));
        loginPage.signInButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard1() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.email.sendKeys(ConfigurationReader.getProperty("student.email"));

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("student.password"));
        loginPage.signInButton.click();
    }

}
