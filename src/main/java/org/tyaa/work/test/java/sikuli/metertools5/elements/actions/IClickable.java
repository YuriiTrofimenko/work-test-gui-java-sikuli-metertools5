package org.tyaa.work.test.java.sikuli.metertools5.elements.actions;

import org.sikuli.script.FindFailed;
/** Интерфейс графического элемента, по которому можно кликать */
public interface IClickable {
    void click() throws FindFailed;
    void doubleClick() throws FindFailed;
}
