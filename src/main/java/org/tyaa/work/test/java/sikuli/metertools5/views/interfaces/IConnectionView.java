package org.tyaa.work.test.java.sikuli.metertools5.views.interfaces;

import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.ChannelView;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.DeviceView;

/** Интерфейс модели корневого представления соединения/отключения */
public interface IConnectionView {
    Button getConnectionButton();

    IConnectionView setConnectionButton(Button connectionButton);

    ChannelView getChannelView();

    IConnectionView setChannelView(ChannelView channelView);

    DeviceView getDeviceView();

    IConnectionView setDeviceView(DeviceView deviceView);
}
