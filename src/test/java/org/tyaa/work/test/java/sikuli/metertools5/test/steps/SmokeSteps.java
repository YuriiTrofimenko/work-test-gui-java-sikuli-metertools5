package org.tyaa.work.test.java.sikuli.metertools5.test.steps;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.tyaa.work.test.java.sikuli.metertools5.factories.FacadeFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Реализации шагов сценария элементарного Smoke-теста */
public class SmokeSteps {

    @Then("В окне есть неактивная кнопка Подключиться")
    public void connectionButtonExists() {
        ValueWrapper<Boolean> connectionButtonExists = new ValueWrapper<>();
        FacadeFactory.getSmokeTestFacade().checkConnectionButton(connectionButtonExists);
        Assertions.assertTrue(connectionButtonExists.value);
    }
}
