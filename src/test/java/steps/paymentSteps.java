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
import tasks.LoginToEriBank;
import tasks.PaymentForm;
import tasks.PaymentPage;
import ui.Balance;
import ui.PaymentPageElements;

import static java.lang.Integer.parseInt;

public class paymentSteps {
    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="hhag";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("Catch older version pop_up And LoginApp")
    public void catchOlderVersionPop_upAndLoginApp() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.CatchPopUp());
        actor.attemptsTo(LoginToEriBank.login("company","company"));
    }

    @Then("Open payment page")
    public void openPaymentPage() {
        actor.attemptsTo(PaymentPage.Open());
    }

    @When("client country is {} Country and {} Amount and {} Phone and {} Name")
    public void clientCountryIsCountryCountryAndAmountAmountAndPhonePhoneAndNameName(String country, String amount, String phone, String name) {
        actor.attemptsTo(
        PaymentForm.fillForm(country, amount, phone, name));
    }

    @Then("client balance check {} amount")
    public void clientBalanceCheck(String amount) throws InterruptedException {
        actor.should(Balance.Check(amount));
    }

    @Then("client logout successfully")
    public void clientLogoutSuccessfully() {
        actor.attemptsTo(PaymentPage.Logout());
    }
}
