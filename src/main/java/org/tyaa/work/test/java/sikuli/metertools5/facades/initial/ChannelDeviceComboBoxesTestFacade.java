package org.tyaa.work.test.java.sikuli.metertools5.facades.initial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.facades.AbstractFacade;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/** Класс фасада, скрывающего детали взаимодействия с GUI при тесте выпадающих списков Тип соединения и Тип устройства */
public class ChannelDeviceComboBoxesTestFacade extends AbstractInitialFacade {

    public ChannelDeviceComboBoxesTestFacade(Screen screen) {
        super(screen);
    }

    public ChannelDeviceComboBoxesTestFacade checkChannelComboBox(ValueWrapper<Boolean> channelComboBoxExists) {
        try {
            channelComboBoxExists.value =
                WindowFactory.getInitialMainWindowWithChannelDeviceViews(screen).getConnectionView().getChannelView().getComboBox() != null;
        } catch (FindFailed e) {
            channelComboBoxExists.value = false;
        }
        return this;
    }

    public ChannelDeviceComboBoxesTestFacade checkDeviceComboBox(ValueWrapper<Boolean> deviceComboBoxExists) {
        try {
            deviceComboBoxExists.value =
                    WindowFactory.getInitialMainWindowWithChannelDeviceViews(screen).getConnectionView().getDeviceView().getComboBox() != null;
        } catch (FindFailed e) {
            deviceComboBoxExists.value = false;
        }
        return this;
    }
}
