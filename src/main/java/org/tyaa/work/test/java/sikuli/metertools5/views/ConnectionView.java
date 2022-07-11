package org.tyaa.work.test.java.sikuli.metertools5.views;

import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.views.interfaces.IConnectionView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IDeviceView;

/** Модель корневого представления соединения/отключения */
public class ConnectionView implements IConnectionView {
    /** Кнопка соединения/отключения */
    private Button connectionButton;
    /** Представление панели типов подключений */
    private IChannelView channelView;
    /** Представление панели типов устройств */
    private IDeviceView deviceView;
    /**
     * Создание модели корневого представления соединения с параметрами
     * @param connectionButton - кнопка соединения/отключения
     * @param channelView - представление панели типов подключений
     * @param deviceView - представление панели типов устройств
     */
    public ConnectionView(Button connectionButton, IChannelView channelView, IDeviceView deviceView) {
        this.connectionButton = connectionButton;
        this.channelView = channelView;
        this.deviceView = deviceView;
    }

    public Button getConnectionButton() {
        return connectionButton;
    }

    public void setConnectionButton(Button connectionButton) {
        this.connectionButton = connectionButton;
    }

    public IChannelView getChannelView() {
        return channelView;
    }

    public void setChannelView(IChannelView channelView) {
        this.channelView = channelView;
    }

    public IDeviceView getDeviceView() {
        return deviceView;
    }

    public void setDeviceView(IDeviceView deviceView) {
        this.deviceView = deviceView;
    }
}
