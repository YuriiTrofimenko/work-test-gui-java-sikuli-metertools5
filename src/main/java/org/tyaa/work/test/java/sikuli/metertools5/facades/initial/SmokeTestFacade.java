package org.tyaa.work.test.java.sikuli.metertools5.facades.initial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.facades.AbstractFacade;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Класс фасада, скрывающего детали взаимодействия с GUI при элементарном Smoke-тесте */
public class SmokeTestFacade extends AbstractInitialFacade {

    public SmokeTestFacade(Screen screen) {
        super(screen);
    }

    public SmokeTestFacade checkConnectionButton(ValueWrapper<Boolean> connectionButtonExists) {
        try {
            connectionButtonExists.value =
                WindowFactory.getInitialMainWindow(screen).getConnectionView().getConnectionButton() != null;
        } catch (FindFailed e) {
            connectionButtonExists.value = false;
        }
        return this;
    }
}
