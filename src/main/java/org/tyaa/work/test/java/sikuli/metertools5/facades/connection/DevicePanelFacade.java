package org.tyaa.work.test.java.sikuli.metertools5.facades.connection;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.facades.base.AbstractStatefulFacade;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;
import org.tyaa.work.test.java.sikuli.metertools5.windows.MainWindow;

/**
 * Класс фасада, скрывающего детали взаимодействия с GUI при тесте панели устройства
 * */
public class DevicePanelFacade extends AbstractStatefulFacade {

    public DevicePanelFacade(Screen screen) {
        super(screen);
    }

    public DevicePanelFacade checkDeviceComboBox(String selectedItemText, ValueWrapper<Boolean> deviceComboBoxExists) {
        try {
            deviceComboBoxExists.value =
                    WindowFactory.getMainWindowWithChannelAndDeviceComboBoxes(
                            screen,
                            null,
                            selectedItemText
                    ).getConnectionView().getDeviceView().getComboBox() != null;
        } catch (FindFailed e) {
            deviceComboBoxExists.value = false;
        }
        return this;
    }

    public DevicePanelFacade selectDeviceComboBoxItem(String selectedItemText, String targetItemText) throws FindFailed {
        MainWindow mainWindow = WindowFactory.getMainWindowWithChannelAndDeviceComboBoxes(
                screen,
                null,
                selectedItemText
        );
        mainWindow.getConnectionView().getDeviceView().selectComboBoxItem(
                Global.getImagePathGetter().getLocalizedImagePathByText(targetItemText)
        );
        return this;
    }
}
