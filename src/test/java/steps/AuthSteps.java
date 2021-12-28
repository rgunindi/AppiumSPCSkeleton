package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.ErrorCatch;
import tasks.HomePage;
import tasks.LoginToEriBank;

public class AuthSteps {


    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="hhag";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("Catch older version pop_up")
    public void catchOlderVersionPop_up() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.CatchPopUp());
    }

    @When("I login with username incompany and password company")
    public void ıLoginWithUsernameIncompanyAndPasswordCompany() {
        actor.attemptsTo(LoginToEriBank.login("incompany","company"));
    }

    @Then("you should see the information toast")
    public void youShouldSeeTheInformationToast()  {
        actor.should(ErrorCatch.toastMessage());
    }

    @When("I login with username company and password company")
    public void i_login_with_username_company_and_password_company() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("company","company"));
    }

    @Then("you should see the home page")
    public void you_should_see_the_home_page() throws InterruptedException {
        actor.should(HomePage.validate());
    }
}
