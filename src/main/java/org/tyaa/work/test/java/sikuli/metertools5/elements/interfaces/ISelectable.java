package org.tyaa.work.test.java.sikuli.metertools5.elements.interfaces;

import org.sikuli.script.FindFailed;

/** Интерфейс графического элемента, у которого можно выбрать один из пунктов списка */
public interface ISelectable {
    void selectItem(String sampleImagePath) throws FindFailed;
}
