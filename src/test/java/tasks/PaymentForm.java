package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;
import ui.PaymentPageElements;
import utilities.enumCountry;
import utilities.setCountryElement;
import utilities.touchAction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaymentForm implements Task {
    private static String country;
    private static String amount;
    private static String phone;
    private static String name;
    private static Boolean countryPage=false;
    public PaymentForm(String country, String amount, String phone, String name) {
        PaymentForm.country = country;
        PaymentForm.amount = amount;
        PaymentForm.phone = phone;
        PaymentForm.name = name;
    }

    public static PaymentForm fillForm(String country, String amount, String phone, String name) {
        return instrumented(PaymentForm.class, country,amount,phone,name);
    }

    @Override
    @Step("Payment Form Filling")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(enumCountry.setElement(this.country.toUpperCase()));
        if (countryPage){
            actor.attemptsTo(Click.on(PaymentPageElements.COUNTRY_BTN),touchAction.down(2000));
        }else  actor.attemptsTo(Click.on(PaymentPageElements.COUNTRY_BTN));
        actor.attemptsTo(
                setCountryElement.setElement(this.country),
                Click.on(PaymentPageElements.AMOUNT),
                SendKeys.of(this.amount).into(PaymentPageElements.AMOUNT),
                Click.on(PaymentPageElements.PHONE),
                SendKeys.of(this.phone).into(PaymentPageElements.PHONE),
                Click.on(PaymentPageElements.NAME),
                SendKeys.of(this.name).into(PaymentPageElements.NAME),
                Click.on(PaymentPageElements.SEND_PAYMENT),
                Click.on(PaymentPageElements.YES)
        );
    }
    public static void CountryiD(int countryName){
        countryPage=countryName>=11?true:false;
    }
}
