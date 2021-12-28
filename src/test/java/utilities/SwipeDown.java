package utilities;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwipeDown   implements Interaction {
    public  static void SwipeDown(){
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = getDriver().manage().window().getSize();
        int edgeBorder = 10; // better avoid edges

        pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);

        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

//        .press(PointOption.point(pointOptionStart, pointOptionEnd))
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(PointOption.point(pointOptionEnd, pointOptionStart))
//                .release().perform();
    }
    @Override
    @Step("{0} swipes down screen")
    public <T extends Actor> void performAs(T actor) {

      swipeDown();
    }
    public static SwipeDown swipeDown(){
        return instrumented(SwipeDown.class);
    }


}