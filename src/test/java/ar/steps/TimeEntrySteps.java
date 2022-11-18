package ar.steps;

import ar.validator.TimeEntryValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.TimeEntryService;

public class TimeEntrySteps extends PageSteps {

    @And("obtengo mi userId")
    public void obtengoMiUserId() {
        TimeEntryService.ID_USER.set("633f5b49648048064054ae29");
    }

    @Then("obtengo las horas registradas")
    public void obtengoLasHorasRegistradas() {
        TimeEntryValidator.validateEntries();
    }

    @And("obtengo mi workspace")
    public void obtengoMiWorkspace() {
        TimeEntryService.ID_WSPACE.set("633f5b49648048064054ae2a");
    }
}
