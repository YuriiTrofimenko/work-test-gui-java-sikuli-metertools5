package org.tyaa.work.test.java.sikuli.metertools5;

import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;
import org.tyaa.work.test.java.sikuli.metertools5.utils.LocalPropertiesFileReader;

/** Глобально доступные объекты */
public class Global {
    private static final IPropsReader propsReader = new LocalPropertiesFileReader();
    private static final Screen screen = new Screen();
    public static IPropsReader getPropsReader() {
        return propsReader;
    }
    public static Screen getScreen() {
        return screen;
    }
}
