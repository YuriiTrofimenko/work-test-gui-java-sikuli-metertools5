package org.tyaa.work.test.java.sikuli.metertools5.views.partial;

import org.tyaa.work.test.java.sikuli.metertools5.elements.ComboBox;
import org.tyaa.work.test.java.sikuli.metertools5.views.base.AbstractViewWithComboBox;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IDeviceView;

/** Модель частичного представления работы с устройствами */
public class DeviceView extends AbstractViewWithComboBox implements IDeviceView {
    public DeviceView(ComboBox comboBox) {
        super(comboBox);
    }
}
