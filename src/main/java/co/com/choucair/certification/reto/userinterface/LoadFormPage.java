package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoadFormPage {
    public static final Target LOAD_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
