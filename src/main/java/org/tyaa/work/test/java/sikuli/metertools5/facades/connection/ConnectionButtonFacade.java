package org.tyaa.work.test.java.sikuli.metertools5.facades.connection;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.facades.base.AbstractInitialFacade;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/**
 * Класс фасада, скрывающего детали взаимодействия с GUI,
 * когда пользователь открыл приложение первый раз
 * */
public class ConnectionButtonFacade extends AbstractInitialFacade {

    public ConnectionButtonFacade(Screen screen) {
        super(screen);
    }

    public ConnectionButtonFacade checkConnectionButton(String connectionButtonText, ValueWrapper<Boolean> connectionButtonExists) {
        try {
            connectionButtonExists.value =
                WindowFactory.getMainWindowWithConnectionButton(screen, connectionButtonText).getConnectionView().getConnectionButton() != null;
        } catch (FindFailed e) {
            connectionButtonExists.value = false;
        }
        return this;
    }
}
