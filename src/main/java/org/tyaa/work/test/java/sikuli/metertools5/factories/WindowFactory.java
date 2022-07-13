package org.tyaa.work.test.java.sikuli.metertools5.factories;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.elements.ComboBox;
import org.tyaa.work.test.java.sikuli.metertools5.views.ConnectionView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.ChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.DeviceView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IDeviceView;
import org.tyaa.work.test.java.sikuli.metertools5.windows.MainWindow;

/** Фабрика составных моделей окна приложения */
public class WindowFactory {

    /** Метод получения модели главного окна при первом открытии пользователем для элементарного Smoke-теста
     * (с пустыми моделями панелей Канал связи и Усройство) */
    public static MainWindow getInitialMainWindow(Screen screen) throws FindFailed {
        return new MainWindow(
                new Button(screen, "light\\main-window\\close-button.png"),
                new Button(screen, "light\\main-window\\maximize-button.png"),
                new ConnectionView(
                        new Button(screen, "light\\main-window\\connection-view\\connection-button_connect_disabled_ru-RU.png"),
                        new ChannelView(null) {},
                        new DeviceView(null) {}
                )
        );
    }

    /** Метод получения модели главного окна при первом открытии пользователем
     * (с моделями панелей Канал связи и Усройство в их исходном состоянии - ComboBox не установлены и свернуты) */
    public static MainWindow getInitialMainWindowWithChannelDeviceViews(Screen screen) throws FindFailed {
        MainWindow mainWindow = getInitialMainWindow(screen);
        mainWindow.getConnectionView()
                .setChannelView(
                        new ChannelView(
                                new ComboBox(screen, "\\light\\main-window\\connection-view\\channel-view\\channels-combo-box_unset_collapsed_ru-RU.png")
                        )
                ).setDeviceView(
                        new DeviceView(
                                new ComboBox(screen, "\\light\\main-window\\connection-view\\device-view\\devices-combo-box_unset_collapsed_ru-RU.png")
                        )
                );
        return mainWindow;
    }
}
