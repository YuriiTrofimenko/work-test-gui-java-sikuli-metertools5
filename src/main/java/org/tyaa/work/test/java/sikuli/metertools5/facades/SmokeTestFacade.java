package org.tyaa.work.test.java.sikuli.metertools5.facades;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Класс фасада, скрывающего детали взаимодействия с GUI при элементарном Smoke-тесте */
public class SmokeTestFacade extends AbstractFacade {

    public SmokeTestFacade(Screen screen) {
        super(screen);
    }

    public SmokeTestFacade open() {
        try {
            this.openApp(() -> (new Button(screen, "light\\app-shortcut.png")).doubleClick());
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
        return this;
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

    public SmokeTestFacade close() {
        try {
            this.closeApp(() -> WindowFactory.getInitialMainWindow(screen).getCloseButton().click());
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public SmokeTestFacade checkAppClosed(ValueWrapper<Boolean> appClosed) {
        try {
            WindowFactory.getInitialMainWindow(screen);
        } catch (FindFailed e) {
            appClosed.value = true;
        }
        return this;
    }
}
