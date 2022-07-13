package org.tyaa.work.test.java.sikuli.metertools5.test.steps.base;

import io.cucumber.java.en.Given;
import org.tyaa.work.test.java.sikuli.metertools5.factories.FacadeFactory;

/** Реализации шагов сценария по работе с окном приложения, открываемого первый раз */
public class InitialWindowSteps {

    @Given("Главное окно приложения, открытое пользователем первый раз двойным кликом по ярлыку на рабочем столе")
    public void open() {
        FacadeFactory.getAbstractInitialFacade().open();
    }
}
