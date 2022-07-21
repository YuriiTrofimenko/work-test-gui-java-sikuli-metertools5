package org.tyaa.work.test.java.sikuli.metertools5.facades.connection;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.facades.base.AbstractStatefulFacade;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;
import org.tyaa.work.test.java.sikuli.metertools5.windows.MainWindow;

/**
 * Класс фасада, скрывающего детали взаимодействия с GUI при тесте панели канала связи
 * */
public class ChannelPanelFacade extends AbstractStatefulFacade {

    public ChannelPanelFacade(Screen screen) {
        super(screen);
    }

    public ChannelPanelFacade checkChannelComboBox(String selectedItemText, ValueWrapper<Boolean> channelComboBoxExists) {
        try {
            channelComboBoxExists.value =
                    WindowFactory.getMainWindowWithChannelAndDeviceComboBoxes(
                            screen,
                            selectedItemText,
                            null
                    ).getConnectionView().getChannelView().getComboBox() != null;
        } catch (FindFailed e) {
            channelComboBoxExists.value = false;
        }
        return this;
    }
    public ChannelPanelFacade selectChannelComboBoxItem(String selectedItemText, String targetItemText) throws FindFailed {
        MainWindow mainWindow = WindowFactory.getMainWindowWithChannelAndDeviceComboBoxes(
                screen,
                selectedItemText,
                null
        );
        mainWindow.getConnectionView().getChannelView().selectComboBoxItem(
                Global.getImagePathGetter().getLocalizedImagePathByText(targetItemText)
        );
        return this;
    }
}
