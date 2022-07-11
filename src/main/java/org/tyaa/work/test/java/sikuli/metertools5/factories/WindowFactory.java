package org.tyaa.work.test.java.sikuli.metertools5.factories;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.views.ConnectionView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IDeviceView;
import org.tyaa.work.test.java.sikuli.metertools5.windows.MainWindow;

/** Фабрика составных моделей окна приложения */
public class WindowFactory {

    /** Метод получения модели главного окна при первом открытии пользователем для элементарного Smoke-теста */
    public static MainWindow getInitialMainWindow(Screen screen) throws FindFailed {
        return new MainWindow(
                new Button(screen, "light\\main-window\\close-button.png"),
                new Button(screen, "light\\main-window\\maximize-button.png"),
                new ConnectionView(
                        new Button(screen, "light\\main-window\\connection-view\\connection-button_connect_disabled_ru-RU.png"),
                        new IChannelView() {},
                        new IDeviceView() {}
                )
        );
    }
}
