package org.tyaa.work.test.java.sikuli.metertools5.facades.initial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.facades.AbstractFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppResetDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppStarterDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.actions.AppTerminatorDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/** Абстрактный класс-родитель классов фасадов, скрывающих детали взаимодействия с GUI,
 * когда пользователь открыл приложение первый раз */
public abstract class AbstractInitialFacade extends AbstractFacade {

    protected AbstractInitialFacade(Screen screen) {
        super(screen);
    }

    /** Имитация открытия приложения пользователем впервые:
     * если в каталоге пользователя существует файл состояния приложения,
     * этот файл удаляется,
     * и затем выполняется запуск приложения двойным кликом по ярлыку на рабочем столе */
    @Override
    public AbstractFacade open() {
        try {
            this.resetAppUserState(() -> Files.deleteIfExists(Paths.get(String.format(
                    "%s\\%s",
                    System.getProperty("user.home"),
                    Global.getPropsReader().getString(IPropsReader.APP_USER_STATE_FILE_NAME)
            ))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            this.openApp(() -> (new Button(screen, "light\\app-shortcut.png")).doubleClick());
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}
