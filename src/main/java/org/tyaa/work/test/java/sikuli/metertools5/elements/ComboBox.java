package org.tyaa.work.test.java.sikuli.metertools5.elements;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.elements.actions.IClickable;

/** Базовый класс модели графического элемента "Кнопка" */
public class ComboBox extends AbstractElement implements IClickable {

    public ComboBox(Screen screen, String sampleImagePath) throws FindFailed {
        super(screen, sampleImagePath);
    }

    @Override
    public void click() throws FindFailed {
        screen.click(sampleImagePath);
    }

    /** Не реализован: двойной клик не обрабатывается элементами типа ComboBox */
    @Override
    public void doubleClick() throws FindFailed {}
}