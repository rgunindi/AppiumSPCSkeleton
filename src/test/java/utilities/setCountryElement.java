package utilities;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class setCountryElement implements Task {
    private static String country="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView";
    private static String countrysetting="";
    public static setCountryElement setElement(String COUNTRY){
        String CompareCounty=COUNTRY.toUpperCase();
        for (int i=1;i<=11;i++){
          String  countryXpath=country+"["+i+"]";
            String cntryName= getDriver().findElement(By.xpath(countryXpath)).getText().toUpperCase();
            if (cntryName.contains(CompareCounty)){countrysetting=countryXpath;break;}
        }

        return instrumented(setCountryElement.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(countrysetting));
    countrysetting="";
    }
}