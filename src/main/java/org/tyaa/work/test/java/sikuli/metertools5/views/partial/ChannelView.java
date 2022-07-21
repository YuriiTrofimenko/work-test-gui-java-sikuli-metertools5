package org.tyaa.work.test.java.sikuli.metertools5.views.partial;

import org.tyaa.work.test.java.sikuli.metertools5.elements.ComboBox;
import org.tyaa.work.test.java.sikuli.metertools5.views.base.AbstractViewWithComboBox;
import org.tyaa.work.test.java.sikuli.metertools5.views.partial.interfaces.IChannelView;

/** Модель частичного представления работы с каналами */
public class ChannelView extends AbstractViewWithComboBox implements IChannelView {

    public ChannelView(ComboBox comboBox) {
        super(comboBox);
    }
}
