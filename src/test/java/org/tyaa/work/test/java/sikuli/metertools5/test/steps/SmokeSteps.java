package org.tyaa.work.test.java.sikuli.metertools5.test.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.facades.SmokeTestFacade;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Реализации шагов сценария элементарного Smoke-теста */
public class SmokeSteps {

    private SmokeTestFacade facade;

    @Before
    public void setup() {
        facade = new SmokeTestFacade(Global.getScreen());
    }

    @Given("Главное окно приложения, открытое пользователем двойным кликом по ярлыку на рабочем столе")
    public void openAppUsingShortcut() {
        facade.open();
    }

    @Then("В нём есть неактивная кнопка Подключиться")
    public void connectionButtonExists() {
        ValueWrapper<Boolean> connectionButtonExists = new ValueWrapper<>();
        facade.checkConnectionButton(connectionButtonExists);
        Assertions.assertTrue(connectionButtonExists.value);
    }

    @When("Пользователь кликает по стандартной кнопке закрытия окна")
    public void clickCloseButton() {
        facade.close();
    }

    @Then("Главное окно закрывается, неактивная кнопка Подключиться больше не находится на экране")
    public void checkAppClosed() {
        ValueWrapper<Boolean> appClosed = new ValueWrapper<>();
        facade.checkAppClosed(appClosed);
        Assertions.assertTrue(appClosed.value);
    }
}
