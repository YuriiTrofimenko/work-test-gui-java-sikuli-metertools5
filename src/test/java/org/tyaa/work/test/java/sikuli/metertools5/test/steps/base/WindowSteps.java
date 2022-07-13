package org.tyaa.work.test.java.sikuli.metertools5.test.steps.base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.tyaa.work.test.java.sikuli.metertools5.factories.FacadeFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Реализации шагов сценария по работе с окном приложения */
public class WindowSteps {

    @When("Пользователь кликает по стандартной кнопке закрытия окна")
    public void clickCloseButton() {
        FacadeFactory.getAbstractFacade().close();
    }

    @Then("Главное окно закрывается, неактивная кнопка Подключиться больше не находится на экране")
    public void checkAppClosed() {
        ValueWrapper<Boolean> appClosed = new ValueWrapper<>();
        FacadeFactory.getAbstractFacade().checkAppClosed(appClosed);
        Assertions.assertTrue(appClosed.value);
    }
}
