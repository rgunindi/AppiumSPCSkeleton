package tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {
    public static Target PAYMENT_PAGE = Target.the("Payment Page")
            .located(By.id("makePaymentButton"));
    public static Target PAYMENT_PAGE_LOGOUT = Target.the("Payment logout")
            .located(By.id("logoutButton"));

    public static Performable Open() {return Click.on(PAYMENT_PAGE); }
    public static Performable Logout() { return Click.on(PAYMENT_PAGE_LOGOUT);}
}
