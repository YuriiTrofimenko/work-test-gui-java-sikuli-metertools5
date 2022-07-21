package org.tyaa.work.test.java.sikuli.metertools5.test.steps.connection;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.tyaa.work.test.java.sikuli.metertools5.factories.FacadeFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Реализации шагов сценариев тестов кнопки соединения с устройством */
public class ConnectionButtonSteps {

    @Then("В окне есть {string} кнопка подключения с надписью {string}")
    public void connectionButtonExists(String connectionButtonState, String connectionButtonText) {
        ValueWrapper<Boolean> connectionButtonExists = new ValueWrapper<>();
        FacadeFactory.getConnectionButtonFacade().checkConnectionButton(
                String.format("%s %s", connectionButtonState, connectionButtonText),
                connectionButtonExists
        );
        Assertions.assertTrue(connectionButtonExists.value);
    }
}