package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;
import ui.PaymentPageElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaymentForm implements Task {
    private static String country;
    private static String amount;
    private static String phone;
    private static String name;
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
        actor.attemptsTo(
                Click.on(PaymentPageElements.COUNTRY_FIELD),
                SendKeys.of(this.country).into(PaymentPageElements.COUNTRY_FIELD),
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
}
