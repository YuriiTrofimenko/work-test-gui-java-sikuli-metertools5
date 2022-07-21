package org.tyaa.work.test.java.sikuli.metertools5.utils;

import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IImagePathGetter;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;
/**
 * Реализация получения относительного пути к образцу изображения по тексту с этого образца
 * (с переменной реализацией механизма чтения данных, которая задаётся через аргумент конструктора)
 * */
public class ImagePathGetter implements IImagePathGetter {

    private final IPropsReader propsReader;
    private final IPropsReader localizedPropsReader;

    public ImagePathGetter(IPropsReader propsReader, IPropsReader localizedPropsReader) {
        this.propsReader = propsReader;
        this.localizedPropsReader = localizedPropsReader;
    }

    @Override
    public String getImagePathByKey(String key) {
        return String.format(
                "\\%s\\%s.png",
                Global.getTheme(),
                propsReader.getString(key)
        );
    }

    @Override
    public String getLocalizedImagePathByText(String text) {
        // в любой реализации словаря свойств в ключах недопустимы символы пробела,
        // поэтому пробелы из входного текста заменяются подчёркиваниями
        return String.format(
                "\\%s\\%s_%s.png",
                Global.getTheme(),
                localizedPropsReader.getString(text.replace(" ", "_")),
                Global.getLang()
        );
    }
}
