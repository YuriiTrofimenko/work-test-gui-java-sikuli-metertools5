package org.tyaa.work.test.java.sikuli.metertools5.facades;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppResetDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppStarterDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppTerminatorDelegate;

/** Абстрактный класс-родитель классов фасадов, скрывающих детали взаимодействия с GUI */
public abstract class AbstractFacade {

    protected final Screen screen;

    protected AbstractFacade(Screen screen) {
        this.screen = screen;
    }

    protected void openApp(AppStarterDelegate starter) throws FindFailed {
        starter.start();
    }

    protected void closeApp(AppTerminatorDelegate terminator) throws FindFailed {
        terminator.close();
    }

    protected void resetAppUserState(AppResetDelegate reset) throws FindFailed {
        reset.reset();
    }
}
