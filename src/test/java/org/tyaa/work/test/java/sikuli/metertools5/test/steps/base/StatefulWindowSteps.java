package org.tyaa.work.test.java.sikuli.metertools5.test.steps.base;

import io.cucumber.java.en.Given;
import org.tyaa.work.test.java.sikuli.metertools5.factories.FacadeFactory;

/** Реализации шагов сценария по работе с окном приложения с сохраненным ранее состоянием */
public class StatefulWindowSteps {

    @Given("Главное окно приложения, открытое пользователем двойным кликом по ярлыку на рабочем столе")
    public void open() {
        FacadeFactory.getAbstractStatefulFacade().open();
    }
}
