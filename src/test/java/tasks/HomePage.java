package tasks;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class HomePage {
    public static Target HOMEPAGE = Target.the("HOME PAGE TEXT")
            .locatedBy(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View"));
    public static Consequence validate()  {
        return (seeThat(the(HOMEPAGE), containsText("Your balance is: 100.00$")));
    }
}
