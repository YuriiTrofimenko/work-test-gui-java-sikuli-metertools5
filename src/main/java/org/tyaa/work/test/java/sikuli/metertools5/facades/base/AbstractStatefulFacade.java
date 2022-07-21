package org.tyaa.work.test.java.sikuli.metertools5.facades.base;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;

/** Абстрактный класс-родитель классов фасадов, скрывающих детали взаимодействия с GUI,
 * когда пользователь открыл приложение с ранее сохраненным состоянием */
public abstract class AbstractStatefulFacade extends AbstractFacade {

    protected AbstractStatefulFacade(Screen screen) {
        super(screen);
    }
    @Override
    public AbstractFacade open() {
        try {
            // реализация запуска приложения двойным кликом по ярлыку на рабочем столе ОС
            this.openApp(() -> (
                    new Button(
                            screen,
                            Global.getImagePathGetter().getImagePathByKey(IPropsReader.APP_SHORTCUT_IMAGE_PATH)
                    )
            ).doubleClick());
        } catch (FindFailed | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}
