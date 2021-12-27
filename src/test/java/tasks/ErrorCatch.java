package tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.BackendTask.where;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
public class ErrorCatch {
    public static Target toastmsj = Target.the("TOAST MESSAGE")
            .locatedBy(("/hierarchy/android.widget.Toast"));
    public static Consequence toastMessage()  {
        return (seeThat(the(toastmsj), containsText("Invalid username or password!")));
    }
}
