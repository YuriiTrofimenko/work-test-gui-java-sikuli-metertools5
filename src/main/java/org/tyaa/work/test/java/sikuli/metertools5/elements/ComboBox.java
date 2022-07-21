package org.tyaa.work.test.java.sikuli.metertools5.elements;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.elements.base.AbstractElement;
import org.tyaa.work.test.java.sikuli.metertools5.elements.interfaces.IClickable;
import org.tyaa.work.test.java.sikuli.metertools5.elements.interfaces.ICollapsable;
import org.tyaa.work.test.java.sikuli.metertools5.elements.interfaces.ISelectable;

/** Класс модели графического элемента "Выпадающий список" */
public class ComboBox extends AbstractElement implements IClickable, ISelectable, ICollapsable {

    private Boolean opened = Boolean.FALSE;

    public ComboBox(Screen screen, String sampleImagePath) throws FindFailed {
        super(screen, sampleImagePath);
    }

    public ComboBox(Screen screen, String sampleImagePath, Boolean opened) throws FindFailed {
        super(screen, sampleImagePath);
        setOpened(opened);
    }

    @Override
    public void click() throws FindFailed {
        // выпадающий список открывается и закрывается кликом по нему
        screen.click(sampleImagePath);
        // после клика состояние "открыт/закрыт" меняется на противоположное текущему
        setOpened(!isOpened());
    }

    /**
     * Не реализован: двойной клик не обрабатывается элементами типа ComboBox,
     * точнее, приводит к бесполезной последовательности открытия и мгновенного закрытия
     * */
    @Override
    public void doubleClick() throws FindFailed {}

    @Override
    public void selectItem(String itemSampleImagePath) throws FindFailed {
        // выбор пункта выпадающего списка выполняется кликом по нему
        screen.click(makeAbsoluteSampleImagePath(itemSampleImagePath));
        // после выбора пункта выпадающего списка список закрывается
        setOpened(false);
    }

    @Override
    public Boolean isOpened() {
        return opened;
    }

    private void setOpened(Boolean opened) {
        this.opened = opened;
    }
}
