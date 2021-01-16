package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the user first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the user last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the user email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select the birth month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do we select the birth day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select the birth year").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON_LOCATION = Target.the("button that shows us the next form step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("where do we write and select the user city").located(By.id("city"));
    public static final Target INPUT_ZIPCODE = Target.the("where do we write the zipcode for the user city").located(By.id("zip"));
    public static final Target DIV_COUNTRY = Target.the("where do we write the user country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target INPUT_COUNTRY = Target.the("where do we write the user country").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/input[1]"));
    public static final Target NEXT_BUTTON_DEVICES = Target.the("button that shows us the next form step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target DIV_OS = Target.the("where do we select the OS of the user computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_OS = Target.the("where do we select the OS of the user computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target DIV_VERSION = Target.the("where do we select the OS version of the user computer").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_VERSION = Target.the("where do we select the OS version of the user computer").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target DIV_LANGUAGE = Target.the("where do we select the OS language of the user computer").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_LANGUAGE = Target.the("where do we select the OS language of the user computer").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target DIV_MOBILE_DEVICE = Target.the("where do we select the brand of the user mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_MOBILE_DEVICE = Target.the("where do we select the brand of the user mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target DIV_MODEL = Target.the("where do we select the the model of the user mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_MODEL = Target.the("where do we select the the model of the user mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target DIV_OS_MOBILE = Target.the("where do we select the OS of the user mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_OS_MOBILE = Target.the("where do we select the OS of the user mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT_BUTTON_LAST_STEP = Target.the("button that shows us the last form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the user password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the confirmation of the user password").located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("check to select the option stay informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS_OF_USE = Target.the("check to accept the terms of use and policies").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("check to accept the privacy and security policies ").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("button to finalize the registration process").located(By.id("laddaBtn"));
    public static final Target LABEL_COMPLETE_SETUP = Target.the("button to finalize the registration process").located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
