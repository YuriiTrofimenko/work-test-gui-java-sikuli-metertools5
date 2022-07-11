package org.tyaa.work.test.java.sikuli.metertools5.views.interfaces;

import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IDeviceView;

/** Интерфейс модели корневого представления соединения/отключения */
public interface IConnectionView {
    Button getConnectionButton();

    void setConnectionButton(Button connectionButton);

    IChannelView getChannelView();

    void setChannelView(IChannelView channelView);

    IDeviceView getDeviceView();

    void setDeviceView(IDeviceView deviceView);
}
