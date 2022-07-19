package org.tyaa.work.test.java.sikuli.metertools5.facades;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppResetDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppStarterDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppTerminatorDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.initial.SmokeTestFacade;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

import java.io.IOException;

/** Абстрактный класс-родитель классов фасадов, скрывающих детали взаимодействия с GUI */
public abstract class AbstractFacade {

    protected final Screen screen;

    protected AbstractFacade(Screen screen) {
        this.screen = screen;
    }

    protected void openApp(AppStarterDelegate starter) throws FindFailed, InterruptedException {
        starter.start();
        screen.wait(5000L);
    }

    protected void closeApp(AppTerminatorDelegate terminator) throws FindFailed {
        terminator.close();
    }

    protected void resetAppUserState(AppResetDelegate reset) throws IOException {
        reset.reset();
    }

    public abstract AbstractFacade open();
    public AbstractFacade checkAppClosed(ValueWrapper<Boolean> appClosed) {
        try {
            WindowFactory.getInitialMainWindow(screen);
        } catch (FindFailed e) {
            appClosed.value = true;
        }
        return this;
    }
    public AbstractFacade close() {
        try {
            this.closeApp(() -> WindowFactory.getInitialMainWindow(screen).getCloseButton().click());
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}
