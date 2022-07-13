package org.tyaa.work.test.java.sikuli.metertools5.views.interfaces;

import org.tyaa.work.test.java.sikuli.metertools5.elements.ComboBox;

public interface IViewWithComboBox {

    ComboBox comboBox = null;

    public ComboBox getComboBox();

    public IViewWithComboBox setComboBox(ComboBox comboBox);
}
