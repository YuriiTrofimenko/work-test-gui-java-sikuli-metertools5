package org.tyaa.work.test.java.sikuli.metertools5.facades.stateful;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.facades.AbstractFacade;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/** Абстрактный класс-родитель классов фасадов, скрывающих детали взаимодействия с GUI,
 * когда пользователь открыл приложение с ранее сохраненным состоянием */
public abstract class AbstractStatefulFacade extends AbstractFacade {

    protected AbstractStatefulFacade(Screen screen) {
        super(screen);
    }
    @Override
    public AbstractFacade open() {
        try {
            this.openApp(() -> (new Button(screen, "light\\app-shortcut.png")).doubleClick());
        } catch (FindFailed | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}
