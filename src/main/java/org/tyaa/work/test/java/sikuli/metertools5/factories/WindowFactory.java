package org.tyaa.work.test.java.sikuli.metertools5.factories;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.elements.ComboBox;
import org.tyaa.work.test.java.sikuli.metertools5.elements.StaticBlock;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;
import org.tyaa.work.test.java.sikuli.metertools5.views.ConnectionView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.ChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.DeviceView;
import org.tyaa.work.test.java.sikuli.metertools5.windows.MainWindow;

/** Фабрика составных моделей окна приложения */
public class WindowFactory {

    /**
     * Метод получения модели главного окна с пустыми моделями содержимого клиентской области
     * @param screen Контекст экрана
     * */
    public static MainWindow getMainWindowFrame(Screen screen) throws FindFailed {
        return new MainWindow(
                new StaticBlock(screen, Global.getImagePathGetter().getImagePathByKey(IPropsReader.WINDOW_TITLE_IMAGE_PATH)),
                new Button(screen, Global.getImagePathGetter().getImagePathByKey(IPropsReader.WINDOW_CLOSE_IMAGE_PATH)),
                new Button(screen, Global.getImagePathGetter().getImagePathByKey(IPropsReader.WINDOW_MAXIMIZE_IMAGE_PATH)),
                new ConnectionView(
                        new Button(screen, null),
                        new ChannelView(null) {
                        },
                        new DeviceView(null) {
                        }
                )
        );
    }

    /**
     * Метод получения модели главного окна только с моделью кнопки подключения
     * @param screen Контекст экрана
     * */
    public static MainWindow getMainWindowWithConnectionButton(Screen screen, String connectionButtonText) throws FindFailed {
        MainWindow mainWindow = getMainWindowFrame(screen);
        mainWindow.getConnectionView().setConnectionButton(new Button(
                screen,
                Global.getImagePathGetter().getLocalizedImagePathByText(connectionButtonText)
        ));
        return mainWindow;
    }

    /**
     * Метод получения модели главного окна только с моделями панелей Канал связи и Усройство,
     * содержащими только свёрнутые ComboBox
     * @param screen Контекст экрана
     * @param selectedChannelText Текст выбранного пункта выпадалющего списка типа канала связи
     * @param selectedDeviceText Текст выбранного пункта выпадалющего списка типа устройства
     * */
    public static MainWindow getMainWindowWithChannelAndDeviceComboBoxes(
            Screen screen,
            String selectedChannelText,
            String selectedDeviceText
    ) throws FindFailed {
        MainWindow mainWindow = getMainWindowFrame(screen);
        String selectedChannelSampleImagePath =
                selectedChannelText != null
                        ? Global.getImagePathGetter().getLocalizedImagePathByText(selectedChannelText)
                        : null;
        String selectedDeviceSampleImagePath =
                selectedDeviceText != null
                        ? Global.getImagePathGetter().getLocalizedImagePathByText(selectedDeviceText)
                        : null;
        mainWindow.getConnectionView()
                .setChannelView(
                        new ChannelView(
                                new ComboBox(screen, selectedChannelSampleImagePath)
                        )
                ).setDeviceView(
                        new DeviceView(
                                new ComboBox(screen, selectedDeviceSampleImagePath)
                        )
                );
        return mainWindow;
    }
}
