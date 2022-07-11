package org.tyaa.work.test.java.sikuli.metertools5.elements;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;

import java.io.File;

/** Базовый класс модели графического элемента */
public abstract class AbstractElement {
    /** Контекст экрана */
    protected final Screen screen;
    /** Путь к образцу изображения элемента */
    protected final String sampleImagePath;
    /** Время по умолчанию ожидания появления элемента на экране */
    protected final Double defaultWaitForImage;
    /**
     * Создание модели графического элемента с параметрами
     * @param screen - контекст экрана
     * @param sampleImagePath - путь к образцу изображения элемента относительно каталога изображений
     */
    protected AbstractElement(Screen screen, String sampleImagePath) throws FindFailed {
        this.screen = screen;
        // формирование абсолютного пути к образцу изображения
        this.sampleImagePath =
                String.format(
                        "%s\\%s",
                        new File(Global.getPropsReader().getString(IPropsReader.BASE_IMAGES_PATH)).getAbsolutePath(),
                        sampleImagePath
                );
        // получение времени ожидания по умолчанию в секундах
        this.defaultWaitForImage =
                Global.getPropsReader().getDouble(IPropsReader.WAIT_FOR_IMAGE);
        // как только модель элемента создана, начинается отсчет времени defaultWaitForImage,
        // и если по его истечении элемент не найден - происходит выброс исключения FindFailed
        screen.wait(this.sampleImagePath, defaultWaitForImage);
    }
}
