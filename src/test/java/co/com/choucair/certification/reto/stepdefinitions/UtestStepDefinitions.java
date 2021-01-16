package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.model.UtestData;
import co.com.choucair.certification.reto.questions.Answer;
import co.com.choucair.certification.reto.tasks.Load;
import co.com.choucair.certification.reto.tasks.OpenUp;
import co.com.choucair.certification.reto.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than John wants to work as a freelance tester and connect with other testers$")
    public void thanJohnWantsToWorkAsAFreelanceTesterAndConnectWithOtherTesters() {
        OnStage.theActorCalled("John").wasAbleTo(OpenUp.thePage(), Load.theForm());
    }

    @When("^he fill all the required information for the registration$")
    public void heFillAllTheRequiredInformationForTheRegistration(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.withTheData(utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(), utestData.get(0).getStrValueMonth(),
                utestData.get(0).getStrValueDay(), utestData.get(0).getStrValueYear(), utestData.get(0).getStrCity(),
                utestData.get(0).getStrZip(), utestData.get(0).getStrCountry(), utestData.get(0).getStrOs(),
                utestData.get(0).getStrVersion(), utestData.get(0).getStrLanguage(), utestData.get(0).getStrMobileDevice(),
                utestData.get(0).getStrModel(), utestData.get(0).getStrOsMobile(), utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPassword()));
    }

    @Then("^he sees the button (.*)$")
    public void heSeesTheButtonCompleteSetup(String buttonLabel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(buttonLabel)));
    }
}
