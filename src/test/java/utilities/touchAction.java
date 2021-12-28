package utilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class touchAction implements Task {
    WebDriver facade = getDriver();
    WebDriver driver= ((WebDriverFacade) facade).getProxiedDriver();
    TouchAction action = new TouchAction((MobileDriver)driver) ;
    static PointOption pointOptionStart;
    static PointOption pointOptionEnd;
    public static touchAction down(int end){
        pointOptionStart = PointOption.point(100, end); //End<Start olmali.Down
        pointOptionEnd = PointOption.point(100, 400);
        return instrumented(touchAction.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {

        action.press(pointOptionStart);
        action.moveTo(pointOptionEnd);
        action.release();
        action.perform();
    }
}
