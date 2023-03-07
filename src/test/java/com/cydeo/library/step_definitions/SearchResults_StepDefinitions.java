package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResults_StepDefinitions {

    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.email.sendKeys(ConfigurationReader.getProperty("librarian.email"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian.password"));
        loginPage.signInButton.click();

    }
    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
        dashboardPage.usersLink.click();

    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> columnsName) {

        List<WebElement> columnsElement=Driver.getDriver().findElements(By.xpath("//th"));

        for (int i = 0; i < columnsName.size(); i++) {
            Assert.assertEquals(columnsName.get(i).toString(),columnsElement.get(i).getText());
            //System.out.println(columnsName.get(i) + " = " + columnsElement.get(i).getText());
        }

        Driver.closeDriver();

    }

}
