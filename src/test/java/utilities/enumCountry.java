package utilities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import tasks.PaymentForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class enumCountry implements Task {
    public static enumCountry setElement(String COUNTRY){ COUNTRY=COUNTRY.contains("zealand")?"NEW_ZEALAND":COUNTRY;
        int count=1;
        for (COUNTRIES myVar : COUNTRIES.values()) {

            if (myVar.name().contains(COUNTRY)) break;

            count++;
        }
        PaymentForm.CountryiD(count);
        return instrumented(enumCountry.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {


    }
}
enum COUNTRIES{
    INDİA,USA, ICELAND, GREENLAND, SWİTZERLAND, NORWAY, NEW_ZEALAND, GREECE,ITALY,IRELAND,CHİNA, JAPAN,FRANCE,RUSSİA,AUSTRALLİA,CANADA
}