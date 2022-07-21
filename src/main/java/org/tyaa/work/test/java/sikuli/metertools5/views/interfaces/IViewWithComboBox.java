package org.tyaa.work.test.java.sikuli.metertools5.views.interfaces;

import org.sikuli.script.FindFailed;
import org.tyaa.work.test.java.sikuli.metertools5.elements.ComboBox;

public interface IViewWithComboBox {

    ComboBox comboBox = null;
    ComboBox getComboBox();

    IViewWithComboBox setComboBox(ComboBox comboBox);
    IViewWithComboBox toggleComboBox() throws FindFailed;
    IViewWithComboBox selectComboBoxItem(String itemSampleImagePath) throws FindFailed;
}
