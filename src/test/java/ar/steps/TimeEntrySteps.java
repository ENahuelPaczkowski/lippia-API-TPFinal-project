package ar.steps;

import api.model.Project.ProjectResponse;
import api.model.timeEntry.TimeEntryResponse;
import ar.validator.TimeEntryValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.TimeEntryService;

import java.util.Random;

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
        TimeEntryService.ID_WSPACE.set("637a8e45bdbcea3ef54b628f");
    }

    @Given("se toman los datos de un entry")
    public void seTomaElIdDeUnEntry() {
        TimeEntryResponse response = (TimeEntryResponse) APIManager.getLastResponse().getResponse();
        TimeEntryService.ID_ENTRY.set(response.getId());
        TimeEntryService.START_ENTRY.set("2022-11-21T15:48:00Z");
        TimeEntryService.END_ENTRY.set("2022-11-21T15:49:00Z");
        TimeEntryService.DESCRIPTION_ENTRY.set(response.getDescription());
    }

    @And("una descripcion {string}")
    public void unaDescripcionDescipcion(String description) {
        TimeEntryService.NEW_DESCRIPTION.set(description);
    }

    @Then("se valida que la descripcion fue editada {string}")
    public void seValidaQueLaDescipcionFueEditadaDescipcion(String description) {
        TimeEntryValidator.validateDescription(description);
    }

    @When("obtengo datos originales")
    public void obtengoDatosOriginales() {
        TimeEntryService.NEW_DESCRIPTION.set(TimeEntryService.DESCRIPTION_ENTRY.get());
    }
}
