package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @When("I mouse hover and click on desktop tab")
    public void iMouseHoverAndClickOnDesktopTab() {
        new HomePage().mouseHoverAndClickOnDesktopTab();
    }

    @And("I select menu {string}")
    public void iSelectMenu(String menu) {
        new HomePage().selectMenu(menu);
    }

    @Then("I should navigate to desktop page successfully")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        Assert.assertEquals(new DesktopPage().getDesktopText(),"Desktops");
    }

    @When("I mouse hover and click on laptop and notebook tab")
    public void iMouseHoverAndClickOnLaptopAndNotebookTab() {
        new HomePage().mouseHoverAndClickOnLaptopAndNoteBooksTab();
    }

    @Then("I should navigate to laptop and notebook page successfully")
    public void iShouldNavigateToLaptopAndNotebookPageSuccessfully() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getLaptopAndNotebookText(),"Laptops & Notebooks");

    }

    @When("I mouse hover and click on component tab")
    public void iMouseHoverAndClickOnComponentTab() {
        new HomePage().mouseHoverAndClickOnDComponentsTab();
    }

    @Then("I should navigate to component page successfully")
    public void iShouldNavigateToComponentPageSuccessfully() {
        Assert.assertEquals(new ComponentsPage().getComponentText(),"Components");
    }
}
