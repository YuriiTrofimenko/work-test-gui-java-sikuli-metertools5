package org.tyaa.work.test.java.sikuli.metertools5.views;

import org.tyaa.work.test.java.sikuli.metertools5.elements.ComboBox;
import org.tyaa.work.test.java.sikuli.metertools5.views.interfaces.IViewWithComboBox;

public abstract class AbstractViewWithComboBox implements IViewWithComboBox {

    private ComboBox comboBox;

    public AbstractViewWithComboBox(ComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public ComboBox getComboBox() {
        return comboBox;
    }

    public AbstractViewWithComboBox setComboBox(ComboBox comboBox) {
        this.comboBox = comboBox;
        return this;
    }
}
