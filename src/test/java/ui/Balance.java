package ui;

import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.targets.Target;
import static java.lang.Integer.parseInt;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Balance {
    public static Target BalanceMessage = Target.the("BALANCE INFO")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View");
    public static Consequence Check(String amount) throws InterruptedException { Thread.sleep(500);
        String balanceAmount=String.valueOf(100-parseInt(amount));
        return (seeThat(the(BalanceMessage), containsText((balanceAmount))));
    }
}
