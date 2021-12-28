package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class PaymentPageElements {
    public static final Target AMOUNT = Target.the("AMOUNT field")
            .located(By.id("amount"));
    public static final Target PHONE = Target.the("PHONE field")
            .located(By.id("phoneTextField"));
    public static final Target NAME = Target.the("NAME field")
            .located(By.id("nameTextField"));
    public static final Target SEND_PAYMENT = Target.the("PAYMENT BTN field")
            .located(By.id("sendPaymentButton"));
    public static final Target YES = Target.the("YES BTN field")
            .located(By.id("android:id/button1"));
    public static final Target COUNTRY_BTN = Target.the("Country Btn Field")
            .located(By.id("countryButton"));
}
