package org.tyaa.work.test.java.sikuli.metertools5.views.base;

import org.sikuli.script.FindFailed;
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

    @Override
    public IViewWithComboBox toggleComboBox() throws FindFailed {
        this.comboBox.click();
        return this;
    }

    @Override
    public IViewWithComboBox selectComboBoxItem(String itemSampleImagePath) throws FindFailed {
        if (!this.comboBox.isOpened()) {
            toggleComboBox();
        }
        System.err.println();
        this.comboBox.selectItem(itemSampleImagePath);
        return this;
    }
}
