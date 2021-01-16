package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strValueMonth;
    private String strValueDay;
    private String strValueYear;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strOs;
    private String strVersion;
    private String strLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strOsMobile;
    private String strPassword;
    private String strConfirmPassword;


    public Register(String strFirstName,String strLastName, String strEmail, String strValueMonth, String strValueDay,
                    String strValueYear, String strCity, String strZip, String strCountry, String strOs, String strVersion,
                    String strLanguage, String strMobileDevice, String strModel, String strOsMobile,
                    String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strValueMonth = strValueMonth;
        this.strValueDay = strValueDay;
        this.strValueYear = strValueYear;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strOs = strOs;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOsMobile = strOsMobile;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Register withTheData(String strFirstName, String strLastName, String strEmail, String strValueMonth,
                                       String strValueDay, String strValueYear, String strCity, String strZip,
                                       String strCountry, String strOs, String strVersion, String strLanguage,
                                       String strMobileDevice, String strModel, String strOsMobile, String strPassword,
                                       String strConfirmPassword) {

        return Tasks.instrumented(Register.class, strFirstName, strLastName, strEmail, strValueMonth, strValueDay,
                strValueYear, strCity, strZip, strCountry, strOs, strVersion, strLanguage, strMobileDevice, strModel,
                strOsMobile, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(RegisterPage.INPUT_FIRST_NAME),
                         Enter.theValue(strLastName).into(RegisterPage.INPUT_LAST_NAME),
                         Enter.theValue(strEmail).into(RegisterPage.INPUT_EMAIL),
                         SelectFromOptions.byValue(strValueMonth).from(RegisterPage.SELECT_MONTH),
                         SelectFromOptions.byValue(strValueDay).from(RegisterPage.SELECT_DAY),
                         SelectFromOptions.byValue(strValueYear).from(RegisterPage.SELECT_YEAR),
                         Click.on(RegisterPage.NEXT_BUTTON_LOCATION),

                         Enter.theValue(strCity).into(RegisterPage.INPUT_CITY),
                         Enter.theValue(strZip).into(RegisterPage.INPUT_ZIPCODE),
                         Click.on(RegisterPage.DIV_COUNTRY),
                         WaitUntil.the(RegisterPage.INPUT_COUNTRY, isVisible()).forNoMoreThan(5).seconds(),
                         Enter.theValue(strCountry).into(RegisterPage.INPUT_COUNTRY).thenHit(Keys.ARROW_UP,Keys.ENTER),
                         Click.on(RegisterPage.NEXT_BUTTON_DEVICES),

                         Click.on(RegisterPage.DIV_OS),
                         WaitUntil.the(RegisterPage.INPUT_OS, isVisible()).forNoMoreThan(5).seconds(),
                         Enter.theValue(strOs).into(RegisterPage.INPUT_OS).thenHit(Keys.ARROW_UP,Keys.ENTER),
                         Click.on(RegisterPage.DIV_VERSION),
                         WaitUntil.the(RegisterPage.INPUT_VERSION, isVisible()).forNoMoreThan(5).seconds(),
                         Enter.theValue(strVersion).into(RegisterPage.INPUT_VERSION).thenHit(Keys.ARROW_UP,Keys.ENTER),
                         Click.on(RegisterPage.DIV_LANGUAGE),
                         WaitUntil.the(RegisterPage.INPUT_LANGUAGE, isVisible()).forNoMoreThan(5).seconds(),
                         Enter.theValue(strLanguage).into(RegisterPage.INPUT_LANGUAGE).thenHit(Keys.ARROW_UP,Keys.ENTER),
                         Click.on(RegisterPage.DIV_MOBILE_DEVICE),
                         WaitUntil.the(RegisterPage.INPUT_MOBILE_DEVICE, isVisible()).forNoMoreThan(5).seconds(),
                         Enter.theValue(strMobileDevice).into(RegisterPage.INPUT_MOBILE_DEVICE).thenHit(Keys.ARROW_UP,Keys.ENTER),
                         Click.on(RegisterPage.DIV_MODEL),
                         WaitUntil.the(RegisterPage.INPUT_MODEL, isVisible()).forNoMoreThan(5).seconds(),
                         Enter.theValue(strModel).into(RegisterPage.INPUT_MODEL).thenHit(Keys.ARROW_UP,Keys.ENTER),
                         Click.on(RegisterPage.DIV_OS_MOBILE),
                         WaitUntil.the(RegisterPage.INPUT_OS_MOBILE, isVisible()).forNoMoreThan(5).seconds(),
                         Enter.theValue(strOsMobile).into(RegisterPage.INPUT_OS_MOBILE).thenHit(Keys.ARROW_UP,Keys.ENTER),
                         Click.on(RegisterPage.NEXT_BUTTON_LAST_STEP),

                         Enter.theValue(strPassword).into(RegisterPage.INPUT_PASSWORD),
                         Enter.theValue(strConfirmPassword).into(RegisterPage.INPUT_CONFIRM_PASSWORD),
                         Click.on(RegisterPage.CHECK_STAY_INFORMED),
                         Click.on(RegisterPage.CHECK_TERMS_OF_USE),
                         Click.on(RegisterPage.CHECK_PRIVACY),
                         Click.on(RegisterPage.BUTTON_COMPLETE_SETUP));




    }
}
