package ar.validator;

import api.model.timeEntry.TimeEntryResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class TimeEntryValidator {

    public static void validateEntries() {
        TimeEntryResponse[] response = (TimeEntryResponse[]) APIManager.getLastResponse().getResponse();
        for (TimeEntryResponse entry : response) {
            Assert.assertNotNull(entry.getId(),"El campo ID del entry es nulo");
        }
    }

    public static void validateDescription(String description) {
        TimeEntryResponse entry = (TimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(description, entry.getDescription(), "La descripcion no es la esperada");
    }
}
