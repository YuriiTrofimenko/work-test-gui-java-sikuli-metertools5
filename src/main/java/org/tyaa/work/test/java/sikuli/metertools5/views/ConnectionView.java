package org.tyaa.work.test.java.sikuli.metertools5.views;

import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.views.interfaces.IConnectionView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.ChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.DeviceView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IDeviceView;

/** Модель корневого представления соединения/отключения */
public class ConnectionView implements IConnectionView {
    /** Кнопка соединения/отключения */
    private Button connectionButton;
    /** Представление панели типов подключений */
    private ChannelView channelView;
    /** Представление панели типов устройств */
    private DeviceView deviceView;
    /**
     * Создание модели корневого представления соединения с параметрами
     * @param connectionButton - кнопка соединения/отключения
     * @param channelView - представление панели типов подключений
     * @param deviceView - представление панели типов устройств
     */
    public ConnectionView(Button connectionButton, ChannelView channelView, DeviceView deviceView) {
        this.connectionButton = connectionButton;
        this.channelView = channelView;
        this.deviceView = deviceView;
    }

    public Button getConnectionButton() {
        return connectionButton;
    }

    public IConnectionView setConnectionButton(Button connectionButton) {
        this.connectionButton = connectionButton;
        return this;
    }

    public ChannelView getChannelView() {
        return channelView;
    }

    public IConnectionView setChannelView(ChannelView channelView) {
        this.channelView = channelView;
        return this;
    }

    public DeviceView getDeviceView() {
        return deviceView;
    }

    public IConnectionView setDeviceView(DeviceView deviceView) {
        this.deviceView = deviceView;
        return this;
    }
}
